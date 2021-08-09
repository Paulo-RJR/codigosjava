/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jardasmetros;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author user1
 */
public class JardasMetros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double jdr, mtr;
        Scanner entr = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("0.00");
        System.out.println("36 - Leia um valor de comprimento em jardas e apresente-o convertido em metros. A\n" +
        "fórmula de conversão é: M = 0,91 * J, sendo J o comprimento em jardas e M o\n" +
        "comprimento em metros.");
        System.out.print("\nDigite o comprimento em Jardas: ");
            jdr = entr.nextDouble();
        mtr = 0.91 * jdr;
        System.out.print("\nO comprimento em metros é: " + dc.format(mtr) + "m.\n\n");
    }    
}