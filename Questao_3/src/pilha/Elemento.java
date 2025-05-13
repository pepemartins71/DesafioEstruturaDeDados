package pilha;

public class Elemento {
	int num;
	Elemento proximo;
	
	public Elemento(int n) {
		this.num = n;
		this.proximo = null;
	}
	
	public int getNum(){
        return this.num;
    }
    
    public void setNum(int num){
        this.num = num;
    }
    
    public Elemento getProximo(){
        return this.proximo;
    }
    
    public void setProximo(Elemento proximo){
        this.proximo = proximo;
    }
}