package com.desafio.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desafio.entities.Atendimento;

@Repository
public interface AtendimentoRepository extends JpaRepository<Atendimento, Long> {
	
	Page<Atendimento> findAll(Pageable pageable);
	
	Page<Atendimento> findByVeterinarioIdContains(Long id, Pageable pageable);
	
	Page<Atendimento> findByCachorroIdContains(Long id, Pageable pageable);
	

}
