package com.buzzworks.brewer.repository.helper.usuario;

import java.util.List;
import java.util.Optional;

import com.buzzworks.brewer.model.Usuario;

public interface UsuariosQueries {

	public Optional<Usuario> porEmailEAtivo(String email);
	
	public List<String> permissoes(Usuario usuario);
	
}