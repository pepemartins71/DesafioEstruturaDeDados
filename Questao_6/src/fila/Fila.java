package fila;

public class Fila {
	public Elemento inicio, fim;
    public int tamanho = 0;
    
    public Fila(){
        this.inicio = null;
        this.fim = null;        
    }
    
    public boolean estaVazia(){
        return inicio == null;
    }
    
    public void inserePilha(int num){
    	Elemento novo = new Elemento(num);
        if (estaVazia()) {
            inicio = novo;
            fim = novo;
        } else {
            fim.setProximo(novo);
            fim = novo;
        }
        tamanho++;
    }
    
    public Elemento removePilha(){
    	if (estaVazia()) {
            System.out.println("A fila está vazia.");
            return null;
        } else {
        	Elemento numRemovido = inicio;
            inicio = inicio.getProximo();
            if (inicio == null) {
                fim = null; 
            }
            tamanho--;
            return numRemovido;
        }
    }
    
    public int tamanho(){
        return this.tamanho;
    }
    
    
	public void imprimeFila(){
		Elemento atual = inicio;
		while (atual != null) {
			System.out.print(atual.getNum() + " ");
			atual = atual.getProximo();
		}
		System.out.println();
	}
	
	public boolean iguais(Fila fila1, Fila fila2) {
		Elemento atual1 = fila1.inicio;
		Elemento atual2 = fila2.inicio;
		
		if(fila1.estaVazia() && fila2.estaVazia()) {
			System.out.println("As filas estão vazias.");
			return false;
		} else if(fila1.tamanho() != fila2.tamanho()) {
			return false;
		} else {
			while(atual1 != null && atual2 != null) {
				if(atual1.getNum() != atual2.getNum()) {
					return false;
				}
				atual1 = atual1.getProximo();
				atual2 = atual2.getProximo();
			}
			return true;
		}
	}
	
	public int maiorElemento(Fila fila) {
		Elemento atual = fila.inicio;
		int maior = Integer.MIN_VALUE;
		if(fila.estaVazia()) {
			System.out.println("A fila está vazia.");
			return maior;
		} else {
			while(atual != null) {
				if(atual.getNum() >= maior) {
					maior = atual.getNum();
				}
				atual = atual.getProximo();
			}
			return maior;
		}
	}
	
	public int menorElemento(Fila fila) {
		Elemento atual = fila.inicio;
		int menor = Integer.MAX_VALUE;
		if(fila.estaVazia()) {
			System.out.println("A fila está vazia.");
			return menor;
		} else {
			while(atual != null) {
				if(atual.getNum() <= menor) {
					menor = atual.getNum();
				}
				atual = atual.getProximo();
			}
			return menor;
		}
	}
	
	public double mediaArit(Fila fila) {
		Elemento atual = fila.inicio;
		int soma = 0;
		if(fila.estaVazia()) {
			System.out.println("A fila está vazia.");
			return -1;
		} else {
			while(atual != null) {
				soma += atual.getNum();
				atual = atual.getProximo();
			}
			return soma / fila.tamanho();
		}
	}
	
	public void copiarElementos(Fila fila1, Fila fila2) {
		Elemento atual = fila1.inicio;
		if(fila1.estaVazia()) {
			System.out.println("A fila 1 está vazia.");
		} else {
			while(atual != null) {
				fila2.inserePilha(atual.getNum());
				atual = atual.getProximo();
			}
		}
	}
	
	public int numPar(Fila fila) {
		Elemento atual = fila.inicio;
		if(fila.estaVazia()) {
			System.out.println("A fila está vazia.");
			return -1;
		} else {
			int cont = 0;
			while(atual != null) {
				if(atual.getNum() % 2 == 0) {
					cont++;
				}
				atual = atual.getProximo();
			}
			return cont;
		}
	}
	
	public int numImpar(Fila fila) {
		Elemento atual = fila.inicio;
		if(fila.estaVazia()) {
			System.out.println("A fila está vazia.");
			return -1;
		} else {
			int cont = 0;
			while(atual != null) {
				if(atual.getNum() % 2 != 0) {
					cont++;
				}
				atual = atual.getProximo();
			}
			return cont;
		}
	}
}
