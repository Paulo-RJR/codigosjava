/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package massalibras;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author user1
 */
public class MassaLibras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double kg, lb;
        Scanner entr = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("0.00000");
        System.out.println("34 - Leia um valor de massa em quilogramas e apresente-o convertido em libras. A\n" +
            "fórmula de conversão é: L = K / 0,45, sendo K a massa em quilogramas e L a\n" +
            "massa em libras.");
        System.out.print("\nDigite a massa em Quilogramas (kg): ");
            kg = entr.nextDouble();
            lb = kg * 0.45;
        System.out.print("\nA massa em libras é: " + dc.format(lb) + ".\n");
        System.out.print("\nObs.: A formula esta errada e a correta seria (L = K * 0,45), segundo vários\n" + 
            "sites no Google.\n\n");
    }    
}