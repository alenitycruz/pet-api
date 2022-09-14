package com.desafio.service;

import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.desafio.entities.Tutor;
import com.desafio.repositories.TutorRepository;

@Service
public class TutorService {
	
	@Autowired
	private TutorRepository tutorRepository;
	
	public Tutor salvarTutor(Tutor tutor) {
		return tutorRepository.save(tutor);
		
	}
	
	public Page<Tutor> listarTodosOsTutores(Pageable pageable){
		return tutorRepository.findAll(pageable);
	}
	
	public Tutor buscarTutor(Long id) {
		Optional<Tutor> optional = tutorRepository.findById(id);
		
		return optional.orElseThrow(() -> new EntityNotFoundException("Tutor não encontrado") );
		
	}
	
	public Tutor atualizarTutor(Tutor tutor, Long id) {
		
		Tutor tutorOriginal = this.buscarTutor(id);
		
		tutor.setId(tutorOriginal.getId());
		
		return tutorRepository.save(tutor);
		
	}

	public void excluirTutor(Long id) {
		Tutor tutorOriginal = this.buscarTutor(id);
		
		tutorRepository.delete(tutorOriginal);
}



}
