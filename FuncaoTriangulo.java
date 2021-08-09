/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcaotriangulo;
import java.util.*; //Para usar qualquer classe deste biblioteca.
/**
 *
 * @author paulo
 */
public class FuncaoTriangulo {
    public static double funcaoTriangulo(double b, double h){
        double area;
        area = b * h;
        return area;
    }
    public static void funcaoTri(double aarea){
        System.out.printf("\nA área do seu Retângulo é: %.2f\n", aarea);
    } 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entr = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        double base, altura, area; 
        System.out.println("ESCREVA UM PROGRAMA QUE CALCULE A ÁREA DE UM "
                + "RETÂNGULO. UTILIZE FUNÇÃO.\n" + "FÓRMULA DA ÁREA DO "
                + "RETÂNGULO:\n" + "\t" + "A = b * h\n");
        System.out.print("Informe a base do seu retângulo: ");
            base = entr.nextDouble();
        System.out.print("Informe a altura do seu retângulo: ");
            altura = entr.nextDouble();
        double are = funcaoTriangulo(base, altura);
        funcaoTri (are);
        entr.close();
    }    
}