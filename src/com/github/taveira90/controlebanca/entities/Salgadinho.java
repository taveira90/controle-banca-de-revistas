package com.github.taveira90.controlebanca.entities;

public class Salgadinho extends Produto {

	private String marca;
	
	public Salgadinho(int codigo, String descricao, String marca) {
		super(codigo, descricao);
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	

	
}
