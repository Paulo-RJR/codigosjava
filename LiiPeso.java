/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liipeso;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author user1
 */
public class LiiPeso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float pesoid, altura;
        String nome;
        char sexo;
        Scanner entr = new Scanner(System.in);
        Scanner entrf = new Scanner(System.in);
        Scanner entrc = new Scanner(System.in);        
        DecimalFormat dc = new DecimalFormat("0.00");
        System.out.println("3 - Tendo como dados de entrada o nome, a altura e o sexo (M ou F) de uma pessoa,\n" +
        "fazer um algoritmo/programa que calcule e mostre seu peso ideal, utilizando as\n" +
        "seguintes fórmulas:\n" +
        "- Para sexo masculino: peso ideal = (72.7 * altura) - 58\n" +
        "- Para sexo feminino: peso ideal = (62.1 * altura) - 44.7");
        System.out.print("\nDigite o seu nome: ");
            nome = entr.next();       
        System.out.print("\nDigite sua altura em metros(m): ");
            altura = entrf.nextFloat();
        System.out.print("\nDigite o seu sexo masculino(M) ou feminino(F): ");
            sexo = entrc.nextLine().charAt(0);
                if(sexo == 'M' || sexo == 'm'){ //Oorerador Lógico ||(ou), para usar a letra maiúscula ou minúscula.
                    pesoid = (72.7f *altura) - 58;
                    //pesoid = (72.7f *(altura / 100)) - 58;
                    System.out.print("\n"+ nome + ", o seu peso ideal é: " + dc.format(pesoid) + " Kg.\n");
                }                            
                if(sexo == 'F' || sexo == 'f'){ //Oorerador Lógico ||(ou), para usar a letra maiúscula ou minúscula.
                    pesoid = (62.1f * altura) - 44.7f;
                    //pesoid = (62.1f * (altura / 100)) - 44.7f;
                    System.out.print("\n"+ nome + ", o seu peso ideal é: " + dc.format(pesoid) + " Kg.\n");
                } /*else {
                    System.err.println("\nSexo incorreto!!! - Favor iniciar o programa novamente!!!\n\n");//O comando ".err.", para o texto aparecer em vermalho.
                    System.exit(0);//Para sair do programa.
                } */    
     }    
}