/**
 * Gerar um array com tamanho 10, com dados aleatórios e multiplicar cada valor por 2.
 * @author ecr34t1v3
 */

import java.util.Random;

public class ExercicioAula_Vetores04 {

    public static void main(String[] args) {
        
        Random aleatory = new Random();
        
        int[] vetor = new int[10];
        
        for (int i = 0; i < vetor.length; i++) {
            
            vetor[i] = aleatory.nextInt(100) * 2;
            
            System.out.println(vetor[i]);
        }
    }
    
}
