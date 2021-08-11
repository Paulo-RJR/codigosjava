/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liiifibonacci;
import java.util.Scanner;
/**
 *
 * @author user1
 */
public class LiiiFibonacci {

    /**
     * @param args the command line arguments
     */
    public static long fibonacci(int n) {
        return n < 2 ? n : fibonacci(n - 2) + fibonacci(n - 1);
    }
    public static void main(String[] args) {        
        /*Scanner entr = new Scanner(System.in);
        int num, num1 = 1, num2 = 1, num3;
        System.out.println("7 - Leia um número positivo do usuário, então, "
                + "calcule e escreva a sequência \nFibonacci até o primeiro "
                + "número superior ao número lido. Exemplo: se o usuário\n" +
            "informou o número 30, a sequência a ser impressa será: 0 1 1 2 3 "
                + "5 8 13 21 34.");
        System.out.print("\nDigite um número inteiro: ");
            num = entr.nextInt();
        System.out.print("\n");
        System.out.print("0 ");
        System.out.print("1 ");
        System.out.print("1 ");
        num = num - 2;
        while (num  > (num1 + num2)) {
            System.out.print((num1 + num2) + " ");
            num3 = num1+num2;
            num1 = num2;
            num2 = num3;
            num++;
        }
        System.out.println((num1 + num2) + "\n");   */        
        for (int i = 0; i <= 10; i++) {
            System.out.println("Entrada: " + i + "\t Saída: " + fibonacci(i));
        }
        
    }    
}