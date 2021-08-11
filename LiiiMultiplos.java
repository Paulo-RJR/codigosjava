/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liiimultiplos;

/**
 *
 * @author user1
 */
public class LiiiMultiplos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont, resp;
        cont = 0; 
        resp = 0;        
        System.out.println("1 - Faça um programa que determine e mostre os\n" + 
            "cinco primeiros múltiplos de 3, considerando \n" + 
            "números maiores que 0.\n");
        while(cont <= 4){            
            resp = resp + 3;
            System.out.println(resp);
            cont = cont +1;            
        } 
        System.out.print("\n");
    }    
}