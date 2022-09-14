package com.desafio.dto.endereco;

import com.desafio.entities.Endereco;

public class EnderecoMapper {

	public static Endereco fromDTO(EnderecoDTO enderecoDTO) {
		return new Endereco(enderecoDTO.getLogradouro(), enderecoDTO.getNumero(), enderecoDTO.getComplemento(), enderecoDTO.getCidadeEstado());
		
	}
	
	public static EnderecoDTO fromEntity(Endereco endereco) {
		
		return new EnderecoDTO(endereco.getLogradouro(), endereco.getNumero(), endereco.getComplemento(), endereco.getCidadeEstado());
		
	}
}
