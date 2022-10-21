/**
 * Implemente um programa em Java que preencha uma matriz 10x10 com números
 * inteiros gerados aleatoriamente. OBS: Gere números menores que 50.
 * @author ecr34t1v3
 */

import java.util.Random;

public class Questao1_Matrizes_06_09 {

    public static void main(String[] args) {
        
        Random generator = new Random();
        
        int linha;
        int coluna;
        int[][] matriz = new int[10][10];
        
        for (linha = 0; linha < 10; linha++) {
            for (coluna = 0; coluna < 10; coluna++) {
                matriz[linha][coluna] = generator.nextInt(49);
                
            }
            
        }
        
        for (linha = 0; linha < 10; linha++) {
            for (coluna = 0; coluna < 10; coluna++) {
                System.out.print("[" + matriz[linha][coluna] + "]");
                
            }
            System.out.println("");   
            
        }
        
    }
    
}
