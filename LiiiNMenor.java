/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liiinmenor;
import java.util.Scanner;
/**
 *
 * @author user1
 */
public class LiiiNMenor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cont, num, soma=0;
        Scanner entr = new Scanner(System.in);
        System.out.println("12 - Escreva um algoritmo para ler 10 números "
            + "inteiros. " + "Todos os números lidos com valor\n" + 
            " inferior a 40 devem " + "ser somados. Escreva o valor final "
            + "da soma efetuada.\n");
        for(cont = 1; cont <= 3; cont++){
            System.out.print("Digite o " + cont + "º número: ");
                num = entr.nextInt();
                if(num <= 40){
                    //soma = soma + num;
                    soma += num;
                }/*else{  //Melhorado dia 30/08/2020.                    
                    System.err.println("Número Inválido: ");
                    cont--;                    
                }*/            
        }
        System.out.print("\nO valor final da soma é: " + soma +".\n\n");
    }    
}