/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liinumeros;
import java.util.Scanner;
/**
 *
 * @author user1
 */
public class LiiNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, num3, resp;        
        Scanner entr = new Scanner(System.in);          
        System.out.println("7 - Faça um algoritmo/programa que leia 3 valores inteiros (considere que não serão\n" +
            "informados valores iguais) e escrever a soma dos 2 maiores. ");
        System.out.print("\nDigite o primeiro número: ");
            num1 = entr.nextInt();
        System.out.print("\nDigite o segundo número: ");
            num2 = entr.nextInt();
        System.out.print("\nDigite o terceiro número: ");
            num3 = entr.nextInt();        
        if(num1 > num3 && num2 > num3){  
            resp = num1 + num2;
            System.out.print("\n" + resp +".\n\n");                
        }
        if(num2 > num1 && num3 > num1){  
            resp = num2 + num3;
            System.out.print("\n" + resp +".\n\n");
        }
        if(num3 > num2 && num1 > num2){  
            resp = num1 + num3;
            System.out.print("\n" + resp +".\n\n");
        }
    }    
}