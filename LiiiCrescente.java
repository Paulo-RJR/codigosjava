/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liiicrescente;
import java.util.Scanner;
/**
 *
 * @author user1
 */
public class LiiiCrescente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont, num;
        Scanner entr = new Scanner(System.in);
        System.out.println("4 - Faça um programa que leia um número inteiro positivo N e escreva todos os\n" +
            "números naturais de 0 até N em ordem crescente.");
        System.out.print("\nDigite um número inteiro: ");
            num = entr.nextInt();
        System.out.print("\n");
        for(cont = 0  ; cont <= num; cont++){
            System.out.println(cont);
        } 
        System.out.print("\n");
    }    
}