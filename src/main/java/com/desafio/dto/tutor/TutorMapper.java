package com.desafio.dto.tutor;


import com.desafio.dto.endereco.EnderecoMapper;
import com.desafio.entities.Tutor;

public class TutorMapper {
	
	public static Tutor fromDTO(RegistroTutorDTO dto) {
		
		return new Tutor(null, dto.getNome(), dto.getIdentidade(), EnderecoMapper.fromDTO(dto.getEndereco()));
	}
	
	public static ConsultaTutorDTO fromEntity(Tutor tutor) {
		
		return new ConsultaTutorDTO(tutor.getId(), tutor.getNome(), tutor.getIdentidade(), EnderecoMapper.fromEntity(tutor.getEndereco()));
		
	}

}
