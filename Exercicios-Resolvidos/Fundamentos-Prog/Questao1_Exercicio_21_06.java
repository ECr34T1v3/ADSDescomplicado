/**
 * Enunciado: Faça um programa em Java que receba uma medida
 * em metros e converta para centímetros.
 * @author ecr34t1v3
 */

import java.util.Scanner;

public class Questao1_Exercicio_21_06 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double metros; // Inicializando var metros
        double soma; // Inicializando var soma
       
        System.out.print("Informe a medida em metros: ");     
        metros = input.nextDouble(); // Recebendo valor em metros na variável
        
        soma = (metros * 100); // Efetuando o cálculo da soma
        
        System.out.println("A medida em centímetros é: " + soma); // Informando ao usuário
        
    }
    
}
