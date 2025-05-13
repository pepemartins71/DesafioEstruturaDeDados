package main;

import pilha.Pilha;

public class UsePilha {

	public static void main(String[] args) {
		
		String texto = "ESTE EXERCÍCIO É MUITO FÁCIL.";
		Pilha nova = new Pilha();
		nova.empilha(texto);
		nova.inverter(texto);
	}

}
