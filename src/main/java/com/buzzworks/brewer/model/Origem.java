package com.buzzworks.brewer.model;

public enum Origem {

	NACIONAL("Nacional"),
	INERNACIONAL("Internacional");
	
	private String descricao;
	
	Origem(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
}
