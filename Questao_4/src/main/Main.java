package main;

import lista.Lista;

public class Main {

	public static void main(String[] args) {
		Lista lista = new Lista();
		lista.inserir(10);
		lista.inserir(20);
		lista.inserir(30);
		
		System.out.println("Lista após inserções:");
		lista.imprimir();
		
		lista.removerUltimo();
		
		System.out.println("Lista após remoção do último elemento:");
		lista.imprimir();
	}

}
