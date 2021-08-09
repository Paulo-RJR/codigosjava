/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liicardapio;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author user1
 */
public class LiiCardapio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float vlt;  
        int lanqt,cod;
        Scanner entr = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("0.00");
        System.out.println("Escrever um programa que leia o código do produto escolhido do cardápio de\n" +
            "uma lanchonete e a quantidade. O programa deve calcular o valor a ser pago por\n" +
            "aquele lanche. Considere que a cada execução somente será calculado um\n" +
            "pedido. O cardápio da lanchonete segue o padrão abaixo:");        
        System.out.print("\n------------------------------------------------------------------\n");
        System.out.print("|                         Cardápio:                              |\n");
        System.out.print("------------------------------------------------------------------\n");
        System.out.print("|     Cachorro Quente   |       100        |       R$ 1,20       |\n");
        System.out.print("------------------------------------------------------------------\n");
        System.out.print("|     Bauru Simples     |       101        |       R$ 1,30       |\n");
        System.out.print("------------------------------------------------------------------\n");
        System.out.print("|     Bauru com Ovo     |       102        |       R$ 1,50       |\n");
        System.out.print("------------------------------------------------------------------\n");
        System.out.print("|     Hamburguer        |       103        |       R$ 1,20       |\n");
        System.out.print("------------------------------------------------------------------\n");
        System.out.print("|     Cheeseburguer     |       104        |       R$ 1,70       |\n");
        System.out.print("------------------------------------------------------------------\n");
        System.out.print("|     Suco              |       105        |       R$ 2,20       |\n");
        System.out.print("------------------------------------------------------------------\n");
        System.out.print("|     Refrigerante      |       106        |       R$ 1,00       |\n");
        System.out.print("------------------------------------------------------------------\n\n");
        System.out.print("\nDigite o código do lanche escolhido: ");    
            cod = entr.nextInt();
            switch(cod){
                case 100:
                    System.out.print("\nDigite a quatidade de lanches: ");
                    lanqt = entr.nextInt();
                    vlt = lanqt * 1.20f;
                    System.out.print("\nVocê pediu " + lanqt + " Cachorro Quente. Total a pagar R$ " + dc.format(vlt) + ".\n\n");
                    break;
                case 101:
                    System.out.print("\nDigite a quantidade de lanches: ");
                    lanqt = entr.nextInt();
                    vlt = lanqt * 1.30f;
                    System.out.print("\nVocê pediu " + lanqt + " Bauru Simples. Total a pagar R$ " + dc.format(vlt) + ".\n\n");
                    break;
                case 102:
                    System.out.print("\nDigite a quantidade de lanches: ");
                    lanqt = entr.nextInt();
                    vlt = lanqt * 1.50f;
                    System.out.print("\nVocê pediu " + lanqt + " Bauru com Ovo. Total a pagar R$ " + dc.format(vlt) + ".\n\n");
                    break;
                case 103:
                    System.out.print("\nDigite a quantidade de lanches: ");
                    lanqt = entr.nextInt();
                    vlt = lanqt * 1.20f;
                    System.out.print("\nVocê pediu " + lanqt + " Hamburguer(es). Total a pagar R$ " + dc.format(vlt) + ".\n\n");
                    break;
                case 104:
                    System.out.print("\nDigite a quantidade de lanches: ");
                    lanqt = entr.nextInt();
                    vlt = lanqt * 1.70f;
                    System.out.print("\nVocê pediu " + lanqt + " Cheeseburguer(es). Total a pagar R$ " + dc.format(vlt) + ".\n\n");
                    break;
                case 105:
                    System.out.print("\nDigite a quantidade de suco(s): ");
                    lanqt = entr.nextInt();
                    vlt = lanqt * 2.20f;
                    System.out.print("\nVocê pediu " + lanqt + " Suco. Total a pagar R$ " + dc.format(vlt) + ".\n\n");
                    break;
                case 106:
                    System.out.print("\nDigite a quantidade de refrigerante(s): ");
                    lanqt = entr.nextInt();
                    vlt = lanqt * 1.00f;
                    System.out.print("\nVocê pediu " + lanqt + " Refrigerante. Total a pagar R$ " + dc.format(vlt) + ".\n\n");
                    break;                
                default:
                    System.err.print("\nCódigo inexistente, reinicie o programa!!!!\n\n");
                    break;
            }
    }    
}