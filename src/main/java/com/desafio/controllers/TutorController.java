 package com.desafio.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.dto.tutor.ConsultaTutorDTO;
import com.desafio.dto.tutor.RegistroTutorDTO;
import com.desafio.dto.tutor.TutorMapper;
import com.desafio.entities.Tutor;
import com.desafio.service.TutorService;

@RestController
@RequestMapping("v1/tutor")
public class TutorController {
	
	@Autowired
	private TutorService tutorService;
	
	@GetMapping
	public ResponseEntity<Page<ConsultaTutorDTO>> buscarTodosOsTutores(@PageableDefault Pageable pageable){
		
		return ResponseEntity.ok(tutorService.listarTodosOsTutores(pageable).map(TutorMapper::fromEntity));		
			
		
	}
	
	@PostMapping
	public ResponseEntity<ConsultaTutorDTO> salvarTutor (@RequestBody RegistroTutorDTO dto){
		
		return ResponseEntity.status(HttpStatus.CREATED).body(TutorMapper.fromEntity(tutorService.salvarTutor(TutorMapper.fromDTO(dto))));
	
		
	}
	
	@GetMapping("{id}") 
	public ResponseEntity<ConsultaTutorDTO> buscarTutor(@PathVariable Long id){

		Tutor tutor = tutorService.buscarTutor(id);
		
		return ResponseEntity.ok(TutorMapper.fromEntity(tutor));
		
		
	}
	
	@PutMapping("{id}")
	public ResponseEntity<ConsultaTutorDTO> alterarTutor(@RequestBody RegistroTutorDTO dto,
			@PathVariable Long id){
		
		try {
		
			Tutor tutor = tutorService.atualizarTutor(TutorMapper.fromDTO(dto), id);
			
			return ResponseEntity.ok(TutorMapper.fromEntity(tutor));
		}catch(RuntimeException ex) {
			return ResponseEntity.notFound().build();
		}
		
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<ConsultaTutorDTO> excluirTutor(@PathVariable Long id){
		
		try {
			tutorService.excluirTutor(id);
			
			return ResponseEntity.ok().build();
		}catch(RuntimeException ex) {
			return ResponseEntity.notFound().build();
		}
		
	}


}
