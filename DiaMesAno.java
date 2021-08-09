/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diamesano;
import java.util.Scanner;
/**
 *
 * @author paulo
 */
public class DiaMesAno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dia, mes, ano, anoatual, rano, rdia, rmes;
        Scanner entr = new Scanner(System.in);
        System.out.println("8. Faça um algoritmo/programa que leia a idade de uma pessoa expressa em anos,\n" +
            "meses e dias e escreva a idade dessa pessoa expressa apenas em dias. Considerar\n" +
            "ano com 365 dias e mês com 30 dias.\n");
        System.out.print("Digite o seu dia (dd) de nascimento: ");
            dia = entr.nextInt();
        System.out.print("Digite o seu mês (mm) de nascimento: ");
            mes = entr.nextInt();
        System.out.print("Digite o seu ano (aaaa) de nascimento: ");
            ano = entr.nextInt();
        System.out.print("\nDigite o ano atual (aaaa): ");
            anoatual = entr.nextInt();
        rano = anoatual - ano;
        rmes = 12 * rano;
        rdia = rmes * 30;
        System.out.println("\n\nVocê nasceu em: " + dia + "\\" + mes + "\\" + ano + " e em " + anoatual + " terá:");
        System.out.print("\n" + rano + " ano(s).");
        System.out.print("\n" + rmes + " mês(es).");
        System.out.print("\n" + rdia + " dia(s).\n\n");        
    }    
}