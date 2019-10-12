package com.buzzworks.brewer.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.buzzworks.brewer.model.Usuario;
import com.buzzworks.brewer.repository.helper.usuario.UsuariosQueries;

public interface Usuarios extends JpaRepository<Usuario, Long>, UsuariosQueries {

	public Optional<Usuario> findByEmail(String email);
	
	public List<Usuario> findByCodigoIn(Long[] codigos);

}