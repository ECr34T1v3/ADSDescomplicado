/**
 * Enunciado: Faça um programa em Java que pergunte quanto você ganha por hora
 * e o número de horas trabalhadas no mês, calcule e mostre o
 * total do seu salário no referido mês.
 * @author ecr34t1v3
 */

import java.util.Scanner;

public class Questao4_Exercicio_21_06 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double valorHora; // Inicializando var valor da hora
        double totalHoras; // Inicializando var total de horas
        double salario; // Inicializando var salario
        
        System.out.print("Informe o valor recebido por hora trabalhada: ");
        valorHora = input.nextDouble(); // Recebendo o valor da hora na variável
        
        System.out.print("Informe o número de horas trabalhadas no mês: ");
        totalHoras = input.nextDouble(); // Recebendo o total de horas na variável
        
        salario = (valorHora * totalHoras); // Efetuando o cálculo do salário
        
        System.out.println("O valor total do salário no mês é: " + salario); // Informando ao usuário
        
    }
    
}