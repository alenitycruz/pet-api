package com.desafio.dto.veterinario;

import com.desafio.dto.endereco.EnderecoDTO;

public class ConsultaVeterinarioDTO {
	
	private Long id;
	
	private String nome;
	
	private String licensa;

	private EnderecoDTO endereco;
	

	
	public ConsultaVeterinarioDTO() {

	}

	public ConsultaVeterinarioDTO(Long id, String nome, String licensa, EnderecoDTO endereco) {
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

	public EnderecoDTO getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoDTO endereco) {
		this.endereco = endereco;
	}


	
	

}
