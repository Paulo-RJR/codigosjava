/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package massaquilogramas;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author user1
 */
public class MassaQuilogramas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double kg, lb;
        Scanner entr = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("0.000");
        System.out.println("35 - Leia um valor de massa em libras e apresente-o convertido em quilogramas. A\n" +
        "fórmula de conversão é: K = L * 0,45, sendo K a massa em quilogramas e L a\n" +
        "massa em libras.");
        System.out.print("\nDigite a massa em Libras: ");
            lb = entr.nextDouble();
            kg = lb / 0.45;
        System.out.print("\nA massa em quilogramas é: " + dc.format(kg) + "kg.\n");
        System.out.print("\nObs.: A formula esta errada e a correta seria (K = L / 0,45), segundo vários\n" + 
        "sites no Google.\n\n");
    }    
}