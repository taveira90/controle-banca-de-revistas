package com.github.taveira90.controlebanca.entities;

public class Produto {
	
	private int codigo;
	private String descricao;
	private int estoque;
	private double valorUnitario;
	
	public Produto(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public int getEstoque() {
		return estoque;
	}
	
	public void incluiNoEstoque(int quantidade) {
		if (quantidade > 0) {
			this.estoque += quantidade;
		} else {
			System.out.println("Quantiadade inválida! Por favor insira um valor maior que zero.");
		}
	}
	
	public void retiraDoEstoque(int quantidade) {
		if (quantidade > 0) {
			this.estoque -= quantidade;
		} else {
			System.out.println("Quantidade inválida! Por favor insira um valor maior que zero");
		}
	}
}
