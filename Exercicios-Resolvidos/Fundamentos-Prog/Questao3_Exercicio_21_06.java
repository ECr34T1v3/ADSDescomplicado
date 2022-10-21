/**
 * Enunciado: Faça um programa em Java que calcule a área de um quadrado,
 * em seguida mostre o dobro desta área para o usuário.
 * @author ecr34t1v3
 */

import java.util.Scanner;

public class Questao3_Exercicio_21_06 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double lado; // Inicializando var lado
        double area; // Inicializando var area
        
        System.out.print("Informe o lado do quadrado: ");
        lado = input.nextDouble(); // Recebendo o valor do lado na variável
        
        area = (lado * lado); // Efetuando o cálculo da área
        
        System.out.println("O valor do dobro da área é: " + (2 * area)); // Informando ao usuário
        
    }
    
}
