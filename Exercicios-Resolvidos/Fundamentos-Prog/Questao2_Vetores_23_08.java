/**
 * Faça um Programa que leia um vetor de 40 números inteiros,
 * mostre a soma, a multiplicação e os números.
 * @author ecr34t1v3
 */

import java.util.Random;

public class Questao2_Vetores_23_08 {

    public static void main(String[] args) {
        
        Random aleatory = new Random();
        
        int[] vetorNum;
        vetorNum = new int[40];
        
        int soma = 0;
        long multiplicacao = 1;
        
        for (int i = 0; i < vetorNum.length; i++) {
            
            vetorNum[i] = aleatory.nextInt(20) + 1;
            
            System.out.print(vetorNum[i] + ", ");
            
            soma = soma + vetorNum[i];
            multiplicacao = multiplicacao * vetorNum[i];
            
        }
        
        System.out.println("");
        System.out.println("Somatório dos números: " + soma);
        System.out.println("Multiplicação dos números: " + multiplicacao);
        
    }
    
}
