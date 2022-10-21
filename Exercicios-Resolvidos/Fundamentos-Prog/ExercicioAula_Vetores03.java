/**
 * Calcular a média de idade de 1000 crianças.
 * @author ecr34t1v3
 */

import java.util.Random;

public class ExercicioAula_Vetores03 {

    public static void main(String[] args) {
        
        Random aleatory = new Random();
        int[] idades = new int[1000];
        int soma = 0;
        
        for (int i = 0; i < idades.length; i++) {
            
            idades[i] = aleatory.nextInt(13);
            soma = soma + idades[i];
            
            System.out.print(idades[i] + ", ");
            
        }
        
        double media = (double) soma / (double) idades.length;
        
        System.out.println();
        System.out.println("\nMédia de idade: " + media);
    }
    
}
