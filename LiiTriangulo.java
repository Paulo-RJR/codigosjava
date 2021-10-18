/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liitriangulo;
import java.util.Scanner;
/**
 *
 * @author user1
 */
public class LiiTriangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float la, lb, lc;        
        Scanner entr = new Scanner(System.in);          
        System.out.println("9 - Desenvolver algoritmo/programa que leia 3 valores reais(A, B e C) representando\n" +
            "as medidas dos lados de um triângulo e escrever se formam ou não um triângulo.\n" +
            "OBS: para formar um triângulo, o valor de cada lado deve ser menor que a soma\n" +
            "dos outros 2 lados. ");
        System.out.print("\nDigite o primeiro lado: ");
            la = entr.nextFloat();
        System.out.print("\nDigite o segundo lado: ");
            lb = entr.nextFloat();
        System.out.print("\nDigite o terceiro lado: ");
            lc = entr.nextFloat();        
        if(la < (lb + lc) && lb < (la + lc) && lc < (la + lb)){             
            System.out.print("\nForma um Triângulo.\n\n");                
        }else{
            System.err.print("\nNão Forma um Triângulo.\n\n");
        }                 
    }   
}