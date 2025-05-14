package main;

import fila.Fila;

public class UseFila {
	public static void main(String[] args) {
		
		Fila fila1 = new Fila();
		Fila fila2 = new Fila();
		
		fila1.inserePilha(1);
		fila1.inserePilha(2);
		fila1.inserePilha(3);
		fila1.inserePilha(7);
		fila1.inserePilha(8);
		fila1.inserePilha(9);
		
		fila2.inserePilha(4);
		fila2.inserePilha(5);
		fila2.inserePilha(6);
		fila2.inserePilha(10);
		fila2.inserePilha(11);
		fila2.inserePilha(12);
		
		System.out.println("Fila 1:");
		fila1.imprimeFila();
		System.out.println("Maior elemento: " + fila1.maiorElemento(fila1));
		System.out.println("Menor elemento: " + fila1.menorElemento(fila1));
		System.out.println("Média aritmética: " + fila1.mediaArit(fila1));
		System.out.println("Número de elementos pares: " + fila1.numPar(fila1));
		System.out.println("Número de elementos ímpares: " + fila1.numImpar(fila1));
		System.out.println("--------------------");
		
		System.out.println("Fila 2:");
		fila2.imprimeFila();
		System.out.println("Maior elemento: " + fila2.maiorElemento(fila2));
		System.out.println("Menor elemento: " + fila2.menorElemento(fila2));
		System.out.println("Média aritmética: " + fila2.mediaArit(fila2));
		System.out.println("Número de elementos pares: " + fila2.numPar(fila2));
		System.out.println("Número de elementos ímpares: " + fila2.numImpar(fila2));
		System.out.println("--------------------");
		
		System.out.println("As filas são iguais? " + (fila1.iguais(fila1, fila2) ? "Sim" : "Não"));
		System.out.println("Copiando elementos da fila 1 para a fila 2...");
		fila1.copiarElementos(fila1, fila2);
		System.out.println("Fila 2 após a cópia:");
		fila2.imprimeFila();
		System.out.println("--------------------");
		
		
	}
}
