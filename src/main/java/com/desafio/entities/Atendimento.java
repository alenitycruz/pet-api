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

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table(name = "atendimento")
public class Atendimento  {
	
	

	@Id
	@Column(name="atendimento_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY) 
	@JoinColumn(name = "veterinario_id") @JsonIgnore
	private Veterinario veterinario;
	
	@ManyToOne(cascade = CascadeType.REFRESH) 
	@JoinColumn(name = "cachorro_id") @JsonIgnore
	private Cachorro cachorro;
	
	@Column(name = "data_hora_atendimento") 
	private String dataHoraAtendimento;
	
	@Column(name = "queixa") 
	private String queixa;
	
	@Column(name = "diagnostico") 
	private String diagnostico;
	
	@Column(name = "comentario") 
	private String comentario;
	
	public Atendimento() {

	}

	public Atendimento(Long id, Veterinario veterinario, Cachorro cachorro,
			String dataHoraAtendimento, String queixa, String diagnostico,
			String comentario) {

		this.id = id;
		this.veterinario = veterinario;
		this.cachorro = cachorro;
		this.dataHoraAtendimento = dataHoraAtendimento;
		this.queixa = queixa;
		this.diagnostico = diagnostico;
		this.comentario = comentario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Veterinario getVeterinario() {
		return veterinario;
	}

	public void setVeterinario(Veterinario veterinario) {
		this.veterinario = veterinario;
	}

	public Cachorro getCachorro() {
		return cachorro;
	}

	public void setCachorro(Cachorro cachorro) {
		this.cachorro = cachorro;
	}

	
	public String getDataHoraAtendimento() {
		return dataHoraAtendimento;
	}

	public void setDataHoraAtendimento(String dataHoraAtendimento) {
		this.dataHoraAtendimento = dataHoraAtendimento;
	}

	public String getQueixa() {
		return queixa;
	}

	public void setQueixa(String queixa) {
		this.queixa = queixa;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	
	

}
