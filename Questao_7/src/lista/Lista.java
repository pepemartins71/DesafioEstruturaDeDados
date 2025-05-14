package lista;

public class Lista {
    private int tamanho;
    private int[] lista;

    public Lista(int capacidade) {
        this.lista = new int[capacidade];
        this.tamanho = 0;
    }

    public void adicionar(int valor) {
        if (tamanho < lista.length) {
            lista[tamanho] = valor;
            tamanho++;
        } else {
            System.out.println("Lista cheia");
        }
    }

    public void remover(int valor) {
        int index = -1;
        for (int i = 0; i < tamanho; i++) {
            if (lista[i] == valor) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            for (int j = index; j < tamanho - 1; j++) {
                lista[j] = lista[j + 1];
            }
            lista[tamanho - 1] = 0;
            tamanho--;
        } else {
            System.out.println("Valor não encontrado");
        }
    }

    public void imprimir() {
        for (int i = 0; i < tamanho; i++) {
            System.out.print(lista[i] + " ");
        }
        System.out.println();
    }

    public int tamanho() {
        return tamanho;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }
}
