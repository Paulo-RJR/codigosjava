/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liitimes;
import java.util.Scanner;
/**
 *
 * @author user1
 */
public class LiiTimes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ta, tb;
        int  ga, gb;        
        Scanner entr = new Scanner(System.in); 
        Scanner entrs = new Scanner(System.in);
        System.out.println("10 - Construir algoritmo/programa que leia o nome de 2 times e o número de gols\n" +
            "marcados na partida (para cada time). Escrever o nome do vencedor. Caso não\n" +
            "haja vencedor deverá ser impressa a palavra EMPATE.");
        System.out.print("\nDigite o nome do primeiro time: ");
            ta = entrs.next();
        System.out.print("\nDigite o número de gol(s) do primeiro time: ");
            ga = entr.nextInt();
        System.out.print("\nDigite nome do segundo time: ");
            tb = entrs.next();
        System.out.print("\nDigite o número de gol(s) do segundo time: ");
            gb = entr.nextInt();        
        if(ga > gb){             
            System.out.print("\n" + ta + " - É o Vencedor.\n\n");             
        }
        if(gb > ga){             
            System.out.print("\n" + tb + " - É o Vencedor.\n\n");                
        }
        if(ga == gb){
            System.out.print("\n\t --- EMPATE ---\n\n");
        }                 
    }    
}