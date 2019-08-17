package com.buzzworks.brewer.model;

import org.hibernate.validator.constraints.NotBlank;

public class Cliente {
	
	@NotBlank(message="Nome é obrigatório")
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setName(String nome) {
		this.nome = nome;
	}

}
