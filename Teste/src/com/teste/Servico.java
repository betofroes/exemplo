package com.teste;

public class Servico {

	
	public static void teste(GenAbs gen) {
		if(gen instanceof ClassA) {
			System.out.println("CLASS A");
		} else {
			System.out.println("OUTER CLASS");
		}
		
	}
	
	public static void main(String[] args) {
		GenAbs gen = new ClassA();
		
		teste(gen);
		
		gen = new ClassB();
				
		teste(gen);
	}
}
