package com.desafio.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desafio.entities.Veterinario;

@Repository
public interface VeterinarioRepository extends JpaRepository<Veterinario, Long>{
	
	Page<Veterinario> findAll(Pageable pageable);

}
