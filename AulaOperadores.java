/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulaoperadores;
import java.util.Scanner;
/**
 *
 * @author paulo
 */
public class AulaOperadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
        System.out.println("ESCREVA UM PROGRAMA EM JAVA QUE CARREGUE UM VETOR\n"
                + "INTEIRO DE 5 POSIÇÕES E EM SEGUIDA IMPRIMA OS VALORES NA "
                + "TELA.");        
        int[] vetor = new int[5];
        System.out.print("\nDigite os números do vetor: \n");
        for (int i = 0; i < 5; i++) {
            vetor[i] = teclado.nextInt();
        }
        System.out.print("\nO conteúdo do vetor é: \n");
        for (int i = 0; i < 5; i++) {
            System.out.println(vetor[i]);        
        }
    }    
}