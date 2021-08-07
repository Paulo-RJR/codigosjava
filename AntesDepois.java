/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antesdepois;
import java.util.Scanner;
/**
 *
 * @author user1
 */
public class AntesDepois {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, ant, dep;
        Scanner entr = new Scanner(System.in);
        System.out.println("FMU - Exercícios Complementares - Estrutura Sequencial:");
        System.out.println("6 - Escreva um algoritmo para ler um valor (do teclado)");
        System.out.println("e escrever (na tela) o seu antecessor e o seu sucessor.");
        System.out.print("\nDigite um número: ");
        num  = entr.nextInt();
        ant = num - 1;
        System.out.print("\nO antecesso de " + num + " é: " + ant + ".");
        dep = num + 1;
        System.out.print("\nO sucessor de " + num + " é: " + dep + ".\n\n");
    }    
}