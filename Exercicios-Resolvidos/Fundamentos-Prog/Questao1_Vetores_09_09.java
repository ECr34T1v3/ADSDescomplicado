/**
 * Implemente um programa em Java que gere aleatoriamente valores para um vetor de
 * 100 posições de memória, Ao final, o seu programa deve imprimir a quantidade
 * de elementos pares que foram gerados para este vetor e imprima também os
 * valores gerados para o vetor.
 * @author ecr34t1v3
 */

import java.util.Random;

public class Questao1_Vetores_09_09 {

    public static void main(String[] args) {
        
        Random generator = new Random();
        
        int num[] = new int[100];
        int par[] = new int[100];
        
        for (int i = 0; i < num.length; i++) {
            
            num[i] = generator.nextInt(100);
            
            if (num[i] % 2 == 0) {
                par[i] = num[i];
                
            }
        }
        
        
        //Para apresentar os valores
        System.out.println("Quantidade de elementos pares: ");
        
        for (int i = 0; i < par.length; i++) {
            
            System.out.print(par[i] + ", ");
            
        }
        
        System.out.println("");
        System.out.println("Valores gerados: ");
        
        for (int i = 0; i < num.length; i++) {
            
            System.out.print(num[i] + ", ");
            
        }
        
        System.out.println("");
        
    }
    
}
