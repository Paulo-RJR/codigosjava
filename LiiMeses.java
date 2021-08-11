/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liimeses;
import java.util.Scanner;
/**
 *
 * @author user1
 */
public class LiiMeses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int mes;
        Scanner entr = new Scanner(System.in);
        System.out.println("14 - Usando switch, escreva um programa que leia um inteiro entre 1 e 12 e mostre o\n" +
            "mês correspondente a este número, isto é, janeiro se 1, fevereiro se 2, e assim\n" +
            "por diante.");
        System.out.print("\nDigite um número inteiro de 1 a 12: ");
            mes = entr.nextInt();
            switch(mes){
                case 1:
                    System.out.print("\nJaneiro.\n\n");
                    break;
                case 2:
                    System.out.print("\nFevereiro.\n\n");
                    break;
                case 3:
                    System.out.print("\nMarço.\n\n");
                    break;
                case 4:
                    System.out.print("\nAbril.\n\n");
                    break;
                case 5:
                    System.out.print("\nMaio.\n\n");
                    break;
                case 6:
                    System.out.print("\nJunho.\n\n");
                    break;
                case 7:
                    System.out.print("\nJulho.\n\n");
                    break;
                case 8:
                    System.out.print("\nAgosto.\n\n");
                    break;
                case 9:
                    System.out.print("\nSetembro.\n\n");
                    break;
                 case 10:
                    System.out.print("\nOutubro.\n\n");
                    break;
                case 11:
                    System.out.print("\nNovembro.\n\n");
                    break;
                case 12:
                    System.out.print("\nDesembro.\n\n");
                    break;
                default:
                    System.err.print("\nCaractere incorreto, reinicie o programa!!!!\n\n");
                    break;
            }
    }    
}