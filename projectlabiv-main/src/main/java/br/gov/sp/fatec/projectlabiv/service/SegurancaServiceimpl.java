package br.gov.sp.fatec.projectlabiv.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.fatec.projectlabiv.entiy.Usuario;
import br.gov.sp.fatec.projectlabiv.repository.UsuarioRepository;

@Service
public class SegurancaServiceimpl implements SegurancaService{
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public Usuario novoUsuario(Usuario usuario) {
		if(usuario.getNome() == null || usuario.getNome().trim().isEmpty() ) {
			if(usuario.getSenha() == null || usuario.getSenha().trim().isEmpty() ) { //trim retira espaços
				throw new IllegalArgumentException("Nome ou senha inválidos");
			}
		}
		return usuarioRepository.save(usuario);
	}

	@Override
	public Usuario novoUsuario(String nome, String senha) {
		
		Usuario usuario = new Usuario();
		
		usuario.setNome(nome);
		usuario.setSenha(senha);
		return novoUsuario(usuario);
	}

	@Override
	public List<Usuario> buscaUsuarios() {
		
		return usuarioRepository.findAll();
	}

	@Override
	public Usuario buscaUsuarioPorId(Long id) {
		Optional<Usuario> usuOptional = usuarioRepository.findById(id);
		if(!usuOptional.isPresent()) {
			throw new IllegalArgumentException("Usuario Inexistente para esse id");
		}
		
		return usuOptional.get();
	}
	
	
}
