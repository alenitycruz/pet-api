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

import com.desafio.dto.cachorro.CachorroMapper;
import com.desafio.dto.cachorro.ConsultaCachorroDTO;
import com.desafio.dto.cachorro.RegistroCachorroDTO;
import com.desafio.entities.Cachorro;
import com.desafio.service.CachorroService;

@RestController
@RequestMapping("v1/cachorro")
public class CachorroController {
	
	@Autowired
	private CachorroService cachorroService;
	
	
	@GetMapping
	public ResponseEntity<Page<ConsultaCachorroDTO>> buscarTodosOsCachorro(@PageableDefault Pageable pageable){
		
		return ResponseEntity.ok(cachorroService.listarTodosOsCachorros(pageable).map(CachorroMapper::fromEntity));		
			
		
	}
	
	@PostMapping
	public ResponseEntity<ConsultaCachorroDTO> salvarCachorro (@RequestBody RegistroCachorroDTO dto){
		
		Cachorro cachorro = cachorroService.salvarCachorro(CachorroMapper.fromDTO(dto));
		
		return ResponseEntity.ok(CachorroMapper.fromEntity(cachorro));
	}
	
	@GetMapping("{id}") 
	public ResponseEntity<ConsultaCachorroDTO> buscarCachorro(@PathVariable Long id){

		Cachorro cachorro = cachorroService.buscarCachorro(id);
		
		return ResponseEntity.ok(CachorroMapper.fromEntity(cachorro));
		
		
	}
	
	@PutMapping("{id}") 
	public ResponseEntity<ConsultaCachorroDTO> alterarCachorro(@RequestBody RegistroCachorroDTO dto,
			@PathVariable Long id){
		
		try {
		
			Cachorro cachorro = cachorroService.atualizarCachorro(CachorroMapper.fromDTO(dto), id);
			
			return ResponseEntity.ok(CachorroMapper.fromEntity(cachorro));
		}catch(RuntimeException ex) {
			return ResponseEntity.notFound().build();
		}
		
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<ConsultaCachorroDTO> excluirCachorro(@PathVariable Long id){
		
		try {
			cachorroService.excluirCachorro(id);
			
			return ResponseEntity.ok().build();
		}catch(RuntimeException ex) {
			return ResponseEntity.notFound().build();
		}
		
	}
	
	@GetMapping("/tutor/{nome}")
	public ResponseEntity<Page<Cachorro>> buscarCachorroComTutor(@PageableDefault Pageable pageable, @PathVariable String nome){
			return ResponseEntity.ok(cachorroService.buscarOTutorDoCachorro(nome, pageable));
		}



}
