/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pilha;


import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Michel
 */
public class Pilha<T> {
    
    private List<T> itens = new LinkedList<T>();
    
    public void insere(T t){
        this.itens.add(t);
    }
    public T remove(){
       return this.itens.remove(this.itens.size() - 1);
        
    }
    public boolean vazia(){
        return this.itens.size() == 0;
    }
    public int tamanho(){
        return this.itens.size();
    }
}
