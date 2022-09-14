package com.desafio.service;

import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.desafio.entities.Veterinario;
import com.desafio.repositories.VeterinarioRepository;

@Service
public class VeterinarioService {

	@Autowired
	private VeterinarioRepository veterinarioRepository;

	public Veterinario salvarVeterinario(Veterinario veterinario) {
		return veterinarioRepository.save(veterinario);
	}

	public Page<Veterinario> listarTodosOsVeterinarios(Pageable pageable) {
		return veterinarioRepository.findAll(pageable);
	}

	public Veterinario buscarVeterinario(Long id) {
		Optional<Veterinario> optional = veterinarioRepository.findById(id);

		return optional.orElseThrow(() -> new EntityNotFoundException("Veterinario não encontrado"));

	}

	public Veterinario atualizarVeterinario(Veterinario veterinario, Long id) {

		Veterinario veterinarioOriginal = this.buscarVeterinario(id);

		veterinario.setId(veterinarioOriginal.getId());

		return veterinarioRepository.save(veterinario);

	}

	public void excluirVeterinario(Long id) {
		Veterinario veterinarioOriginal = this.buscarVeterinario(id);

		veterinarioRepository.delete(veterinarioOriginal);

	}

}
