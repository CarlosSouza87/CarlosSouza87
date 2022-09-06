package br.gov.sp.fatec.projectlabiv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.fatec.projectlabiv.entiy.Usuario;
import br.gov.sp.fatec.projectlabiv.service.SegurancaService;

@RestController
@RequestMapping("/usuario")
@CrossOrigin
public class UsuarioController {
	
	@Autowired
	SegurancaService segurancaService;
	
	@GetMapping
	public List<Usuario> todosUsuarios(){
		return segurancaService.buscaUsuarios();
	}
	
	@PostMapping
	public Usuario novoUsuario(@RequestBody Usuario usuario) {
		return segurancaService.novoUsuario(usuario);
	}
	
	@GetMapping("/{id}")
	public Usuario buscaPorId(@PathVariable Long id) {
		return segurancaService.buscaUsuarioPorId(id);
	}
	
}
