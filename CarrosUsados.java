/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carrosusados;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author user1
 */
public class CarrosUsados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrf = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("0.00");  
        float sal_fin, func, sal_fix, c_venda, qtd_car, t_venda;       
        System.out.println("12 - Uma revendedora de carros usados paga a seus funcionários vendedores um\n" +
            "salário fixo por mês, mais uma comissão também fixa para cada carro vendido e\n" +
            "mais 5% do valor das vendas por ele efetuadas. Escrever um algoritmo/programa\n" +
            "que leia o número de carros por ele vendidos, o valor total de suas vendas, o\n" +
            "salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o \n" +
            " salário final do vendedor.");
        System.out.print("\nDigite a quantidade de carros vendidos: ");
        qtd_car = entrf.nextFloat();
            System.out.print("Digite o valor total das vendas - R$ ");
            t_venda = entrf.nextFloat();
                System.out.print("Digite o salário fixo do funcionário vendedor - R$ ");
                sal_fix = entrf.nextFloat();
                    System.out.print("Digite o valor da comissão fixa por carro vendido - R$ ");
                    c_venda = entrf.nextFloat();
                    /*c_usado = (t_venda / qtd_car) * 0.05f;
                    System.out.println("Por carro vendido o vendedor recebe - RS " + dc.format(c_usado));*/            
                        sal_fin = ((t_venda * 0.05f) + (qtd_car * c_venda)) + sal_fix;
                        System.out.println("\nO salário final do vendedor é - R$" + dc.format(sal_fin) + ".\n\n");
    }   
}