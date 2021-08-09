/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liicalendario;
import java.util.*;
/**
 *
 * @author user1
 */
public class LiiCalendario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dia, mes, ano, a, b, c, d, e, f, g, h, i, res; //as variáveis "a, b, c, d, e, f, g, h, i", são de atribuição, ou seja, receberam as fórmulas.
        Scanner entr = new Scanner(System.in);        
        System.out.println("13 - Fazer algoritmo/programa que, informada uma data (dia, mês e ano), mostre o\n" +
            "dia da semana correspondente. Para tanto, usar a seguinte regra:\n" +
            "Para mês >= 3, então mês = mês - 2 e x = 8; caso contrário, ano = ano – 1 e x = 13.\n" +
            "Cálculo do dia da semana:\n" +
            "res = Resto [(x + dia + (31 * mês/ 12) + ((5 * ano) / 4) – (3 * (1 + ano /100) / 4)),7]\n" +
            "Assim, se res = 1, o dia da semana será Domingo;\n" +
            "se res = 2: Segunda-feira;\n" +
            "se res = 3: Terça-feira;\n" +
            "se res = 4: Quarta-feira;\n" +
            "se res = 5: Quinta-feira;\n" +
            "se res = 6: Sexta-feira;\n" +
            "se res = 7: Sábado;");
        System.out.print("\nDigite o dia (dd): "); 
            dia = entr.nextInt();
        System.out.print("\nDigite o mês (mm): "); 
            mes = entr.nextInt();
        System.out.print("\nDigite o ano (aaaa): "); 
            ano = entr.nextInt();
            a = ((12 - mes ) /10);            
            b = ano - a;
            c = mes + (12 * a);
            d = b / 100;
            e = d / 4;
            f = 2 - d + e;
            g = 365 * b;
            h = (31 * (c + 1));
            i = ((f + g) + (h + dia) + 5);
            res = (i % 7) + 2; //Para que a conta funcionasse tive de acrescentar o "+2" e colocar os dia da semana de 0 a 6. 
            //res = (i % 7);
            //res = % ((dia + (31 * mes / 12) + ((5 * ano) / 4) - (3 * (1 + ano /100) / 4)) / 7);
            if(res == 1 || res >= 7){
               // System.out.print("\n" + res);
                System.out.print("\n" + dia + " \\ " + mes + " \\ " + ano + " : Domingo.\n\n");
            }else if(res == 2){
                //System.out.print("\n" + res);
                System.out.print("\n" + dia + " \\ " + mes + " \\ " + ano + " : Segunda-feira.\n\n");
            }else if(res == 3){
                //System.out.print("\n" + res);
                System.out.print("\n" + dia + " \\ " + mes + " \\ " + ano + " : Terça-feira.\n\n");
            }else if(res == 4){
                //System.out.print("\n" + res);
                System.out.print("\n" + dia + " \\ " + mes + " \\ " + ano + " : Quarta-feira.\n\n");
            }else if(res == 5){
                //System.out.print("\n" + res);
                System.out.print("\n" + dia + " \\ " + mes + " \\ " + ano + " : Quinta-feira.\n\n");
            }else if(res == 6){
                //System.out.print("\n" + res);
                System.out.print("\n" + dia + " \\ " + mes + " \\ " + ano + " : Sexta-feira.\n\n");
            }else if(res == 0){
                System.out.print("\n" + res);
                System.out.print("\n" + dia + " \\ " + mes + " \\ " + ano + " : Sábado.\n\n");
            }/*else{
                System.out.print("\n" + res);
                System.err.print("\n Dia inexistente!!!\n\n");
            }*/                    
    }   
}