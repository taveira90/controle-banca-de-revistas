package com.github.taveira90.controlebanca.entities;

public class Revista extends Produto {
	
	private String editora;
	
	public Revista(int codigo, String descricao, String editora) {
		super(codigo, descricao);
		this.editora = editora;		
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	

}
