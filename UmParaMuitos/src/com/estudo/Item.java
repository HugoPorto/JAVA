package com.estudo;

public class Item {

	private String nome;
	private double quantidade;
	private double preco;
	Compra compra;
	
	Item(String nome, double quantidade, double preco){
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Item [nome=" + nome + ", quantidade=" + quantidade + ", preco=" + preco + "]";
	}
}
