/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antecessorsucessor;
    import java.util.Scanner;
/**
 *
 * @author paulo
 */
public class AntecessorSucessor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, resp;
        Scanner entr = new Scanner(System.in);
        System.out.println("45 - Leia um número inteiro e escreva o seu antecessor e o seu sucessor.");
        System.out.print("\nDigite um número inteiro: ");
            num = entr.nextInt();
        resp = num - 1;
            System.out.print("\nAntecessor: " + resp);
        resp = num + 1;
            System.out.print("\nSucessor: " + resp + "\n\n");  
    }    
}