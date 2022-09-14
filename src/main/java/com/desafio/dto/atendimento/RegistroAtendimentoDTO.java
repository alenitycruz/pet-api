package com.desafio.dto.atendimento;

import com.desafio.entities.Cachorro;
import com.desafio.entities.Veterinario;

public class RegistroAtendimentoDTO {
	
	private Veterinario veterinario;

	private Cachorro cachorro;

	private String dataHoraAtendimento;

	private String queixa;

	private String diagnostico;

	private String comentario;
	

	public RegistroAtendimentoDTO() {

	}

	public RegistroAtendimentoDTO(Veterinario veterinario, Cachorro cachorro,
			String dataHoraAtendimento, String queixa, String diagnostico, String comentario) {

		this.veterinario = veterinario;
		this.cachorro = cachorro;
		this.dataHoraAtendimento = dataHoraAtendimento;
		this.queixa = queixa;
		this.diagnostico = diagnostico;
		this.comentario = comentario;
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
