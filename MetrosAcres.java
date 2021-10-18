/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metrosacres;
import java.util.Scanner;
/**
 *
 * @author user1
 */
public class MetrosAcres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double acr, mtrq;
        Scanner entr = new Scanner(System.in);        
        System.out.println("38 - Leia um valor área em metros quadrados m² e apresente-o convertido em acres.\n" +
            "A fórmula de conversão é: A = M * 0,000247, sendo M a área em metros quadrados e\n" + "A a área em acres.");
        System.out.print("\nDigite o comprimento em Metros Quadrados: ");
           mtrq = entr.nextDouble();
        acr = mtrq * 0.000247;
            System.out.print("\nO comprimento em Acres é: " + acr + ".\n\n");
    }    
}