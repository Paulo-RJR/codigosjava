/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajudavender;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 *
 * @author user1
 */
public class AjudaVender {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float venda, vendaparc, vendavist, vendedorv, vendedorp;
        DecimalFormat dc = new DecimalFormat("0.00");
        Scanner entr = new Scanner(System.in);
        System.out.println("Programa para calcular porcentagem de desconto e");
        System.out.println("comissão em vendas à vista e a prazo, feitas por");
        System.out.println("um vendedor");
        System.out.print("\nDigite o valor da venda - R$ ");
        venda = entr.nextFloat();
            System.out.println("\nPagamento à vista o cliente ganha 10% de desconto em suas compras.");
            System.out.println("Parcelas de até 3 vezes sem juros.");
            vendavist = venda - (venda * 0.10f);
            System.out.println("\nPagamento à vista R$ " + dc.format(vendavist) + ".");
                vendaparc = venda / 3;
                System.out.println("Pagamento parcelado em três vezes de R$ " + dc.format(vendaparc) + ".\n");
                    System.out.println("O vendedor receberá 5% de comissão sobre o pagamento à vista com desconto.");
                    vendedorv = vendavist * 0.05f;
                    System.out.println("Comissão sobre o pagamento à vista R$" + dc.format(vendedorv) + ".");
                        System.out.println("\nO vendedor receberá 5% de comissão sobre o valor total nas vendas parceladas.");
                        vendedorp = venda * 0.05f;
                        System.out.println("Comissão sobre o pagamento parcelado R$" + dc.format(vendedorp) + ".\n");
    }    
}