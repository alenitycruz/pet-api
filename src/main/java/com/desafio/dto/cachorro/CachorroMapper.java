package com.desafio.dto.cachorro;

import com.desafio.dto.tutor.TutorMapper;
import com.desafio.entities.Cachorro;

public class CachorroMapper {
	
	public static Cachorro fromDTO(RegistroCachorroDTO dto) {
		return new Cachorro(null, dto.getNome(), dto.getRaca(), dto.getCaracteristica(), dto.getDataNascimento(), dto.getTamanho(), dto.getTutor());
	}
	
	public static ConsultaCachorroDTO fromEntity(Cachorro cachorro) {
		return new ConsultaCachorroDTO(cachorro.getId(), cachorro.getNome(), cachorro.getRaca(), cachorro.getCaracteristica(), cachorro.getDataNascimento(), 
				cachorro.getTamanho(), TutorMapper.fromEntity(cachorro.getTutor()));
	}

}