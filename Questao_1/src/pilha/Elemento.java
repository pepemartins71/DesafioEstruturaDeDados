package pilha;

public class Elemento {
	String letra;
	Elemento proximo;
	
	public Elemento(String l) {
		this.letra = l;
		this.proximo = null;
	}
	
	public String getLetra(){
        return this.letra;
    }
    
    public void setLetra(String letra){
        this.letra = letra;
    }
    
    public Elemento getProximo(){
        return this.proximo;
    }
    
    public void setProximo(Elemento proximo){
        this.proximo = proximo;
    }
}
