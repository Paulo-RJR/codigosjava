/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediaidades;
import java.util.*;
import java.text.*;
//import java.lang.*;
/**
 *
 * @author user1
 */
public class MediaIdades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int idade, cont, cont_fem, soma;
       float media;
       char sexo;
       cont = 0;
       cont_fem = 0;
       soma = 0;
       Scanner entr = new Scanner(System.in);
       Scanner entrf = new Scanner(System.in);
       Scanner entrc = new Scanner(System.in);
       DecimalFormat dc = new DecimalFormat("0.00");       
       do{
        System.out.print("Digite sua idade: ");
            idade = entr.nextInt();
        System.out.print("\nDigite seu sexo: ");
            sexo = entrc.next().charAt(0);
            cont = cont + 1;
            if(sexo == 'F' || sexo == 'f'){
                //cont = cont + 1;
                cont_fem = cont_fem + 1;                     
                soma = soma + idade;
            }
       }while(cont == 60);{
            media = soma / cont_fem;
            System.out.print("\nA média das idades das mulheres é: " + media + ".\n\n");
    }     
    }    
}
