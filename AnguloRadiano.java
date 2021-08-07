/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anguloradiano;
import java.util.Scanner;
import java.text.DecimalFormat;
//import java.lang.Math; //Biblioteca para usar o valor de PI(3,1416) em Matemática (Não precida desta biblioteca).
/**
 *
 * @author user1
 */
public class AnguloRadiano {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double ang, rad;
        Scanner entr = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("0.00000");
        System.out.println("28 - Leia um ângulo em graus e apresente-o convertido em radianos. A fórmula de\n" +
        "conversão é: R = G * Pi /180, sendo G o ângulo em graus e R em radianos e Pi = 3,14.\n");
        System.out.print("\nDigite o Ângulo em graus: ");
            ang = entr.nextDouble();
                rad = ang * Math.PI / 180;
                System.out.print("\nO Radianos é: " + dc.format(rad) + ".\n\n");
    }    
}