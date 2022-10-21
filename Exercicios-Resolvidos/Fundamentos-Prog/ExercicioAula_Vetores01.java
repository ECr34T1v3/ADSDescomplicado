/**
 *
 * @author ecr34t1v3
 */

import java.util.Random;

public class ExercicioAula_Vetores01 {

    public static void main(String[] args) {
        
        int[] vetor = new int [50];
        Random random = new Random();
        
        /* Apresentação de valores em posições no vetor
        * vetor[0] = 45;
        *¨vetor[1] = 67; 
        */
        
        for (int i = 0; i < 50; i++) {
            vetor[i] = random.nextInt(1000);
            System.out.println(vetor[i]);
        }
        
    }
    
}
