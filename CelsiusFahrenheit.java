/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celsiusfahrenheit;
import java.util.Scanner;
/**
 *
 * @author user1
 */
public class CelsiusFahrenheit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       float grauc, grauf;
       Scanner entr = new Scanner(System.in);
        System.out.println("20 - Leia uma temperatura em graus Celsius e apresente-a convertida em graus\n" +
            "Fahrenheit. A fórmula de conversão é: F = C * (9,0/5,0) + 32,0, sendo F a\n" +
            "temperatura em Fahrenheit e C a temperatura em Celsius.");
        System.out.print("\nDigite a temperatura em graus Celsius: ");
            grauc = entr.nextFloat();
        grauf = (grauc * (9.0f / 5.0f)) + 32.0f;
            System.out.print("\nA temparatura em graus Fahrenheit é: " + grauf + " ºF.\n\n");
    }    
}