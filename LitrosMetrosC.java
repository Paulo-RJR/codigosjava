/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package litrosmetrosc;
import java.util.Scanner;
/**
 *
 * @author paulo
 */
public class LitrosMetrosC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float m, l;
        Scanner entrf = new Scanner(System.in);
        System.out.println("33 - Leia um valor de volume em litros e apresente-o convertido \n" +
            "em metros cúbicos m³. A fórmula de conversão é: M = L / 1000, sendo L o volume \n" +
            "em litros e M o volume em metros cúbicos.");
        System.out.print("\nDigite o volume em litros: ");
            l  = entrf.nextFloat();
        m = l / 1000;
            System.out.print("\nO volume em metros cúbicos é: " + m + " m³.\n\n");
    }    
}