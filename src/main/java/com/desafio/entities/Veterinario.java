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
@Table(name = "tb_veterinario")
public class Veterinario {
	

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "veterinario_id") 
	private Long id;
	
	@Column(name = "veterinario") 
	private String nome;
	
	@Column(name = "crmv") @Size(max = 7) 
	private String licensa;
	
	@Embedded
	private Endereco endereco;
	

	
	public Veterinario() {

	}	

	public Veterinario(Long id, String nome, @Size(max = 7) String licensa,
			Endereco endereco) {
		this.id = id;
		this.nome = nome;
		this.licensa = licensa;
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

	public String getLicensa() {
		return licensa;
	}

	public void setLicensa(String licensa) {
		this.licensa = licensa;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}



}
