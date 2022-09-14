package com.desafio.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.dto.veterinario.ConsultaVeterinarioDTO;
import com.desafio.dto.veterinario.RegistroVeterinarioDTO;
import com.desafio.dto.veterinario.VeterinarioMapper;
import com.desafio.entities.Veterinario;
import com.desafio.service.VeterinarioService;

@RestController
@RequestMapping("v1/veterinario")
public class VeterinarioController {
	
	@Autowired
	private VeterinarioService veterinarioService;
	
	@GetMapping
	public ResponseEntity<Page<ConsultaVeterinarioDTO>> buscarTodosOsVeterinarios(@PageableDefault Pageable pageable){
		
		return ResponseEntity.ok(veterinarioService.listarTodosOsVeterinarios(pageable).map(VeterinarioMapper::fromEntity));		
			
		
	}
	
	@PostMapping
	public ResponseEntity<ConsultaVeterinarioDTO> salvarVeterinario (@RequestBody RegistroVeterinarioDTO dto){
		
		Veterinario veterinario = veterinarioService.salvarVeterinario(VeterinarioMapper.fromDTO(dto));
		
		return ResponseEntity.ok(VeterinarioMapper.fromEntity(veterinario));
		
	}
	
	@GetMapping("{id}") 
	public ResponseEntity<ConsultaVeterinarioDTO> buscarVeterinario(@PathVariable Long id){

		Veterinario veterinario = veterinarioService.buscarVeterinario(id);
		
		return ResponseEntity.ok(VeterinarioMapper.fromEntity(veterinario));
		
		
	}
	
	@PutMapping("{id}")
	public ResponseEntity<ConsultaVeterinarioDTO> alterarVeterinario(@RequestBody RegistroVeterinarioDTO dto,
			@PathVariable Long id){
		
		try {
		
			Veterinario veterinario = veterinarioService.atualizarVeterinario(VeterinarioMapper.fromDTO(dto), id);
			
			return ResponseEntity.ok(VeterinarioMapper.fromEntity(veterinario));
		}catch(RuntimeException ex) {
			return ResponseEntity.notFound().build();
		}
		
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<ConsultaVeterinarioDTO> excluirVeterinario(@PathVariable Long id){
		
		try {
			veterinarioService.excluirVeterinario(id);
			
			return ResponseEntity.ok().build();
		}catch(RuntimeException ex) {
			return ResponseEntity.notFound().build();
		}
		
	}


}
