package com.desafio.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.desafio.dto.usuario.ConsultaUsuarioDTO;
import com.desafio.dto.usuario.RegistroUsuarioDTO;
import com.desafio.dto.usuario.UsuarioMapper;
import com.desafio.entities.Usuario;
import com.desafio.service.UsuarioService;


@RestController
@RequestMapping("v1/usuarios")
public class UsuarioController {
	
private final UsuarioService usuarioService;
	
	public UsuarioController(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}
	
	@PostMapping
	public ResponseEntity<ConsultaUsuarioDTO> salvarUsuario(@RequestBody RegistroUsuarioDTO dto){
			
			Usuario usuario = usuarioService.salvarUsuario(UsuarioMapper.fromDTO(dto));
			
			return ResponseEntity.ok(UsuarioMapper.fromEntity(usuario));
			
	}

	


}
