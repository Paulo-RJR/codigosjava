/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcaotresnumeros;
import java.util.Scanner;
/**
 *
 * @author paulo
 */
public class FuncaoTresNumeros {
    public static int funcaoTresNumeros(int x, int y, int z){ //Função com Retorno e com Parâmtros.
        int maior = 0;
        if(x > y && x > z){
            maior = x;
        }
        if(y > x && y > z){
            maior = y;
        }
        else if (z > x && z > y){
            maior = z;
        }
        return maior;        
    } 
    public static void funcaoTres(int maaior){ //Função sem Retorno e com  Parâmtros.
        System.out.println("O maior número é: " + maaior);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1, n2, n3;
        Scanner entr = new Scanner(System.in);
        System.out.print("Digite o prmeiro número: ");
            n1 = entr.nextInt();
        System.out.print("Digite o segundo número: ");
            n2 = entr.nextInt();
        System.out.print("Digite o terceiro número: ");
            n3 = entr.nextInt();
        int maiior = funcaoTresNumeros(n1, n2, n3); 
        funcaoTres(maiior);
        entr.close();
    }    
}
