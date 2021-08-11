/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liiiparimpar;
import java.util.Scanner;
/**
 *
 * @author user1
 */
public class LiiiParImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont, num1, num2, spar = 0, mimpar = 1, resps, respm; //resp, resp1;
        Scanner entr = new Scanner(System.in);
        System.out.println("5 - Faça um programa que receba dois números. Calcule e mostre:\n" +
            "1. A soma dos números pares desse intervalo de números, incluindo os\n" +
            "números digitados;\n" + "2. A multiplicação dos números ímpares desse intervalo, incluindo os\n" +
            "digitados.");
        System.out.print("\nDigite o primeiro número: ");
            num1 = entr.nextInt();
        System.out.print("\nDigite o segundo número: ");
            num2 = entr.nextInt();
            resps = (num1 + num2);
            respm = (num1 * num2);
            //1
            //System.out.print(resp + "\n");
           /*resp = num1 + num2;
           System.out.println("\n" + resp + "\n");
           resp1 = num1 * num2;
           System.out.println("\n" + resp1 + "\n");*/
        if(num2 > num1){
            for(cont = num1; cont < num2; cont ++)
            {
                //cont;
                if(cont % 2 == 0)
                {
                    spar = spar + cont;
                }if(cont % 2 != 0){
                    mimpar = mimpar * cont; 
                }
                /*if(cont % 2 > 0){
                    mimpar = mimpar * cont;
                }*/
                }
        }        
        System.out.print("\nA soma dos números pares é: " + (spar + resps) + "\n");
        System.out.print("\nA multiplicação dos números impares é: " + (mimpar * respm) + "\n\n");
        /*System.out.print("\n");
        for(cont = 0  ; cont <= num1; cont++){
            System.out.println(cont);
        } 
        System.out.print("\n");*/
    }   
}
