package pilha;

public class Pilha {

	Elemento topo = null;
	int tamanho = 0;

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
			tamanho++;
		} else {
			novo.setProximo(topo);
			topo = novo;
			tamanho++;
		}
	}

	public int desempilha() {
		Elemento numTemp = new Elemento(-1);
		if (estaVazio()) {
			System.out.println("A pilha está vazia.");
		} else {
			numTemp = topo;
			topo = topo.getProximo();
			tamanho--;
		}
		return numTemp.num;
	}
	
	public void mostrarPilha() {
		Elemento atual = topo;
		while (atual != null) {
			System.out.println(atual.getNum());
			atual = atual.getProximo();
		}
	}
	
	public boolean iguais(Pilha pilha1, Pilha pilha2) {
		if (pilha1.estaVazio() && pilha2.estaVazio()) {
			return true;
		}
		
		if (pilha1.estaVazio() || pilha2.estaVazio()) {
			return false;
		}
		
		Pilha pilhaAux1 = new Pilha();
		Pilha pilhaAux2 = new Pilha();
		
		while (!pilha1.estaVazio() && !pilha2.estaVazio()) {
			int num1 = pilha1.desempilha();
			int num2 = pilha2.desempilha();
			
			pilhaAux1.empilha(num1);
			pilhaAux2.empilha(num2);
			
			if (num1 != num2) {
				return false;
			}
		}
		
		while (!pilhaAux1.estaVazio()) {
			pilha1.empilha(pilhaAux1.desempilha());
		}
		
		while (!pilhaAux2.estaVazio()) {
			pilha2.empilha(pilhaAux2.desempilha());
		}
		
		return true;
	}
	
	public int maiorElemento(Pilha pilha) {
		if (pilha.estaVazio()){
			System.out.println("A pilha está vazia.");
			return -1;
		}
		int maior = Integer.MIN_VALUE;
		Pilha pilhaAux = new Pilha();
		
		while (!pilha.estaVazio()) {
			
			int num = pilha.desempilha();
			if (num >= maior) {
				maior = num;
			}
			pilhaAux.empilha(num);
		}
		while (!pilhaAux.estaVazio()) {
			pilha.empilha(pilhaAux.desempilha());
		}
		return maior;		
	}
	
	public int menorElemento(Pilha pilha) {
		if (pilha.estaVazio()){
			System.out.println("A pilha está vazia.");
			return -1;
		}
		int menor = Integer.MAX_VALUE;
		Pilha pilhaAux = new Pilha();
		
		while (!pilha.estaVazio()) {
			
			int num = pilha.desempilha();
			if (num <= menor) {
				menor = num;
			}
			pilhaAux.empilha(num);
		}
		while (!pilhaAux.estaVazio()) {
			pilha.empilha(pilhaAux.desempilha());
		}
		return menor;		
	}
	
	public double mediaArit(Pilha pilha) {
		if (pilha.estaVazio()){
			System.out.println("A pilha está vazia.");
			return -1;
		}
		double media = 0;
		Pilha pilhaAux = new Pilha();
		
		while (!pilha.estaVazio()) {
			
			int num = pilha.desempilha();
			media += num;
			pilhaAux.empilha(num);
		}
		while (!pilhaAux.estaVazio()) {
			pilha.empilha(pilhaAux.desempilha());
		}
		media = media / pilha.tamanho;
		return media;		
	}
	
	public void transferirElementos(Pilha pilha1, Pilha pilha2) {
		if (pilha1.estaVazio()){
			System.out.println("A pilha 1 está vazia.");
		} else {
			Pilha pilhaAux = new Pilha();
			while (!pilha1.estaVazio()) {
				int num = pilha1.desempilha();
				pilhaAux.empilha(num);
				pilha2.empilha(num);
			}
			while (!pilhaAux.estaVazio()) {
				pilha1.empilha(pilhaAux.desempilha());
			}
		}
	}
	
	public int numPar(Pilha pilha) {
		if (pilha.estaVazio()){
			System.out.println("A pilha está vazia.");
			return -1;
		}
		int numPar = 0;
		Elemento atual = pilha.topo;
		while (atual != null) {
			if (atual.num % 2 == 0) {
				numPar++;
			}
			atual = atual.getProximo();			
		}
		return numPar;
	}
	
	public int numImpar(Pilha pilha) {
		if (pilha.estaVazio()){
			System.out.println("A pilha está vazia.");
			return -1;
		}
		int numImpar = 0;
		Elemento atual = pilha.topo;
		while (atual != null) {
			if (atual.num % 2 != 0) {
				numImpar++;
			}
			atual = atual.getProximo();			
		}
		return numImpar;
	}
	
	public void mostrarPilha(Pilha pilha) {
		if(pilha.estaVazio()){
			System.out.println("A pilha está vazia.");
		} else {
			Elemento atual = pilha.topo;
			while (atual != null) {
				System.out.println(atual.getNum());
				atual = atual.getProximo();
			}
		}
	}
}
