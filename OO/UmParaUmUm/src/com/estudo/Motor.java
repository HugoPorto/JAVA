package com.estudo;

public class Motor {

	String marcaMotor = "Ford";
	boolean ligado = false;
	double fatorInjecao = 1;
	Carro carro;
	
	Motor(Carro carro){
		this.carro = carro;
	}
	
	int giros() {
		
		if(ligado)
			return (int) Math.round(fatorInjecao * 3000);
		
		return 0;
		
	}
	
	public String toString() {
		return marcaMotor;
	}
}
