/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liiimaiormedia;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author user1
 */
public class LiiiMaiorMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        int q_num, cont = 0;
        float media, x, soma = 0, maior = 0, num1;
        Scanner entr = new Scanner(System.in);
        Scanner entrf = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("0.00");
        System.out.println("15 - Faça um algoritmo/programa para ler uma quantidade e a seguir ler esta\n" +
            "quantidade de números. Depois de ler todos os números o algoritmo deve\n" +
            "apresentar na tela o maior dos números lidos e a média dos números lidos.\n");
        System.out.print("Digite a quantidade de números: ");
        q_num = entr.nextInt();
        System.out.print("\n");
        while(cont < q_num){
            System.out.print("Número: ");
                x = entrf.nextFloat();
                soma = soma + x;
                cont = cont + 1;
                num1 = x;
           /* if(cont == 1){
                maior = num1;
            }*/
            if(num1 > maior){
                maior = num1;
            }
        }
        System.out.println("\nO maior é: " + dc.format(maior) + ".");
        media = soma / q_num;
        System.out.println("\nA média das notas dos alunos é: " + dc.format(media) + ".\n\n");                              
    }    
}