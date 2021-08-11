/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liifuncionario;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author user1
 */
public class LiiFuncionario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float hora;
        Scanner entr = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("0.00");
        System.out.println("2 - A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário\n" +
        "que trabalhar mais de 40 horas receberá hora extra, cujo cálculo é o valor da hora\n" +
        "regular com um acréscimo de 50%.");
        System.out.print("\nInforme as horas trabalhadas da semana: ");
            hora = entr.nextInt();
                if(hora <= 40){
                    System.out.print("\nVocê trabalhou " + dc.format(hora) + " esta semana.\n");
                }
                if(hora > 40){
                    System.out.print("\nVocê comprou " + dc.format(hora) + " esta semana e receberá 50% de acréscimo.\n");
                }    
    }    
}