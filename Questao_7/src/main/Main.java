package main;

import lista.Lista;

public class Main {

	public static void main(String[] args) {
		Lista lista = new Lista(10);
        lista.inserir(10);
        lista.inserir(20);
        lista.inserir(30);
        lista.exibirLista();
        lista.remover(20);
        lista.exibirLista();
        lista.remover(40);
	}
}
