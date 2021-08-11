/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liimacas;
import java.util.Scanner;
/**
 *
 * @author user1
 */
public class LiiMacas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int ma;
        Scanner entr = new Scanner(System.in);
        System.out.println("1 - As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$\n" +
        "1,00 se forem compradas pelo menos 12. Escreva um algoritmo/programa que\n" +
        "leia o número de maçãs compradas, calcule e escreva o custo total da compra.");
        System.out.print("\nDigite a quantidade de maças compradas: ");
            ma = entr.nextInt();
                if(ma < 12){
                    System.out.print("Você comprou " + ma + " maças que custa R$ 1,30 cada.");
                }
                if(ma >= 12){
                    System.out.print("Você comprou " + ma + " maças que custa R$ 1,00 cada.\n");
                }        
    }    
}