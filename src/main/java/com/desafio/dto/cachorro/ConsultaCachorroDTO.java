package com.desafio.dto.cachorro;

import com.desafio.dto.tutor.ConsultaTutorDTO;

public class ConsultaCachorroDTO {
	
	private Long id;

	private String nome;

	private String raca;

	private String caracteristica;

	private String dataNascimento;

	private String tamanho;

	private ConsultaTutorDTO tutor;
	
	public ConsultaCachorroDTO() {

	}

	

	public ConsultaCachorroDTO(Long id, String nome, String raca, String caracteristica, String dataNascimento,
			String tamanho, ConsultaTutorDTO tutor) {
		super();
		this.id = id;
		this.nome = nome;
		this.raca = raca;
		this.caracteristica = caracteristica;
		this.dataNascimento = dataNascimento;
		this.tamanho = tamanho;
		this.tutor = tutor;
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
	
	public ConsultaTutorDTO getTutor() {
		return tutor;
	}

	public void setTutor(ConsultaTutorDTO tutor) {
		this.tutor = tutor;
	}

	
	

}
