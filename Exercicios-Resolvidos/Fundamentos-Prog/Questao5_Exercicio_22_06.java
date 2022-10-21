/**
 * Enunciado: Escreva um programa que receba dois números e exiba
 * o resultado da sua soma.
 * @author ecr34t1v3
 */

import java.util.Scanner;

public class Questao5_Exercicio_22_06 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int numero1;
        int numero2;
        int soma;
        
        System.out.print("Informe o primeiro número: ");
        numero1 = input.nextInt();
        
        System.out.print("Informe o segundo número: ");
        numero2 = input.nextInt();
        
        soma = numero1 + numero2;
        
        System.out.println("O valor da soma é: " + soma);
        
    }
    
}
