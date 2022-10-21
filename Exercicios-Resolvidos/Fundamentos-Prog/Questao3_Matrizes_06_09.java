/**
 * Implemente um programa em Java que crie uma matriz de inteiros de dimensão
 * 5x5 e retorna a média de todos os elementos da matriz.
 * OBS: Você pode criar os elementos aleatoriamente com o Random.
 * @author ecr34t1v3
 */

import java.util.Random;

public class Questao3_Matrizes_06_09 {

    public static void main(String[] args) {
        
        Random generator = new Random();
        
        int linha;
        int coluna;
        double media = 0;
        int[][] matriz = new int[5][5];
        
        for (linha = 0; linha < 5; linha++) {
            for (coluna = 0; coluna < 5; coluna++) {
                matriz[linha][coluna] = generator.nextInt(10);
                
            }
            
        }
        
        for (linha = 0; linha < 5; linha++) {
            for (coluna = 0; coluna < 5; coluna++) {
                System.out.print("[" + matriz[linha][coluna] + "]");
                media = media + matriz[linha][coluna];
                
            }
            
            System.out.println("");
            System.out.print("Média dos elementos da matriz: " + media / 5);
            System.out.println("");
            
        }
    }
    
}
