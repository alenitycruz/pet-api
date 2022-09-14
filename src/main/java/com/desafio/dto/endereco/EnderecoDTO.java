package com.desafio.dto.endereco;

public class EnderecoDTO {
	
	private String logradouro;
	
	private String numero;
	
	private String complemento;
	
	private String cidadeEstado;
	
	public EnderecoDTO() {

	}

	public EnderecoDTO(String logradouro, String numero, String complemento, String cidadeEstado) {

		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.cidadeEstado = cidadeEstado;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getCidadeEstado() {
		return cidadeEstado;
	}

	public void setCidadeEstado(String cidadeEstado) {
		this.cidadeEstado = cidadeEstado;
	}
	
	

}
