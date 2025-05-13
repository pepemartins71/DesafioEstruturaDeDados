package pilha;

public class Pilha {

	private Elemento topo = null;

	public Pilha() {
	}

	public boolean estaVazio() {
		return topo == null;
	}

	public void empilha(String l) {
		Elemento novo = new Elemento(l);
		if (topo == null) {
			topo = novo;
		} else {
			novo.setProximo(topo);
			topo = novo;
		}
	}

	public String desempilha() {
		Elemento retVal = new Elemento(" ");
		if (estaVazio()) {
			retVal.setLetra("A pilha está vazia.");
		} else {
			retVal = topo;
			topo = topo.getProximo();
		}
		return retVal.letra;
	}
	
	public void inverter(String texto) {
		Pilha pilhaPalavra = new Pilha();
		for(int i = 0; i < texto.length(); i++) {
			if(texto.charAt(i) != ' ' || texto.charAt(i) != '.') {
				pilhaPalavra.empilha(String.valueOf(texto.charAt(i)));
			} else {
				while(!pilhaPalavra.estaVazio()) {
					System.out.println(pilhaPalavra.desempilha());		
				}
				System.out.print(texto.charAt(i));
			}
		}
	}
}
