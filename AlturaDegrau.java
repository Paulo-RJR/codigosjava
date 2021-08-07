/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alturadegrau;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 *
 * @author user1
 */
public class AlturaDegrau {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float altdegrau, altura, totdegrau;
        DecimalFormat dc = new DecimalFormat("0.00");
        Scanner entr = new Scanner(System.in);
        System.out.println("Programa para calcular a quantidade de degraus para");
        System.out.println("uma escada alcançar determinada altura.");
        System.out.print("\nDigite a altura do degrau em centímetros(cm): ");
        altdegrau = entr.nextFloat();
            System.out.print("\nDigite a altura que deseja alcançar em metros(m): ");
            altura = entr.nextFloat();
                totdegrau = (altura * 100) / altdegrau;
                System.out.println("\nPara alcançar os " + altura + " metro(s) você precisará de uma escada com " + dc.format(totdegrau) + " degrau(s).\n");
    }    
}