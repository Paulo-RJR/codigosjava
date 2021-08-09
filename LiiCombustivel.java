/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liicombustivel;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author user1
 */
public class LiiCombustivel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double gas=3.30, alc=2.90, lit, resp;
        char comb;
        DecimalFormat dc = new DecimalFormat("0.00");
        Scanner entrd = new Scanner(System.in);
        Scanner entrc = new Scanner(System.in);
        System.out.println("12 - Um posto está vendendo combustíveis com a seguinte tabela de descontos:\n" +
            "Escreva um algoritmo/programa que leia o número de litros vendidos e o tipo de\n" +
            "combustível (codificado da seguinte forma: A-álcool, G-gasolina), calcule e\n" +
            "escreva o valor a ser pago pelo cliente sabendo-se que o preço do litro da\n" +
            "gasolina é R$ 3,30 e o preço do litro do álcool é R$ 2,90.");
        System.out.print("\nEscolha o combustível no menu abaixo:\n");
        System.out.print("\nDigite G ou g para Gasolina: ");
        System.out.print("\nDigite A ou a para Álcool: ");
            comb = entrc.nextLine().charAt(0);
            switch(comb){
                case 'G': case 'g':
                    System.out.print("\nDigite a quantidade de litros abastecidos: ");
                        lit = entrd.nextDouble();
                        if(lit <= 20){
                            resp = (lit * gas) - ((lit * gas) * 0.3);
                            System.out.print("\nTotal a pagar: R$ "+ dc.format(resp) + ".\n\n");
                                    
                        }else{
                            resp = (lit * gas) - ((lit * gas) * 0.5);
                            System.out.print("\nTotal a pagar: R$ "+ dc.format(resp) + ".\n\n");
                        }
                        break;
                 case 'A': case 'a':
                    System.out.print("\nDigite a quantidade de litros abastecidos: ");
                        lit = entrd.nextDouble();
                        if(lit <= 20){
                            resp = (lit * alc) - ((lit * alc) * 0.4);
                            System.out.print("\nTotal a pagar: R$ "+ dc.format(resp) + ".\n\n");
                                   
                        }else{
                            resp = (lit * alc) - ((lit * alc) * 0.6);
                            System.out.println("\nTotal a pagar: R$ "+ dc.format(resp) + ".\n\n");
                        }
                        break;
                 default:
                        System.err.println("\nOpção invalida, reinicie o programa !!!!");
                        System.exit(0);
                        break;
            }
    }    
}