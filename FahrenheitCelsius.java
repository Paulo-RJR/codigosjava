/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fahrenheitcelsius;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author user1
 */
public class FahrenheitCelsius {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float grauc, graufa;
        Scanner entr = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("0.00");
        System.out.println("21 - Leia uma temperatura em graus Fahrenheit e apresente-a convertida em graus\n" +
            "Celsius. A fórmula de conversão é: C = 5,0 * (F – 32,0) / 9,0, sendo C a\n" +
            "temperatura em Celsius e F a temperatura em Fahrenheit.");
        System.out.print("\nDigite a temperatura em Fahrenheit: ");
            graufa = entr.nextFloat();
        grauc = 5f * (graufa - 32f) / 9f;
            System.out.print("\nA temparatura em graus Celsius é: " + dc.format(grauc) + "ºC.\n\n");
    }    
}