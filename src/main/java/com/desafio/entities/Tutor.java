package com.desafio.entities;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_tutor")
public class Tutor {
	

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "tutor_id") 
	private Long id;
	
	@Column(name = "nome") 
	private String nome;
	
	@Column(name = "cpf", unique = true) @Size(max = 11) 
	private String identidade;
	
	@Embedded
	private Endereco endereco;
	
	

	
	public Tutor() {

	}


	public Tutor( Long id, String nome, @Size(max = 11) String identidade,
			Endereco endereco) {

		this.id = id;
		this.nome = nome;
		this.identidade = identidade;
		this.endereco = endereco;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdentidade() {
		return identidade;
	}

	public void setIdentidade(String identidade) {
		this.identidade = identidade;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	
	

}
