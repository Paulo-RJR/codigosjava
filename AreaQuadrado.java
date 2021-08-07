/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaquadrado;
    import java.util.Scanner;
    import java.text.DecimalFormat;
/**
 *
 * @author user1
 */
public class AreaQuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entr = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("0.00");
        double quad, lad;
        System.out.println("47 - Leia o tamanho do lado de um quadrado e escreva como resultado a sua área.");
        System.out.print("\nDigite um lado do quadrado: ");
            lad = entr.nextDouble();
        quad = Math.pow(lad, 2); // poderia ser: quad = lad * lad;
            System.out.print("\nA Área do seu Quadrado é: " + dc.format(quad) + ".\n");            
        System.out.println("\nObs.: O Exercício do 44 ao 46 já foram entregues no Blackboard com\n" + 
            "uma lista de 15 exercícios em 30/09/2019.\n\n");
    }    
}