package com.github.taveira90.controlebanca.entities;

public class Bebida extends Produto {

	private String marca;
	
	public Bebida(int codigo, String descricao, int estoque,  String marca) {
		super(codigo, descricao, estoque);
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	
}
