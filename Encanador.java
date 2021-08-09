/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encanador;
    import java.util.Scanner;
    import java.text.DecimalFormat;
/**
 *
 * @author paulo
 */
public class Encanador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float vlr, ql;
        int dia;
        vlr = 30;
        Scanner entr = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("0.00");
        System.out.println("54. Uma empresa contrata um encanador a R$ 30,00 por dia. Faça um programa que\n" +
            "solicite o número de dias trabalhados pelo encanador e mostre a quantia líquida\n" +
            "que deverá ser paga, sabendo-se que são descontados 8% para imposto de renda: \n");
        System.out.print("Digite a quantidade de dias trabalhados: ");
            dia = entr.nextInt();
        ql = (vlr * dia) - ((vlr * dia) * 0.08f);
            System.out.println("\nA quantia líquida é: R$ " + dc.format(ql) + "\n\n");
            //entr.close();
    }    
}