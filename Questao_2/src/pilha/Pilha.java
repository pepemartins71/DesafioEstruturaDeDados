package pilha;

public class Pilha {

	private Elemento topo = null;

	public Pilha() {
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
		Elemento retVal = new Elemento(-1);
		if (estaVazio()) {
			System.out.println("A pilha está vazia.");
		} else {
			retVal = topo;
			topo = topo.getProximo();
		}
		return retVal.num;
	}
}
