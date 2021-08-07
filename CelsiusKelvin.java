/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celsiuskelvin;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author user1
 */
public class CelsiusKelvin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float grauc, grauk;
        Scanner entr = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("0.00");
        System.out.println("23 - Leia uma temperatura em graus Celsius e apresente-a convertida em graus\n" +
            "Kelvin. A Fórmula de conversão é: K = C + 273,15, sendo C a temperatura em\n" +
            "Celsius e K a temperatura em Kelvin.");
        System.out.print("\nDigite a temperatura em Celsius: ");
            grauc = entr.nextFloat();
        grauk = grauc + 273.15f;
            System.out.print("\nA temparatura em graus Kelvin é: " + dc.format(grauk) + "K.\n\n");
    }    
}