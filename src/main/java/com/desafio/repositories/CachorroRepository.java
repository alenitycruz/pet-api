package com.desafio.repositories;


import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desafio.entities.Cachorro;

@Repository
public interface CachorroRepository extends JpaRepository<Cachorro, Long> {
	
	Page<Cachorro> findAll(Pageable pageable);
	Page<Cachorro> findByTutorNomeContains(String nome, Pageable pageable);
	
	Optional<Cachorro> findByNome(String nome);
	
	

}
