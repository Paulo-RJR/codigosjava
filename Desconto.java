/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desconto;
    import java.util.Scanner;
    import java.text.DecimalFormat;
/**
 *
 * @author paulo
 */
public class Desconto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float vlr, desc;
        Scanner entrf = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("0.00");
        System.out.println("51 - Faça um programa que leia o valor de um produto e mostre o valor com\n" +
            "desconto, tendo em vista que o desconto foi de 12%.");
        System.out.print("\nDigite o valor do produto: R$ ");
            vlr = entrf.nextFloat();
        desc = vlr - (vlr * 0.12f);
        System.out.print("\n O valor com desconto de 12% é: R$ " + dc.format(desc) + "\n\n");
    }    
}