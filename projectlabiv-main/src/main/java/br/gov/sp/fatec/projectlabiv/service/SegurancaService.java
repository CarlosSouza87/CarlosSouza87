package br.gov.sp.fatec.projectlabiv.service;

import java.util.List;

import br.gov.sp.fatec.projectlabiv.entiy.Usuario;

public interface SegurancaService {
	
	//
	public Usuario novoUsuario(Usuario usuario);
	public Usuario novoUsuario(String nome, String senha);
	
	public List<Usuario> buscaUsuarios();
	
	public Usuario buscaUsuarioPorId(Long id);
	
}
