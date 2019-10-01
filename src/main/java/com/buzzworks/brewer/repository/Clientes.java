package com.buzzworks.brewer.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.buzzworks.brewer.model.Cliente;
import com.buzzworks.brewer.repository.helper.cliente.ClientesQueries;

public interface Clientes extends JpaRepository<Cliente, Long>, ClientesQueries {
	
	public Optional<Cliente> findByCpfOuCnpj(String cpfOuCnpj);

}
