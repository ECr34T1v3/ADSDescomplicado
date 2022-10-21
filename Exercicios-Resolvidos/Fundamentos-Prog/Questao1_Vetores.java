/**
 * Faça um Programa que leia 50 números inteiros e armazene-os num vetor,
 * Armazene os números pares no vetor PAR e os números IMPARES no vetor impar,
 * Imprima os três vetores.
 * @author ecr34t1v3
 */

import java.util.Random;

public class Questao1_Vetores {

    public static void main(String[] args) {
        
        Random aleatory = new Random();
        
        
        int[] num = new int[50];
        int[] par = new int[50];
        int[] impar = new int[50];
        
        for (int i = 0; i < num.length; i++) {
            
            num[i] = aleatory.nextInt(100);
            
            if (num[i] % 2 == 0) {
                par[i] =  num[i];
                
            } else {
                impar[i] = num[i];
            }
            
            
        }
        
        System.out.println("");
        System.out.println("Vetor dos números inteiros: ");
        
        for (int i = 0; i < num.length; i++) {
            
            System.out.print(num[i] + ", ");
            
        }
        
        System.out.println("");
        System.out.println("Vetor dos números pares: ");
        
        for (int i = 0; i < par.length; i++) {
            
            System.out.print(par[i] + ", ");
            
        }
        
        System.out.println("");
        System.out.println("Vetor dos números ímpares: ");
        
        for (int i = 0; i < impar.length; i++) {
            
            System.out.print(impar[i] + ", ");
            
        }
        
        System.out.println("");
        
    }
    
}
