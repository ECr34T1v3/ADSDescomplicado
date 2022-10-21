/**
 * Enunciado: https://pastebin.com/TT0jx2TC
 * @author ecr34t1v3
 */

import java.util.Scanner;

public class Avaliacao_Q2 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        float a, b, c, delta, raizqdDelta, raiz1, raiz2; // Inicializando variáveis do tipo float
        
        System.out.println("Equação de segundo grau");
        System.out.print("Informe o valor de A: ");
        a = input.nextFloat();
        
        if (a == 0) {
            System.out.println("A equação não é do segundo grau, pois A = 0");
            return; // Estabelecendo condição, caso o A seja igual a 0, return, pare a execução
        }
        
        System.out.print("Informe o valor de B: ");
        b = input.nextFloat();
        
        System.out.print("Informe o valor de C: ");
        c = input.nextFloat();
        
        delta = (b * b) - (4 * a * c); // Efetuando calculo de delta
        raizqdDelta = (float)Math.sqrt(delta);
        // Efetuando operação com Math.sqrt para raiz qd de delta como float
        if (delta < 0) {
            System.out.println("A equação não possui raízes reais, pois delta é negativo."); 
        }
        // Estabelecendo condicional caso o valor de delta seja igual a zero
        else if (delta == 0) {
            raiz1 = (-b + (float)Math.sqrt(raizqdDelta)) / (2 * a); // -b + raizQdDelta / 2.a
            System.out.println("Valor da Raíz: " + raiz1);
        // Estabelecendo condicional caso o delta seja igual a zero, só existe uma raiz    
        }
        
        else {
            raiz1 = (-b + (float)Math.sqrt(raizqdDelta)) / (2 * a); // -b + raizQdDelta / 2.a
            raiz2 = (-b - (float)Math.sqrt(raizqdDelta)) / (2 * a); // -b - raizQdDelta / 2.a
            System.out.println("Valor da Raiz 1: " + raiz1);
            System.out.println("Valor da Raiz 2: " + raiz2);
        }
        // Estabelecendo o então da questão, delta sendo maior que zero, duas raízes.
    }
    
}
