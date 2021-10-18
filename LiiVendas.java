/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liivendas;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author user1
 */
public class LiiVendas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float sal_fix, vl_vend, nov_sal, vend=1500;        
        Scanner entr = new Scanner(System.in);               
        DecimalFormat dc = new DecimalFormat("0.00");
        System.out.println("4 - Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa.\n" +
            "Sabendo-se que ele recebe uma comissão de 3% sobre o total das vendas até R$\n" +
            "1.500,00 mais 5% sobre o que ultrapassar este valor, calcular e escrever o seu\n" +
            "salário total.");
        System.out.print("\nDigite o salário fixo do vendedor R$: ");
            sal_fix = entr.nextFloat();       
        System.out.print("\nDigite o valor das vendas R$: ");
            vl_vend = entr.nextFloat();        
                if(vl_vend <= 1500){ 
                    nov_sal = (vl_vend *0.03f) + sal_fix;
                    System.out.print("\nAcrescimo de 3% sobre as vendas:\n");
                    System.out.print("\nVocê vendeu R$ " + dc.format(vl_vend) + " e o seu salário é: R$ " + dc.format(nov_sal) + ".\n");
                }else{ 
                    nov_sal = ((vend * 0.03f) + ((vl_vend - vend) * 0.05f)) + sal_fix;                    
                    System.out.print("\nAcrescimo de 3% e 5% sobre as vendas:\n");
                    System.out.print("\nVocê vendeu R$ " + dc.format(vl_vend) + " e o seu salário é: R$ " + dc.format(nov_sal) + ".\n");
                }
    }
    
}