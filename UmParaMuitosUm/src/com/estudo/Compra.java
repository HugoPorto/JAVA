package com.estudo;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	String nome;
	List<Item> itens = new ArrayList<Item>();
	
	public void adicionarItem(Item item) {
		this.itens.add(item);
		item.compra = this;
	}
	
	public void adicionarItem(String nome, double quantidade, double preco) {
		this.adicionarItem(new Item(nome, quantidade, preco));
	}
}
