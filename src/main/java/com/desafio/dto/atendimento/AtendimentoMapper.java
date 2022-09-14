package com.desafio.dto.atendimento;

import com.desafio.dto.cachorro.CachorroMapper;
import com.desafio.dto.veterinario.VeterinarioMapper;
import com.desafio.entities.Atendimento;

public class AtendimentoMapper {
	
	public static Atendimento fromDTO(RegistroAtendimentoDTO dto) {
		
		return new Atendimento(null, dto.getVeterinario(), dto.getCachorro(), dto.getDataHoraAtendimento(), dto.getQueixa(), dto.getDiagnostico(), dto.getComentario());
		
	}

	public static ConsultaAtendimentoDTO fromEntity(Atendimento atendimento) {
		
		return new ConsultaAtendimentoDTO(atendimento.getId(), VeterinarioMapper.fromEntity(atendimento.getVeterinario()), CachorroMapper.fromEntity(atendimento.getCachorro()),
				atendimento.getDataHoraAtendimento(), atendimento.getQueixa(), atendimento.getDiagnostico(), atendimento.getComentario());
	}

}
