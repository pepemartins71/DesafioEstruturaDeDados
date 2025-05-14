package lista;

public class Lista {
	Elemento primeiro, ultimo, atual;
	int tamanho = 0;
	
	public Lista() {
		primeiro = null;
		ultimo = null;
		atual = null;
	}
	
	public boolean estaVazia() {
		return primeiro == null;
	}
	
	public void movePosicao(int posicao) {
		if (posicao < 0 || posicao >= tamanho) {
			System.out.println("Posição inválida.");
			return;
		}
		atual = primeiro;
		for (int i = 1; i < posicao; i++) {
			atual = atual.proximo;
		}
	}
	
	public void inserirInicio(int valor) {
		Elemento novo = new Elemento(valor);
		if(estaVazia()) {
			primeiro = novo;
			ultimo = novo;
			atual = novo;
		} else {
			novo.proximo = primeiro;
			primeiro = novo;
		}
	}
	
	public void inserirFim(int valor) {
		Elemento novo = new Elemento(valor);
		if(estaVazia()) {
			primeiro = novo;
			ultimo = novo;
			atual = novo;
		} else {
			ultimo.proximo = novo;
			ultimo = novo;
		}
	}
	
	public Elemento removerInicio() {
		if(estaVazia()) {
			System.out.println("Lista vazia.");
			return null;
		} else {
			Elemento removido = primeiro;
			primeiro = primeiro.proximo;
			if(primeiro == null) {
				ultimo = null;
			}
			return removido;
		}
	}
	
	public Elemento removerFim() {
		if(estaVazia()) {
			System.out.println("Lista vazia.");
			return null;
		} else {
			Elemento removido = ultimo;
			if(primeiro == ultimo) {
				primeiro = null;
				ultimo = null;
			} else {
				int pos;
				pos = tamanho - 1;
				movePosicao(pos);
				atual.proximo = null;
				ultimo = atual;
			}
			return removido;
		}
	}
	
	public Elemento buscar(int valor) {
		Elemento atual = primeiro;
		while (atual != null) {
			if (atual.valor == valor) {
				return atual;
			}
			atual = atual.proximo;
		}		
		return null;
	}
	
	public Elemento primeiro() {
		return primeiro;
	}
	
	public Elemento ultimo() {
		return ultimo;
	}
	
	public Lista uniaoSemRepetidos(Lista lista1, Lista lista2) {
		if (lista1.estaVazia() && lista2.estaVazia()) {
			System.out.println("Ambas as listas estão vazias.");
			return null;
		} else if (lista1.estaVazia()) {
			return lista2;
		} else if (lista2.estaVazia()) {
			return lista1;
		}
		Lista listaUniao = new Lista();
		Elemento atual1 = lista1.primeiro;
		while (atual1 != null) {
			if (listaUniao.buscar(atual1.valor) == null) {
				listaUniao.inserirFim(atual1.valor);
			}			
			atual1 = atual1.proximo;
		}
		Elemento atual2 = lista2.primeiro;
		while (atual2 != null) {
			if (listaUniao.buscar(atual2.valor) == null) {
				listaUniao.inserirFim(atual2.valor);
			}			
			atual2 = atual2.proximo;
		}
		return listaUniao;		
	}
	
	public Lista interseccao(Lista lista1, Lista lista2) {
		if (lista1.estaVazia() || lista2.estaVazia()) {
			System.out.println("Uma das listas está vazia.");
			return null;
		}
		Lista listaInterseccao = new Lista();
		Elemento atual1 = lista1.primeiro;
		while (atual1 != null) {
			if (lista2.buscar(atual1.valor) != null) {
				listaInterseccao.inserirFim(atual1.valor);
			}			
			atual1 = atual1.proximo;
		}
		return listaInterseccao;		
	}
	
	public void imprimir() {
		Elemento atual = primeiro;
		while (atual != null) {
			System.out.print(atual.valor + " ");
			atual = atual.proximo;
		}
		System.out.println();
	}
}
