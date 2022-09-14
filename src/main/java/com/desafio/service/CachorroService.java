package com.desafio.service;

import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.desafio.entities.Cachorro;
import com.desafio.repositories.CachorroRepository;

@Service
public class CachorroService {

	@Autowired
	private CachorroRepository cachorroRepository;

	public Cachorro salvarCachorro(Cachorro cachorro) {
		return cachorroRepository.save(cachorro);
	}

	public Page<Cachorro> listarTodosOsCachorros(Pageable pageable) {
		return cachorroRepository.findAll(pageable);
	}

	public Cachorro buscarCachorro(Long id) {
		Optional<Cachorro> optional = cachorroRepository.findById(id);

		return optional.orElseThrow(() -> new EntityNotFoundException("Cachorro não encontrado"));

	}
	

	public Cachorro atualizarCachorro(Cachorro cachorro, Long id) {

		Cachorro cachorroOriginal = this.buscarCachorro(id);

		cachorro.setId(cachorroOriginal.getId());

		return cachorroRepository.save(cachorro);

	}

	public void excluirCachorro(Long id) {
		Cachorro cachorroOriginal = this.buscarCachorro(id);

		cachorroRepository.delete(cachorroOriginal);
	}

	
	public Page<Cachorro> buscarOTutorDoCachorro(String nome, Pageable pageable){
		return cachorroRepository.findByTutorNomeContains(nome, pageable);
	}
}
