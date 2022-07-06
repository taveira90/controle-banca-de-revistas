package com.github.taveira90.controlebanca.entities;

public class Revista extends Produto {
	
	private String editora;
	
	public Revista(int codigo, String descricao, int estoque, String editora) {
		super(codigo, descricao, estoque);
		this.editora = editora;		
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	

}
