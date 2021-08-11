/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liiiregressiva;

/**
 *
 * @author user1
 */
public class LiiiRegressiva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont;
        cont = 10;
        
        System.out.println("3 - Faça um programa utilizando o comando while que mostra uma contagem\n" +
            "regressiva na tela, iniciando em 10 e terminando em 0. Mostrar uma mensagem\n" +
            "“FIM!” após a contagem.\n");        
        /*for(cont=10 ; cont >= 0; cont--){
            System.out.println(cont);
        }*/
        //cont = cont --;
        while(cont > -1){           
            System.out.println(cont);
            cont = cont -1;            
        }
        System.out.println("\n" + "\"FIM!\"" + "\n");
    }    
}