/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liiicmedia15;
import java.text.DecimalFormat;
/**
 *
 * @author user1
 */
public class LiiiCMedia15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float soma = 0, quant = -1, cont = 15, media;
        DecimalFormat dc = new DecimalFormat("0.00");
        System.out.println("14 - Faça um algoritmo/programa que calcule e escreva a média aritmética dos\n" +
            "números inteiros entre 15 (inclusive) e 100 (inclusive).");
        while(cont <= 100){
            soma = soma + cont;
            quant ++;
            cont ++;
        }
        media = soma / quant;
        System.out.print("\n A média aritmética dos números inteiros é: " + dc.format(soma) + ".\n\n");
        System.out.print("\n A média aritmética dos números inteiros é: " + dc.format(media) + ".\n\n");
    }    
}