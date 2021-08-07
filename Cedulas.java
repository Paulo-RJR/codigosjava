/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cedulas;
import java.util.Scanner;
/**
 *
 * @author paulo
 */
public class Cedulas {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int valor;
        int qtd_nota200;
        int qtd_nota100;
        int qtd_nota50;
        int qtd_nota20;
        int qtd_nota10;        
        int qtd_nota5;
        int qtd_nota2;
        int qtd_nota1;
        Scanner entr = new Scanner(System.in);
        System.out.print("Informe um valor: R$ ");        
        valor = entr.nextInt();
        
        qtd_nota200 = valor / 200;  
        valor = valor - (qtd_nota200 * 200);
        
        qtd_nota100 = valor / 100;  
        valor = valor - (qtd_nota100 * 100);
 
        qtd_nota50 = valor / 50;  
        valor = valor - (qtd_nota50 * 50);
        
        qtd_nota20 = valor / 20;  
        valor = valor - (qtd_nota20 * 20);
 
        qtd_nota10 = valor / 10;  
        valor = valor - (qtd_nota10 * 10);
 
        qtd_nota5 = valor / 5;  
        valor = valor - (qtd_nota5 * 5);
        
        qtd_nota2 = valor / 2;  
        valor = valor - (qtd_nota2 * 2);     
        
        qtd_nota1 = valor;
        
        System.out.println("\nNotas de R$ 200,00: " + qtd_nota200);
        System.out.println("Notas de R$ 100,00: " + qtd_nota100);
        System.out.println("Notas de R$ 50,00: " + qtd_nota50);
        System.out.println("Notas de R$ 20,00: " + qtd_nota20);
        System.out.println("Notas de R$ 10,00: " + qtd_nota10);
        System.out.println("Notas de R$ 5,00: " + qtd_nota5);
        System.out.println("Notas de R$ 2,00: " + qtd_nota2);
        //Trocado por moeda pois não existe mais notas de um real em circulação.
        System.out.println("Moedas de R$ 1,00: " + qtd_nota1 + "\n");
    }    
}