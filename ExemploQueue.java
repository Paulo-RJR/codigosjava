/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemploqueue;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
/**
 *
 * @author paulo
 */
public class ExemploQueue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Usando um Queue - Linked List.
        Queue<String> filaFiFo = new LinkedList<>();
        filaFiFo.add("Patrícia");
        filaFiFo.add("Roberto");
        filaFiFo.add("Flávio");
        filaFiFo.add("Pamela");
        filaFiFo.add("Anderson");
        System.out.println(filaFiFo);
        
        //Para remove e mostra o primeiro item d fila (mostra nulo se a fila estiver vazia).
        /*String saiDoFiFo = filaFiFo.poll();
        System.out.println(saiDoFiFo);
        System.out.println(filaFiFo);*/
        
        //Mostra o primeiro item d fila (mostra nulo se a fila estiver vazia).
        /*String primeiroFiFo = filaFiFo.peek();
        System.out.println(primeiroFiFo);
        System.out.println(filaFiFo);*/
        
        //filaFiFo.clear(); //Limpar a fila(esta sendo usado para testar o comando "element").
        //Uso de Exceção caso a fila esteja vazia (o que não pode ocorrer nunca).
        /*String erroNoFiFo = filaFiFo.element();
        System.out.println(erroNoFiFo);
        System.out.println(filaFiFo);  */
        
        //Uso do For eat para navegar na fila.
        /*for(String fila: filaFiFo){
            System.out.println(fila);
        }*/
        
        //Uso do Iterator para navegar na fila
        /*Iterator<String> navegarFila = filaFiFo.iterator();
        while(navegarFila.hasNext()){
            System.out.println("→ " + navegarFila.next());
        }
        
        //Para saber quantos elementos possui a fila.
        System.out.println(filaFiFo.size());
        
        //Para ver se a fila esta vazia.
        System.out.println(filaFiFo.isEmpty());*/
        
        //Para adicionar um elemento a fila.
        filaFiFo.add("Paulo");
        System.out.println(filaFiFo);
    }    
}