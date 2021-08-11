/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liiitabuada;

/**
 *
 * @author user1
 */
public class LiiiTabuada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int num = 8, tabu = 1, resp; //Para o uso do Laço "While".
       //int num = 8, tabu, resp; //Para o uso do Laço "FOR".
        System.out.println("10 - Escreva um algoritmo/programa que calcule e imprima a tabuada do 8 (1 a 10).");
       while(tabu <= 10){
           resp = num * tabu;
           System.out.print("\n" + num + " x " + tabu + " = " + resp);
           tabu = tabu+1;
       }
        System.out.print("\n");
        /*Com laço "FOR".
        for(tabu = 1; tabu <= 10; tabu ++){
            resp = num * tabu;            
           System.out.print("\n" + num + " x " + tabu + " = " + resp);
        }
        System.out.print("\n");*/
    }    
}