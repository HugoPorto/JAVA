package com.estudo;

public class Carro {

	String nomeCarro;
	Motor motor = new Motor(this);
	
	
	Carro(String nomeCarro){
		this.nomeCarro = nomeCarro;
	}
	
	void acelerar() {
		motor.fatorInjecao += 0.4;
	}
	
	void desacelerar() {
		motor.fatorInjecao -= 0.4;
	}
	
	void ligar() {
		motor.ligado = true;
	}
	
	void desligar() {
		motor.ligado = false;
	}
	
	boolean estaLigado(){
		return motor.ligado;
	}
	
	public String toString() {
		return nomeCarro;
	}
}
