/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelvincelsius;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author user1
 */
public class KelvinCelsius {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float grauc, grauk;
        Scanner entr = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("0.00");
        System.out.println("22 - Leia uma temperatura em graus Kelvin e apresente-a convertida em graus\n" +
            "Celsius. A fórmula de conversão é: C = K – 273,15, sendo C a temperatura em Celsius e K a\n" +
            "temperatura em Kelvin.");
        System.out.print("\nDigite a temperatura em Kelvin: ");
            grauk = entr.nextFloat();
        grauc = grauk - 273.15f;
            System.out.print("\nA temparatura em graus Celsius é: " + dc.format(grauc) + "ºC.\n\n");
    }    
}