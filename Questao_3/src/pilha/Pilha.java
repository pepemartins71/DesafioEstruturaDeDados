package pilha;

public class Pilha {

	public Elemento topo;
	public Pilha proximo;

	public Pilha() {
		topo = null;
		proximo = null;
	}
	
	public Pilha getProximo(){
        return this.proximo;
    }
    
    public void setProximo(Pilha proximo){
        this.proximo = proximo;
    }
	
	public int mostrarTopo() {
		return topo.num;
	}

	public boolean estaVazio() {
		return topo == null;
	}

	public void empilha(int n) {
		Elemento novo = new Elemento(n);
		if (topo == null) {
			topo = novo;
		} else {
			novo.setProximo(topo);
			topo = novo;
		}
	}

	public int desempilha() {
		Elemento numTemp = new Elemento(-1);
		if (estaVazio()) {
			System.out.println("A pilha está vazia.");
		} else {
			numTemp = topo;
			topo = topo.getProximo();
		}
		return numTemp.num;
	}
}