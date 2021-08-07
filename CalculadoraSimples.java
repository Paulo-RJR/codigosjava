/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorasimples;
import java.util.*;
/**
 *
 * @author user1
 */
public class CalculadoraSimples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float num1, num2, resp;
        char sinal, igual;
        Scanner entrf = new Scanner(System.in);
        Scanner entrc = new Scanner(System.in);
        System.out.println("Segue abaixo um calculadora simples com\n" + 
            "dois números para as quatro operações matemáticas:\n" + 
            " Adição, Subtração, Multiplicação e Divisão: ");
        System.out.println("___________________________________________");
        System.out.print("                               ");
            num1 = entrf.nextFloat();
        System.out.print("                               ");
            sinal = entrc.next().charAt(0);
        System.out.print("                               ");
            num2 = entrf.nextFloat();            
        System.out.println("\n___________________________________________\n\n");
        //System.out.print(resp);
        switch(sinal){ //Para o menu de escolha das opções "Switch-Case". 
                case '+': 
                    resp = num1 + num2;
                    System.out.println("___________________________________________\n");
                    System.out.print("\t\t\t" + num1 + " + " + num2 + " = " + resp);
                    System.out.println("\n___________________________________________\n\n");
                    break;
                case'-': 
                    resp = num1 - num2;                
                    System.out.println("___________________________________________\n");
                    System.out.print("\t\t\t" + num1 + " - " + num2 + " = " + resp);
                    System.out.println("\n___________________________________________\n\n");
                    break;
                case '/': 
                    resp = num1 / num2;                    
                    System.out.println("___________________________________________\n");
                    System.out.print("\t\t\t" + num1 + " / " + num2 + " = " + resp);
                    System.out.println("\n___________________________________________\n\n");;
                    /*if(num2 == 0){
                        System.err.print("\nNão é possível dividir por zero.\n\n"); //Menssagem de erro caso o usuário tente efetuar uma divisão por zero.
                        System.exit(0); //Para sair antes de fazer algum cálculo. "Tradução: Sistema.Sair(0=deligado-binário)".
                    }*/
                    break;
                case '*': 
                    resp = num1 * num2;
                    System.out.println("___________________________________________\n");
                    System.out.print("\t\t\t" + num1 + " x " + num2 + " = " + resp);
                    System.out.println("\n___________________________________________\n\n");
                    break;
                default:
                    //System.err.println("\n!!! Programa finalizado !!!\n\n"); //Faz a frase digitada aparecer em vermelho, como se fosse um erro.                  
                    System.exit(0); //Para sair antes de fazer algum calculo. "Tradução: Sistema.Sair(0=deligado-binário)".
                    break;
            }
    }
    
}
