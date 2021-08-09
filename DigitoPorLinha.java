/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digitoporlinha;
import java.util.Scanner;
/**
 *
 * @author user1
 */
public class DigitoPorLinha {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, dig1, dig2, dig3, dig4;
        Scanner entr = new Scanner(System.in);
        System.out.println("Programa para mostrar um número inteiro de quatro");
        System.out.println("dígitos (de 1000 a 9999) digitado pelo usuário um");
        System.out.println("digito por linha:");
        System.out.print("\nDigite o número inteiro: ");
        num = entr.nextInt();
            dig1 = (num / 1000);            
            System.out.println("\n" + dig1);
                dig2 = (num / 100) % 10;
                System.out.println(dig2);
                    dig3 = ((num % 100) / 10);
                    System.out.println(dig3);
                        dig4 = num % 10;
                        System.out.println(dig4 + "\n");
    }    
}