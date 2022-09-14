package com.desafio.dto.tutor;

import com.desafio.dto.endereco.EnderecoDTO;


public class ConsultaTutorDTO {
	
	private Long id;
	
	private String nome;

	private String identidade;

	private EnderecoDTO endereco;

	
	public ConsultaTutorDTO() {

	}

	public ConsultaTutorDTO(Long id, String nome, String identidade, EnderecoDTO endereco) {

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


	public EnderecoDTO getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoDTO endereco) {
		this.endereco = endereco;
	}

}
