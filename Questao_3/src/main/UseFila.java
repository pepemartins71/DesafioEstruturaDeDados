package main;
import fila.Fila;
import pilha.Pilha;

public class UseFila {
    public static void main(String[] args) {
        Fila fila = new Fila();
        
        Pilha pilha1 = new Pilha();
        pilha1.empilha(1);
        pilha1.empilha(2);
        pilha1.empilha(3);
        
        Pilha pilha2 = new Pilha();
        pilha2.empilha(4);
        pilha2.empilha(5);
        pilha2.empilha(6);
        
        fila.inserePilha(pilha1);
        fila.inserePilha(pilha2);
        
        fila.insereNumero(7);
        fila.insereNumero(8);
        
        System.out.println("Fila de Pilhas:");
        fila.mostrarFila();
        
        Pilha removida = fila.removePilha();
        System.out.println("\nPilha Removida:");
        while (!removida.estaVazio()) {
            System.out.print(removida.desempilha() + " ");
        }
        System.out.println();
        
        System.out.println("\nFila após remoção:");
        fila.mostrarFila();
    }
}