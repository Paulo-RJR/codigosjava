/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idades;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author user1
 */
public class Idades {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int idade;
   	double id_mes, id_dia, id_hora, id_min;
        DecimalFormat dc = new DecimalFormat("0.000");
        Scanner entr = new Scanner(System.in);
        System.out.println("14. Elaborar um algoritmo/programa que receba a idade de uma pessoa em anos,\n" +
            "calcule e escreva essa idade em:\n" +
            " Meses.\n" +
            " Dias – Ano Civil: 365 dias.\n" +
            " Horas.\n" +
            " Minutos.\n");
        System.out.print("Digite a idade da pessoa em ano(s): ");
            idade = entr.nextInt();
        id_mes = idade * 12;
            System.out.println("\nA sua idade em meses é:" + id_mes + " meses.");
        id_dia = idade * 365;
            System.out.println("A sua idade em dias é:" + dc.format(id_dia) + " dias.");
        id_hora = (idade * 365) * 24;
            System.out.println("A sua idade em horas é:" + dc.format(id_hora) + " horas.");
        id_min = ((idade * 365) * 24) * 60;
            System.out.println("A sua idade em minutos é:" + dc.format(id_min) + " minutos.\n");
    }    
}