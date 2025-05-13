package fila;
import pilha.Pilha;

public class Fila {
	public Pilha inicio, fim;
    public int tamanho = 0;
    
    public Fila(){
        this.inicio = null;
        this.fim = null;        
    }
    
    public boolean estaVazia(){
        return inicio == null;
    }
    
    public void inserePilha(Pilha novaPilha){
        if (estaVazia()) {
            inicio = novaPilha;
            fim = novaPilha;
        } else {
            fim.setProximo(novaPilha);
            fim = novaPilha;
        }
        tamanho++;
    }
    
    public Pilha removePilha(){
    	if (estaVazia()) {
            System.out.println("A fila está vazia.");
            return null;
        } else {
        	Pilha pilhaRemovida = inicio;
            inicio = inicio.getProximo();
            if (inicio == null) {
                fim = null; 
            }
            tamanho--;
            return pilhaRemovida;
        }
    }
    
    public int tamanho(){
        return this.tamanho;
    }
    
    public void insereNumero(int n){
        if (estaVazia()) {
            Pilha novaPilha = new Pilha();
            novaPilha.empilha(n);
            inserePilha(novaPilha);
        } else {
            fim.empilha(n);
        }
    }
    
    public void mostrarFila() {
        Pilha atual = inicio;
        while (atual != null) {
            Pilha temp = new Pilha();
            
            while (!atual.estaVazio()) {
                int valor = atual.desempilha();
                System.out.print(valor + " ");
                temp.empilha(valor);
            }
            System.out.println();
            
            while (!temp.estaVazio()) {
                atual.empilha(temp.desempilha());
            }
            
            atual = atual.getProximo();
        }
    }

}
