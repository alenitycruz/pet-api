package com.desafio.dto.veterinario;

import com.desafio.dto.endereco.EnderecoMapper;
import com.desafio.entities.Veterinario;

public class VeterinarioMapper {
	
	public static Veterinario fromDTO(RegistroVeterinarioDTO dto) {
		
		return new Veterinario(null, dto.getNome(), dto.getLicensa(), EnderecoMapper.fromDTO(dto.getEndereco()));
		
	}
	

	public static ConsultaVeterinarioDTO fromEntity(Veterinario veterinario) {
		
		return new ConsultaVeterinarioDTO(veterinario.getId(), veterinario.getNome(), veterinario.getLicensa(), EnderecoMapper.fromEntity(veterinario.getEndereco()));
		
	}
}
