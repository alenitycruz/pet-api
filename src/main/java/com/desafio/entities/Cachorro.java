package com.desafio.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cachorro")
public class Cachorro {
	

	@Id
	@Column(name="cachorro_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "raca")
	private String raca;
	
	@Column(name = "caracteristica")
	private String caracteristica;
	
	@Column(name = "data_nascimento")
	private String dataNascimento;
	
	@Column(name = "tamanho")
	private String tamanho;
	
	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
	@JoinColumn(name = "tutor_id" ) 
	private Tutor tutor;
	

	public Cachorro() {

	}



	public Cachorro(Long id, String nome,  String raca, String caracteristica,
			 String dataNascimento,  String tamanho, Tutor tutor) {
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

	public Tutor getTutor() {
		return tutor;
	}

	public void setTutor(Tutor tutor) {
		this.tutor = tutor;
	}

	
	
	
	
	
}
