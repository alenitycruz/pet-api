package com.desafio.dto.usuario;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.desafio.entities.Perfil;
import com.desafio.entities.Usuario;



public class UsuarioMapper {
	
	public static Usuario fromDTO(RegistroUsuarioDTO dto) {
		
		Perfil perfil = new Perfil();
		perfil.setId(dto.getPerfilId());
		
		return new Usuario(null, dto.getEmail(), new BCryptPasswordEncoder().encode(dto.getSenha()), perfil);
		
	}
	
	public static ConsultaUsuarioDTO fromEntity(Usuario usuario) {
		
		return new ConsultaUsuarioDTO(usuario.getEmail(), usuario.getPerfil().getNome());
		
	}


}
