package lista;

public class Lista {
	private Elemento[] elementos;
    private int inicio = -1;
    private int livre = 0;

    public Lista(int tamanho) {
        elementos = new Elemento[tamanho];
        for (int i = 0; i < tamanho - 1; i++) {
            elementos[i] = new Elemento(0, i + 1);
        }
        elementos[tamanho - 1] = new Elemento(0, -1);
    }
    
    public boolean listaVazia() {
		return inicio == -1;
	}

    public boolean inserir(int valor) {
        if (livre == -1) {
            System.out.println("Lista cheia. Não é possível inserir o valor.");
            return false;
        }

        int novoIndice = livre;
        livre = elementos[novoIndice].proximo;
        elementos[novoIndice].valor = valor;
        elementos[novoIndice].proximo = inicio;
        inicio = novoIndice;
        return true;
    }

    public boolean remover(int valor) {
        int atual = inicio;
        int anterior = -1;

        while (atual != -1) {
            if (elementos[atual].valor == valor) {
                if (anterior == -1) {
                    inicio = elementos[atual].proximo;
                } else {
                    elementos[anterior].proximo = elementos[atual].proximo;
                }
                elementos[atual].proximo = livre;
                livre = atual;
                System.out.println("Valor " + valor + " removido com sucesso.");
                return true;
            }
            anterior = atual;
            atual = elementos[atual].proximo;
        }

        System.out.println("Valor " + valor + " não encontrado na lista.");
        return false;
    }

    public void exibirLista() {
        int atual = inicio;
        while (atual != -1) {
            System.out.print(elementos[atual].valor + " -> ");
            atual = elementos[atual].proximo;
        }
        System.out.println("null");
    }
}
