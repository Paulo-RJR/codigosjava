/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liiinvalores;
import java.util.Scanner;
/**
 *
 * @author user1
 */
public class LiiiNValores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, cont;
        //int num, cont=0;
        Scanner entr = new Scanner(System.in);
        System.out.println("9 - Ler um valor N e escreva todos os valores inteiros entre 1 (inclusive) e N\n" +
            "(inclusive). Considere que o N será sempre maior que ZERO.");
        System.out.print("\nDigite um número: ");
            num = entr.nextInt();
            if(num > 0){
                for(cont = 1; cont <= num; cont++){
                    System.out.print(cont + "\n");                   
                }
            }else{
                System.out.print("\nFavor digitar um número maior que zero:\n");
            }           
            /*while(cont < num){ //Com Laço "While".
                cont ++;
                 System.out.print(cont + "\n");                 
            }
            if(num == 0){
                     System.out.print("\nFavor digitar um número maior que zero:\n");
            }*/
            /*do{//Execução ok, esta apenas com um erro de lógica.
                cont ++;
                 System.out.print(cont + "\n"); 
            }while(cont < num);
                if(num == 0){
                     System.out.print("\nFavor digitar um número maior que zero:\n");
            }*/
    }    
}