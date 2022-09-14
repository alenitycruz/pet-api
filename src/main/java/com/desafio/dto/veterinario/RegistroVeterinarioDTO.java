package com.desafio.dto.veterinario;

import com.desafio.dto.endereco.EnderecoDTO;

public class RegistroVeterinarioDTO {
	
	private String nome;
	
	private String licensa;

	private EnderecoDTO endereco;
	
	
	public RegistroVeterinarioDTO() {

	}

	

	public RegistroVeterinarioDTO(String nome, String licensa, EnderecoDTO endereco) {

		this.nome = nome;
		this.licensa = licensa;
		this.endereco = endereco;
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
