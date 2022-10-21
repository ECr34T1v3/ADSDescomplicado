/**
 *
 * @author ecr34t1v3
 */

import java.util.Scanner;

public class ExercicioAula_Vetores05 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int vetor[];
        vetor = new int[10];
        
        /* vetor[0] = 10;
           vetor[1] = 30;
           vetor[8] = 45; */
        
        // Para armazenar valores
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Informe um valor para o vetor na posição " + i + ": ");
            vetor[i] = input.nextInt();
        }
        
        System.out.println("");
        
        // Para apresentar valores
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Valor na posição " + i + ": " + vetor[i]);
        }
        
    }
    
}
