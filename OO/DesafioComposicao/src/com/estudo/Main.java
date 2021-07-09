package com.estudo;

public class Main {

	public static void main(String[] args) 
	{
		Compra compra1 = new Compra();
		
		compra1.itens.add(new Item(new Produto("Sabão em Pó", 10), 1));
		compra1.itens.add(new Item(new Produto("Desinfetante", 5), 1));
		
		Cliente cliente1 = new Cliente();
		
		cliente1.nomeCliente = "Hugo";
		cliente1.compras.add(compra1);
		
		for (Compra compra : cliente1.compras) {
			compra.listarItens();
		}
	}

}
