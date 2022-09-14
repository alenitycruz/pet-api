package com.desafio.repositories;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desafio.entities.Tutor;

@Repository
public interface TutorRepository extends JpaRepository<Tutor, Long> {

	Page<Tutor> findAll(Pageable pageable);
	
	Optional<Tutor> findByNome(String nome);
}
