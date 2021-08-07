/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acresmetros;
import java.util.Scanner;
/**
 *
 * @author user1
 */
public class AcresMetros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double acr, mtrq;
        Scanner entr = new Scanner(System.in);        
        System.out.println("39 - Leia um valor de área em acres e apresente-o convertido em metros quadrados\n" +
            "m². A fórmula de conversão é: M = A * 4048,58, sendo M a área em metros\n" +
            "quadrados e A a área em acres.");
        System.out.print("\nDigite o comprimento em Acres: ");
            acr = entr.nextDouble();
        mtrq = acr * 4048.58;
            System.out.print("\nO comprimento em Metros Quadrados é: " + mtrq + " m².\n\n");
    }    
}