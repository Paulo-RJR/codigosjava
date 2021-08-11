/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liiisomarimpar;
import java.util.Scanner;
/**
 *
 * @author user1
 */
public class LiiiSomarImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont, num1, num2, simpar = 0; //resp, resp1;
        Scanner entr = new Scanner(System.in);
        System.out.println("6 - Faça um programa que some os números impares contidos em um intervalo\n" +
            "definido pelo usuário. O usuário define o valor inicial do intervalo e o valor final\n" +
            "deste intervalo, e o programa deve somar todos os números ímpares contidos\n" +
            "neste intervalo. Caso o usuário digite um intervalo inválido (começando por um\n" +
            "valor maior que o valor final) deve ser escrito uma mensagem de erro na tela,\n" +
            "“Intervalo de valores inválido” e o programa termina. Exemplo de tela de saída:\n" +
            "Digite o valor inicial e valor final: 5 e 10: Soma dos ímpares neste intervalo: 21");
        System.out.print("\nDigite o primeiro número: ");
            num1 = entr.nextInt();
        System.out.print("\nDigite o segundo número: ");
            num2 = entr.nextInt();
           /*resp = num1 + num2;
           System.out.println("\n" + resp + "\n");
           resp1 = num1 * num2;
           System.out.println("\n" + resp1 + "\n");*/
        if(num2 > num1){
            for(cont = num1; cont <= num2; cont ++)
            {
                //cont;
                if(cont % 2 > 0)
                {
                    simpar = simpar + cont;
                }
            }/*else{
                    mimpar = mimpar * cont; 
                }
                /*if(cont % 2 > 0){
                    mimpar = mimpar * cont;
                }*/
        }else{
            System.err.print("\n“Intervalo de valores inválido.”\n\n");
            System.exit(0);
        }
        //System.out.print("\n" + spar + "\n");
        System.out.print("\nA soma é: " + simpar + "\n\n");
        /*System.out.print("\n");
        for(cont = 0  ; cont <= num1; cont++){
            System.out.println(cont);
        } 
        System.out.print("\n");*/
    }       
}