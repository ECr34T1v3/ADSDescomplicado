/**
 * Enunciado: Escreva um programa que receba dois números e ao final mostre
 * a soma, subtração, multiplicação e a divisão dos números lidos.
 * @author ecr34t1v3
 */

import java.util.Scanner;

public class Questao6_Exercicio_22_06 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int numero1;
        int numero2;
        int soma;
        int subtracao;
        int multiplicacao;
        int divisao;
        
/** 
 * É possivel adicionar as variáveis do tipo inteiro utilizando:
 * int numero1, numero2, soma, subt..., divisao;
 * porém eu gosto de complicar as coisas :p
 */
        
        System.out.print("Informe o primeiro número: ");
        numero1 = input.nextInt();
        
        System.out.print("Informe o segundo número: ");
        numero2 = input.nextInt();
        
        soma = numero1 + numero2;
        subtracao = numero1 - numero2;
        multiplicacao = numero1 * numero2;
        divisao = numero1 / numero2;
        
        System.out.println("O valor da soma é: " + soma);
        System.out.println("O valor da subtração é: " + subtracao);
        System.out.println("O valor da multiplicação é: " + multiplicacao);
        System.out.println("O valor da divisão é: " + divisao);
        
    }
    
}
