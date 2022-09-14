package com.desafio.dto.tutor;

import com.desafio.dto.endereco.EnderecoDTO;

public class RegistroTutorDTO {

	private String nome;

	private String identidade;

	private EnderecoDTO endereco;


	
	public RegistroTutorDTO() {

	}

	public RegistroTutorDTO(String nome, String identidade, EnderecoDTO endereco) {

		this.nome = nome;
		this.identidade = identidade;
		this.endereco = endereco;
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
