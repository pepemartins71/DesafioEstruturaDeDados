package main;

import pilha.Pilha;

public class UsePilha {

	public static void main(String[] args) {
				
		Pilha nova = new Pilha();
		nova.empilha(1);
		nova.empilha(5);
		nova.empilha(3);
		nova.empilha(2);
		nova.empilha(4);
		nova.ordernarPilha(nova);
	}
}
