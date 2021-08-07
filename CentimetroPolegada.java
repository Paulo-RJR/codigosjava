/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package centimetropolegada;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author user1
 */
public class CentimetroPolegada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double cent, pole;
        Scanner entr = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("0.00");
        System.out.println("31 - Leia um valor de comprimento em centímetros e apresente-o convertido em\n" +
        "polegadas. A fórmula de conversão é: P = C / 2,54, sendo C o comprimento em\n" +
        "centímetros e P o comprimento em polegadas.");
        System.out.print("\nDigite o comprimento em Centímetros (cm): ");
            cent = entr.nextDouble();
                pole = cent / 2.54;
            System.out.print("\nO Comprimento em Centímetros é: " + dc.format(pole) + "\".\n\n");        
    }    
}