/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liiestoque;
import java.util.Scanner;
/**
 *
 * @author user1
 */
public class LiiEstoque {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int at_estoq, mx_estoq, mn_estoq, md_estoq;        
        Scanner entr = new Scanner(System.in);          
        System.out.println("6 - Faça um algoritmo/programa para ler: quantidade atual em estoque, quantidade\n" +
            "máxima em estoque e quantidade mínima em estoque de um produto. Calcular e\n" +
            "escrever a quantidade média ((quantidade média = quantidade máxima +\n" +
            "quantidade mínima)/2). Se a quantidade em estoque for maior ou igual à\n" +
            "quantidade média, escrever a mensagem 'Não efetuar compra', senão escrever a\n" +
            "mensagem 'Efetuar compra’. ");
        System.out.print("\nDigite a quatidade atual de produtos em estoque: ");
            at_estoq = entr.nextInt();
        System.out.print("\nDigite a quantidade máxima em estoque: ");
            mx_estoq = entr.nextInt();
        System.out.print("\nDigite a quantidade mínima em estoque: ");
            mn_estoq = entr.nextInt();        
        md_estoq = (mx_estoq + mn_estoq) / 2;
        if(at_estoq >= md_estoq){            
            System.out.print("\nNão efetuar compra.\n\n");
        }else{            
            System.err.print("\nEfetuar compra.\n\n");
        }
    }    
}