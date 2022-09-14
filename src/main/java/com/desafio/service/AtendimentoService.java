package com.desafio.service;

import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.desafio.entities.Atendimento;
import com.desafio.repositories.AtendimentoRepository;

@Service
public class AtendimentoService {

	
	private final AtendimentoRepository atendimentoRepository;
	
	

	public AtendimentoService(AtendimentoRepository atendimentoRepository) {
		super();
		this.atendimentoRepository = atendimentoRepository;
	
	}

	public Atendimento salvarAtendimento(Atendimento atendimento) {
		
		/*
		SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date now = new Date();
	    String strDate = sdfDate.format(now);
	    
	    atendimento.setDataHoraAtendimento(strDate);
	    */
		
		return atendimentoRepository.save(atendimento);
	}

	public Page<Atendimento> listarTodosOsAtendimentos(Pageable pageable) {
		return atendimentoRepository.findAll(pageable);
	}

	public Atendimento buscarAtendimento(Long id) {
		Optional<Atendimento> optional = atendimentoRepository.findById(id);

		return optional.orElseThrow(() -> new EntityNotFoundException("Atendimento não encontrado"));

	}

	public Atendimento atualizarAtendimento(Atendimento atendimento, Long id) {

		Atendimento atendimentoOriginal = this.buscarAtendimento(id);

		atendimento.setId(atendimentoOriginal.getId());

		return atendimentoRepository.save(atendimento);

	}

	public void excluirAtendimento(Long id) {
		Atendimento atendimentoOriginal = this.buscarAtendimento(id);
		
		atendimentoRepository.delete(atendimentoOriginal);

	}
	
	public Page<Atendimento> buscarOCachorroNoAtendimento(Long id, Pageable pageable){
		return atendimentoRepository.findByCachorroIdContains(id, pageable);
	}
	
	public Page<Atendimento> buscarOVeterinarioNoAtendimento(Long id, Pageable pageable){
		return atendimentoRepository.findByVeterinarioIdContains(id, pageable);
	}

}
