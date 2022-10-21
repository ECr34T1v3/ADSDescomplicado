/**
 * Enunciado: Faça um programa que leia 20 números e informe a soma e a média dos números.
 * @author ecr34t1v3
 */

import java.util.Scanner;

public class Questao1_Exercicio_29_07 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int num;
        int soma = 0;
        double media;
        
        for (int i = 0; i < 20; i++) {
            
            System.out.print("Informe um número: ");
            num = input.nextInt();
            
            if (num >= 0) {
                soma += num; // soma = soma + num
            }
        }
        
        System.out.println("A soma é: " + soma);
        media = (double)soma / 20;
        System.out.println("A média é: " + media);
        
        }
    }
