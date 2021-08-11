/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liiinalunos;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author user1
 */
public class LiiiNAlunos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n_al;
        float media, n = 0, x, nota = 0;
        Scanner entr = new Scanner(System.in);
        Scanner entrf = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("0.00"); 
        System.out.println("11 - Ler o número de alunos existentes em uma turma e, após isto, ler as notas destes\n" +
            "alunos, calcular e escrever a média aritmética dessas notas lidas.");
        System.out.print("\nDigite o número de alunos: ");
        n_al = entr.nextInt();
        while(n < n_al){
            System.out.print("\nDigite a nota: ");
                x = entrf.nextFloat();
                nota = nota + x;
                n = n+1;                
        }
        media = nota / n_al;
        System.out.println("\nA média das notas dos alunos é: " + dc.format(media) + ".\n\n");
    }    
}