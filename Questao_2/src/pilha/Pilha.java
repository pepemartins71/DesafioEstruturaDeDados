package pilha;

public class Pilha {

	private Elemento topo = null;

	public Pilha() {
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
	
	public void ordernarPilha(Pilha pilha) {
		Pilha pilhaAux = new Pilha();
		
		while(!pilha.estaVazio()) {
			int temp = pilha.desempilha();
			
			while(!pilhaAux.estaVazio() && pilhaAux.mostrarTopo() > temp) {
				pilha.empilha(pilhaAux.desempilha());
			}
			pilhaAux.empilha(temp);			
		}
		mostrarPilha(pilhaAux);
	}
	
	public void mostrarPilha(Pilha pilhaOrdenada) {
		while(!pilhaOrdenada.estaVazio()) {
			System.out.println(pilhaOrdenada.desempilha());
		}
	}
}
