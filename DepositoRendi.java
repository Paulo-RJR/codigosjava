/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package depositorendi;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author user1
 */
public class DepositoRendi {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         float dep, txjuros, rend, deprend;
         DecimalFormat dc =  new DecimalFormat("0.00");
         Scanner entr = new Scanner(System.in); 
        System.out.println("19 - Fazer um algoritmo/programa que receba o valor de um depósito e \n" +
            "de juros. Calcule e imprima o valor do rendimento e o valor total depois do\n" +
            "o valor da taxa rendimento.");        
        System.out.print("\nDigite o valor do seu depósito - R$ ");
            dep = entr.nextFloat();
        System.out.print("Digite o valor da taxa de juros (%): ");
            txjuros = entr.nextFloat();
        rend = (dep * txjuros)/100f;
            System.out.println("\nA taxa de juros é - R$ " + dc.format(rend) + ".");
        deprend = dep + rend;
            System.out.println("O depósito e a taxa de juros juntos são - R$ " + dc.format(deprend) + ".\n");
    }   
}