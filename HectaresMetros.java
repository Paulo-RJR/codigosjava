/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hectaresmetros;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author user1
 */
public class HectaresMetros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double hec, mtrq;
        Scanner entr = new Scanner(System.in); 
        DecimalFormat dc = new DecimalFormat("0.00");       
        System.out.println("41 - Leia um valor de área em hectares e apresente-o convertido em metros\n" +
            "quadrados m2. A fórmula de conversão é: M = H * 10000, sendo M a área em\n" +
            "metros quadrados e H a área em hectares.");
        System.out.print("\nDigite o comprimento em Hectares: ");
            hec = entr.nextDouble();
        mtrq = hec * 10000;
            System.out.print("\nO comprimento em Metros Quadrados é: " + dc.format(mtrq) + " m².\n\n");
    }    
}