package main;

import lista.Lista;

public class Main {

	public static void main(String[] args) {
		Lista lista1 = new Lista();
		Lista lista2 = new Lista();
		
		lista1.inserirFim(10);
		lista1.inserirFim(20);
		lista1.inserirFim(30);
		lista1.inserirFim(40);
		lista1.inserirFim(30);
		
		lista2.inserirFim(20);
		lista2.inserirFim(50);
		lista2.inserirFim(60);
		lista2.inserirFim(40);
		lista2.inserirFim(70);
		
		System.out.println("Lista 1:");
		lista1.imprimir();
		System.out.println("------------------");
		System.out.println("Lista 2:");
		lista2.imprimir();
		System.out.println("------------------");
		
		Lista listaUnida = lista1.uniaoSemRepetidos(lista1, lista2);
        
        System.out.println("Lista Unida (sem repetidos):");
        listaUnida.imprimir();
        System.out.println("------------------");
        
        Lista listaInterseccao = lista1.interseccao(lista1, lista2);
        System.out.println("Lista Interscção:");
        listaInterseccao.imprimir();
        System.out.println("------------------");
	}

}
