package br.gov.sp.fatec.projectlabiv.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.sp.fatec.projectlabiv.entiy.Usuario;

public interface UsuarioRepository  extends JpaRepository<Usuario, Long>{

}
