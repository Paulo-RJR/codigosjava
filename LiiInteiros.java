/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liiinteiros;
import java.util.Scanner;
/**
 *
 * @author user1
 */
public class LiiInteiros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int num1, num2;
       Scanner entr = new Scanner(System.in);
        System.out.println("11 - Ler dois valores e imprimir uma das três mensagens a seguir:\n" +
            "‘Números iguais’, caso os números sejam iguais\n" +
            "‘Primeiro é maior’, caso o primeiro seja maior que o segundo;\n" +
            "‘Segundo maior’, caso o segundo seja maior que o primeiro.");
         System.out.print("\nDigite o primeiro número: ");
            num1 = entr.nextInt();
        System.out.print("\nDigite o segundo número: ");
            num2 = entr.nextInt();
            if(num1 == num2){
                System.out.print("\nNúmeros iguais.\n");
            }else if(num1 > num2){
                System.out.print("\nPrimeiro é maior.\n");
            }else{
                System.out.print("\nSegundo é maior.\n");
            }
    }    
}