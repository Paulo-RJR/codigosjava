/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liiinumeroswdwf;

/**
 *
 * @author user1
 */
public class LiiiNumerosWDwF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contf, contw, contdw;                 
        contw = 1;
        contdw = 1;
        System.out.println("2 - Faça um programa que escreva na tela, de 1 até 100, de 1 em 1, 3 vezes. A\n" +
            "primeira vez deve usar a estrutura de repetição for, a segunda while, e a terceira\n" +
            "do while.\n");
        System.out.println("1 - For: \n");
        for(contf = 1; contf <= 100; contf ++){
            System.out.println(contf);
        }
        System.out.println("\n2 - While: \n");
        while(contw <= 100){           
            System.out.println(contw);
            contw = contw +1;            
        }
        System.out.println("\n3 - Do While: \n");
        do{
            System.out.println(contdw);
            contdw = contdw +1;
        }while(contdw <= 100);
        System.out.print("\n");
    }    
}