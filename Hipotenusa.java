/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hipotenusa;
    import java.util.Scanner;
    import java.text.DecimalFormat;
    import java.math.*; //Biblioteca para usar a fórmula do calculo da Hipotenusa. 
/**
 *
 * @author paulo
 */
public class Hipotenusa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double hipote, a, b;
        Scanner entrd = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("0.00"); 
        System.out.println("49 - Sejam a e b os catetos de um triângulo, onde a hipotenusa é obtida pela equação:\n" +
            "(hipotenusa)² = a² + b². Faça um programa que receba os valores de a e b e calcule o valor da \n" +
            "hipotenusa através da equação. Mostre o resultado dessa operação:\n");
        System.out.print("Didite o valor de a: ");
            a = entrd.nextDouble();
        System.out.print("Digite o valor de b: ");
            b = entrd.nextDouble();
        hipote = Math.hypot(a, b);        
            System.out.print("\nA Hipotenusa é: " + dc.format(hipote) + "\n\n");
        //OU
            //hipote = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));       
        //System.out.print("\nA Hipotenusa é: " + dc.format(hipote) + "\n\n");
    }    
}