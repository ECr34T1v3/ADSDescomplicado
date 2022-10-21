/**
 * Enunciado: Faça um programa que, dado um conjunto de N números,
 * determine o menor valor, o maior valor e a soma dos valores.
 * @author ecr34t1v3
 */

import java.util.Scanner;

public class Questao3_Exercicio_29_07 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String interacao = "";
        int num = 0;
        int soma = 0;
        int maiorNum = 0;
        int menorNum = 0;
        int cont = 0;
        
        System.out.println("*** Coleta de Dados Numéricos ***");
        System.out.print("Deseja iniciar a coleta? (S/N): ");
        interacao = input.next();
        
        while (interacao.equalsIgnoreCase("S")) {
            System.out.print("Informe um número: ");
            num = input.nextInt();
            soma = soma + num; // soma += num
            cont += 1;
            
            if (cont == 1) {
                maiorNum = menorNum = num;
                
            }
            else {
                if (num > maiorNum) {
                    maiorNum = num;
                }
                if (num < menorNum) {
                    menorNum = num;
                }
                
            }
            
            System.out.print("Deseja continuar? (S/N): ");
            interacao = input.next();
            
        }
        
        System.out.println("Menor valor: " + menorNum);
        System.out.println("Maior valor: " + maiorNum);
        System.out.println("Soma dos valores: " + soma);
    }
    
}
