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
		Elemento letraTemp = new Elemento(" ");
		if (estaVazio()) {
			letraTemp.setLetra("A pilha está vazia.");
		} else {
			letraTemp = topo;
			topo = topo.getProximo();
		}
		return letraTemp.letra;
	}
	
	public void inverter(String texto) {
		Pilha pilhaPalavra = new Pilha();
		
		for(int i = 0; i < texto.length(); i++) {
			char c = texto.charAt(i);
			
			if(c != ' ' && c != '.') {
				pilhaPalavra.empilha(String.valueOf(c));
			} else {
				while(!pilhaPalavra.estaVazio()) {
					System.out.print(pilhaPalavra.desempilha());		
				}
				System.out.print(c);
			}
		}
	}
}
