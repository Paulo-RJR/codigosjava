/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areacirculo;
    import java.util.Scanner;
    import java.text.DecimalFormat;
/**
 *
 * @author paulo
 */
public class AreaCirculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrf = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("0.00");
        float circ, area;
        System.out.println("48. Leia o valor do raio de um círculo e calcule e mostre a área do círculo\n" +
            "correspondente. A área do círculo é: Pi * R², onde R é o raio e Pi = 3,14.");
        System.out.print("\nDigite o raio do círculo: ");
            circ = entrf.nextFloat();
        area = 3.14f + (circ * circ); // poderia ser: quad = lad * lad;
            System.out.print("\nÁrea do seu Círculo é: " + dc.format(area) + ".\n\n");       
    }    
}