package com.estudo;

public class Item 
{
	double quantidadeItem;
	Produto produto;
	
	Item(Produto produto, double quantidadeItem){
		this.produto = produto;
		this.quantidadeItem = quantidadeItem;
	}
}
