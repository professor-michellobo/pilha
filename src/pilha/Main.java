/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilha;

/**
 *
 * @author Michel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pilha<ItemPilha> pilha = new Pilha<ItemPilha>();
        
        ItemPilha peca = new ItemPilha();
        peca.setId(10);
        peca.setNome("Peca 1");
        pilha.insere(peca);

        peca = new ItemPilha();
        peca.setId(11);
        peca.setNome("Peca 2");
        pilha.insere(peca);

        ItemPilha pecaRemovida;
        

        int tamanho = pilha.tamanho();
        for (int i = 0; i < tamanho; i++) {
            pecaRemovida = pilha.remove();
            System.out.println(pecaRemovida.getNome());
        }
    }
}
