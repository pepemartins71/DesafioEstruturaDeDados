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
	
	public void inserir(int valor) {
		Elemento novo = new Elemento(valor);
		if (estaVazia()) {
			primeiro = novo;
			ultimo = novo;
			atual = novo;
			tamanho++;
		} else {
			ultimo.proximo = novo;
			novo.anterior = ultimo;
			ultimo = novo;
			tamanho++;
		}
	}
	
	public Elemento removerUltimo() {
		if (estaVazia()) {
			System.out.println("Lista vazia, não é possível remover.");
			return null;
		}
		Elemento removido = ultimo;
		if (ultimo.anterior != null) {
			ultimo = ultimo.anterior;
			ultimo.proximo = null;
		} else {
			primeiro = null;
			ultimo = null;
		}
		tamanho--;
		return removido;
	}
	
	public Elemento buscar(int valor) {
		Elemento atual = primeiro;
		while (atual != null) {
			if (atual.valor == valor) {
				return atual;
			}
			atual = atual.proximo;
		}
		System.out.println("Elemento não encontrado.");
		return null;
	}
	
	public Elemento primeiro() {
		return primeiro;
	}
	
	public Elemento ultimo() {
		return ultimo;
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
