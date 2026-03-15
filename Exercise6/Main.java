package com.example.Exercise6;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonService singletonService= new SingletonService();
		PrototypeService prototypeService= new PrototypeService();
	
	singletonService.print();
	prototypeService.print();
	}

}
