/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arearetangulo;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author user1
 */
public class AreaRetangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float ret, bas, alt;
        DecimalFormat dc = new DecimalFormat("0.00");
        Scanner entr = new Scanner(System.in);
        System.out.println("FMU - Exercícios Complementares - Estrutura Sequencial:");
        System.out.println("7 - Escreva um algoritmo/programa para ler as dimensões");
        System.out.println("de um retângulo (base e altura), calcular e escrever a");
        System.out.println("área do retângulo.");
        System.out.print("\nDigite a base do seu retângulo: ");
        bas = entr.nextFloat();
            System.out.print("Digite a altura do seu retângulo: ");
            alt = entr.nextFloat();
                ret = bas * alt;
                System.out.println("\nÁrea do retângulo é: " + dc.format(ret) + ".\n");
    }    
}