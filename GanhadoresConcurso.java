/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ganhadoresconcurso;    
    import java.text.DecimalFormat;
/**
 *
 * @author user1
 */
public class GanhadoresConcurso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float  vl, gan1, gan2, gan3;        
        DecimalFormat dc = new DecimalFormat("0.00");
        System.out.println("53 - A importância de R$ 780.000,00 será dividida entre três ganhadores de um\n" +
            "concurso. Sendo que, da quantia total:\n" + " O primeiro ganhador receberá 46%;\n" +
            " O segundo receberá 32%;\n" + " O terceiro receberá o restante;\n" +
            "Calcule e mostre a quantia ganha por cada um dos ganhadores.");        
        vl = 780000;
        System.out.println("\nO prêmio deste concurso é de R$ 780.000,00.");
            gan1 = vl * 0.46f;
        System.out.println("\nO primeiro ganhador recebeu - R$ " + dc.format(gan1) + " (46%).");
            gan2 = vl * 0.32f;
        System.out.println("O segundo ganhador recebeu - R$ " + dc.format(gan2) + " (32%).");
            gan3 = vl - (gan1 + gan2);
        System.out.println("O terceiro ganhador recebeu - R$ " + dc.format(gan3) + " (22% - o restante).\n\n");
    }    
}