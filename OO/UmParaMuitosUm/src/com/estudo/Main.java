package com.estudo;

public class Main {

	public static void main(String[] args) {
	
		Compra compra1 = new Compra();
		
		compra1.nome = "Compra1";
		compra1.adicionarItem("Porta", 2, 100);
		compra1.itens.add(new Item("Rodas", 4, 200));
		
		System.out.println(compra1.itens.get(0).getNome());
		System.out.println("-------------------------------------");
		System.out.println(compra1.itens.get(1).getNome());
		System.out.println("-------------------------------------");
		System.out.println(compra1.itens.get(0).compra.nome);

	}

}
