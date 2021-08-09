/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liiconta;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author user1
 */
public class LiiConta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float n_cont, vl_sald, vl_deb, vl_cred, at_sald;        
        Scanner entr = new Scanner(System.in);               
        DecimalFormat dc = new DecimalFormat("0.00");
        System.out.println("5 - Faça um algoritmo/programa para ler: número da conta do cliente, saldo, débito\n" +
            "e crédito. Após a leitura, calcular e escrever o saldo atual (saldo atual = saldo -\n" +
            "débito + crédito). Também testar se saldo atual for maior ou igual a zero escrever\n" +
            "a mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'.");
        System.out.print("\nDigite o número da sua Conta do Cliente: ");
            n_cont = entr.nextFloat();
        System.out.print("\nDigite o seu Saldo R$ ");
            vl_sald = entr.nextFloat();
        System.out.print("\nDigite o Débito R$ ");
            vl_deb = entr.nextFloat();
        System.out.print("\nDigite o seu Crédito R$  ");
            vl_cred = entr.nextFloat();
        at_sald = vl_sald - (vl_deb + vl_cred);
        if(at_sald >= 0){
            System.out.print("\nR$ " + dc.format(at_sald) + "\n");
            System.out.print("Saldo Positivo.\n\n");
        }else{
            System.out.print("\nR$ " + dc.format(at_sald) + "\n");
            System.err.print("Saldo Negativo.\n\n");
        }
    }    
}