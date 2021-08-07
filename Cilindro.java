/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cilindro;
    import java.util.Scanner;
    import java.text.DecimalFormat;
    import java.math.*; //Biblioteca para usar a fórmulas Matemáticas. 
/**
 *
 * @author paulo
 */
public class Cilindro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double vl, ro, alt;
        Scanner entrd = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("0.00");
        System.out.println("50 - Leia a altura e o raio de um cilindro circular e mostre o volume do cilindro. O\n" +
            "volume de um cilindro circular é calculado por meio da seguinte fórmula: V = Pi *\n" +
            "R² * H, onde Pi= 3,14, R = raio e H = altura.");
        System.out.print("\nDigite o raio do Cilindro: ");
            ro = entrd.nextDouble();
        System.out.print("Digite a altura do Cilindro: ");
            alt = entrd.nextDouble();        
        vl = Math.PI * Math.pow(ro, 2) * alt;
            System.out.print("\nO volume do Cilindro é: " + dc.format(vl) + "\n");             
        System.out.print("\nObs.: O valor final ee´diferente da formula normal pois o valor de 'PI' na \n" +
            "biblioteca 'Math.PI' do Java não é apenas 3.14 e sim 3.141414..., para resolver basta retirar\n" +
            "a biblioteca 'Math.PI' e colocar o valor fixo da questão '3.14', e foi usada d biblioteca \n" +
            "'DecimalFormat' para diminuir as casas decimais para melhor visualização do resultado.\n\n");
    }    
}