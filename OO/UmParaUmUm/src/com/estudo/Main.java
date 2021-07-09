package com.estudo;

public class Main {

	public static void main(String[] args) {

		Carro carro1 = new Carro("Focus");
		
		carro1.ligar();
		
		System.out.println(carro1.motor.giros());
		
		carro1.acelerar();
		
		System.out.println(carro1.motor.giros());
		System.out.println("Nome Carro: " + carro1);
		System.out.println("Marca Motor: " + carro1.motor);
		System.out.println("Carro a partir do motor: " + carro1.motor.carro);
	}

}
