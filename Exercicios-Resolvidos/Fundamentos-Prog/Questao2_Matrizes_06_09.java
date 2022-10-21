/**
 * Implemente um programa em Java que leia 10 números pelo teclado e armazene-os
 * em uma matriz de dimensão 2x5.
 * @author ecr34t1v3
 */

import java.util.Scanner;

public class Questao2_Matrizes_06_09 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int linha;
        int coluna;
        int[][] matriz = new int[2][5];
        
        for (linha = 0; linha < 2; linha++) {
            for(coluna = 0; coluna < 5; coluna++) {
                System.out.print("Insira um número: " );
                matriz[linha][coluna] = input.nextInt();
                
            }
        }
        System.out.println("");
        
        for (linha = 0; linha < 2; linha++) {
            for (coluna = 0; coluna < 5; coluna++) {
                System.out.print("[" + matriz[linha][coluna] + "]");
                
            }
            System.out.println("");
            
        }
    }
    
}
