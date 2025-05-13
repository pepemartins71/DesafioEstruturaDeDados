package main;

import pilha.Pilha;

public class UsePilha {

	public static void main(String[] args) {
		Pilha pilha = new Pilha();
		Pilha pilha2 = new Pilha();
		
		pilha.empilha(5);
		pilha.empilha(3);
		pilha.empilha(8);
		
		pilha2.empilha(1);
		pilha2.empilha(4);
		pilha2.empilha(2);
		
		System.out.println("Pilha 1:");
		pilha.mostrarPilha(pilha);
		System.out.println("\nNúmero de elementos pares na pilha 1: " + pilha.numPar(pilha));
		System.out.println("Número de elementos ímpares na pilha 1: " + pilha.numImpar(pilha));
		System.out.println("Maior elemento da pilha 1: " + pilha.maiorElemento(pilha));
		System.out.println("Menor elemento da pilha 1: " + pilha.menorElemento(pilha));
		System.out.println("Média aritmética dos elementos da pilha 1: " + pilha.mediaArit(pilha));
		
		System.out.println("----------------------");
		
		System.out.println("\nPilha 2:");
		pilha.mostrarPilha(pilha2);
		System.out.println("\nNúmero de elementos pares na pilha 2: " + pilha.numPar(pilha2));
		System.out.println("Número de elementos ímpares na pilha 2: " + pilha.numImpar(pilha2));
		System.out.println("Maior elemento da pilha 2: " + pilha.maiorElemento(pilha2));
		System.out.println("Menor elemento da pilha 2: " + pilha.menorElemento(pilha2));
		System.out.println("Média aritmética dos elementos da pilha 2: " + pilha.mediaArit(pilha2));
		
		System.out.println("----------------------");
		
		System.out.println("Transferindo elementos da pilha 1 para a pilha 2:");
		pilha.transferirElementos(pilha, pilha2);
		System.out.println("Pilha 2 após a transferência:");
		pilha.mostrarPilha(pilha2);
	}

}
