package com.estudo;

import java.util.ArrayList;
import java.util.List;

public class Compra 
{
	List<Item> itens = new ArrayList<>();
	
	void listarItens() {
		for (Item item : itens) {
			System.out.println(item.produto.nomeProduto);
		}
	}
}
