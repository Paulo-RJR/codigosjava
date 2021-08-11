/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liiinumeros;
import java.util.Scanner;
//import java.text.DecimalFormat;
/**
 *
 * @author user1
 */
public class LiiiNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float cont=0, soma=0, num, media;        
        Scanner entr = new Scanner(System.in);       
        System.out.println("8 - Faça um programa que leia vários números, calcule e mostre:\n" +
            "a) A soma dos números digitados\n" + "b) A quantidade de números digitados\n" + 
            "c) A média dos números digitados"
            + "\nd) O maior número digitado\ne) O menor número digitado" +
            "\nFinalize a entrada de dados caso o usuário informe o valor 0.");
        System.out.print("\nDigite um número inteiro ou zero para encerrar: ");
            num = entr.nextFloat();            
        while(num != 0){
            soma = soma + num;
            cont = cont+1;            
            System.out.print("\nDigite um número inteiro ou zero para encerrar: ");
                num = entr.nextInt();
                //menor = num;               
        }
            System.out.print("\nA Soma dos números é: " + soma + ".\n");
            System.out.print("\nA quantidade de números é: " + cont+ ".\n");
            media = soma / cont;
            System.out.print("\nA média dos números é: " + media + ".\n");
            if(num == 0){            
            System.out.print("\n!!! Programa Finalizado com sucesso !!!\n\n");            
            }//Falta exibir os valores maior e menor.
    }    
}