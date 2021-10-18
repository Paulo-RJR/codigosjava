/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metroshectares;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author user1
 */
public class MetrosHectares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double hec, mtrq;
        Scanner entr = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("0.0000000");
        System.out.println("40 - Leia um valor de área em metros quadrados m² e apresente-o convertido em\n" +
            "hectares. A fórmula de conversão é: HH = M * 0,0001, sendo M a área em metros\n" +
            "quadrados e H a área em hectares.");
        System.out.print("\nDigite o comprimento em Metros Quadrados: ");
            mtrq = entr.nextDouble();
        hec = mtrq * 0.0001;
            System.out.print("\nO comprimento em Hectares é: " + dc.format(hec) + ".\n\n");
    }    
}