package com.desafio.dto.cachorro;

import com.desafio.entities.Tutor;

public class RegistroCachorroDTO {
	
	private String nome;

	private String raca;

	private String caracteristica;

	private String dataNascimento;

	private String tamanho;

	private Tutor tutor;

	public RegistroCachorroDTO() {

	}

	public RegistroCachorroDTO(String nome, String raca, String caracteristica, String dataNascimento, String tamanho,
			Tutor tutor) {
		super();
		this.nome = nome;
		this.raca = raca;
		this.caracteristica = caracteristica;
		this.dataNascimento = dataNascimento;
		this.tamanho = tamanho;
		this.tutor = tutor;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public Tutor getTutor() {
		return tutor;
	}

	public void setTutor(Tutor tutor) {
		this.tutor = tutor;
	}

	
}
