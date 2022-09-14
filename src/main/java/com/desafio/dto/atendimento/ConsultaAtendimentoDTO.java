package com.desafio.dto.atendimento;

import com.desafio.dto.cachorro.ConsultaCachorroDTO;
import com.desafio.dto.veterinario.ConsultaVeterinarioDTO;

public class ConsultaAtendimentoDTO {
	
	private Long id;

	private ConsultaVeterinarioDTO veterinario;

	private ConsultaCachorroDTO cachorro;

	private String dataHoraAtendimento;

	private String queixa;

	private String diagnostico;
	
	private String comentario;


	public ConsultaAtendimentoDTO() {

	}

	public ConsultaAtendimentoDTO(Long id, ConsultaVeterinarioDTO veterinario, ConsultaCachorroDTO cachorro,
			String dataHoraAtendimento, String queixa, String diagnostico, String comentario) {

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

	
	public ConsultaVeterinarioDTO getVeterinario() {
		return veterinario;
	}

	public void setVeterinario(ConsultaVeterinarioDTO veterinario) {
		this.veterinario = veterinario;
	}

	public ConsultaCachorroDTO getCachorro() {
		return cachorro;
	}

	public void setCachorro(ConsultaCachorroDTO cachorro) {
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
