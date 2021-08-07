/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cotardolar;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author user1
 */
public class CotarDolar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float cotdolar, reais, vldolar;
        DecimalFormat dc = new DecimalFormat("0.00");
        Scanner entr = new Scanner(System.in);
        System.out.println("44. Leia um valor em real (R$) e a cotação do dólar ($). Em seguida, \n" +
            "escreva o valor correspondente em dólares.:");
        System.out.print("\nDigite o valor em Reais R$ ");
            reais = entr.nextFloat();
        System.out.print("Digite a cotação atual do Dólar $ ");
            cotdolar = entr.nextFloat();
        vldolar = reais / cotdolar;
            System.out.println("\nAtualmente R$ " + dc.format(reais) + " correspondem a $ " + dc.format(vldolar) + " dólar(es).\n");
    }    
}