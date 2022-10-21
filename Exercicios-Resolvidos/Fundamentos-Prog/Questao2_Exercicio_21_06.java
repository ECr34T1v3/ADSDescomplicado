/**
 * Enunciado: Faça um programa em Java que peça o raio de um círculo
 * calcule e mostre sua área.
 * @author ecr34t1v3
 */

import java.util.Scanner;

public class Questao2_Exercicio_21_06 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double raio; // Inicializando var raio
        double area; // Inicializando var area
        
        System.out.print("Informe o valor do raio do círculo: ");
        raio = input.nextDouble(); // Recebendo o valor do raio na variável
        
        final double PI = 3.14; // Variável final
        area = PI * (raio * raio); // Efetuando o cálculo da área
        
        System.out.println("O valor da área do círculo é: " + area); // Informando ao usuário
        
    }
    
}
