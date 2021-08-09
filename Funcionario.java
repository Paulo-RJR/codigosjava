/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcionario;
    import java.util.Scanner;
    import java.text.DecimalFormat;
/**
 *
 * @author paulo
 */
public class Funcionario {
    public static float funcionario(float desc, float vlr){
        
        desc = vlr - (vlr * 0.08f);
        return desc;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float vlr, desc;
        String nome;
        Scanner entrf = new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("0.00");
        System.out.println("FAÇA UM PROGRAMA EM JAVA QUE LEIA O NOME E O"
                + " SALÁRIO BRUTO DE UM \n" + "FUNCIONÁRIO. EM SEGUIDA "
                + "O PROGRAMA DEVERÁ CALCULAR O DESCONTO DO INSS\n" + 
                "(8%) E MOSTRAR OS RESULTADOS NA TELA.\n" + "MOSTRAR NA "
                + "TELA: NOME E SALÁRIO COM O DESCONTO.\n" + "UTILIZE "
                + "FUNÇÃO PARA O CÁLCULO DO SALÁRIO.\n");
        System.out.print("Digite o nome do funcionário: ");
            nome = entrf.next();
        System.out.print("Digite o valor do salário do funcionário: R$ ");
            vlr = entrf.nextFloat();
        desc = vlr - (vlr * 0.08f);
        System.out.print("\nO novo salário do fincionário " + nome + " ,com desconto de 8% é: R$ " + dc.format(desc) + "\n\n");
    }    
}