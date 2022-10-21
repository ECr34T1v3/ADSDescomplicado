/**
 * Enunciado: Faça um programa que peça para N pessoas a sua idade,
 * ao final o programa deverá verificar se a média de idade da turma
 * varia entre 0 e 25, 26 e 60 e maior que 60; e então, dizer se a turma
 * é jovem, adulta ou idosa, conforme a média calculada.
 * @author ecr34t1v3
 */

import java.util.Scanner;

public class Questao4_Exercicio_29_07 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String interacao = "";
        int idade;
        int quantidade = 0;
        int somaIdade = 0;
        double media = 0;
        
        System.out.println("*** Idade da turma ***");
        System.out.print("Deseja iniciar a coleta de dados? (S/N): ");
        interacao = input.next();
        
        while (interacao.equalsIgnoreCase("S")) {
            System.out.println("Informe sua idade: ");
            idade = input.nextInt();
            somaIdade += idade; //somaIdade = somaIdade + idade
            quantidade++;
            
            System.out.print("Deseja continuar? (S/N): ");
            interacao = input.next();
            
        }
        
        media = (double)somaIdade / (double)quantidade;
        
        if (media < 25) {
            System.out.println("A turma é jovem");
            System.out.println("A média da idade da turma é de " + media + " anos.");
            
        }
        if (media >=25 && media < 60) {
            System.out.println("A turma é adulta");
            System.out.println("A média da idade da turma é de " + media + " anos.");
            
        }
        if (media > 60) {
            System.out.println("A turma é idosa");
            System.out.println("A média da idade da turma é de " + media + " anos.");
        }
        
    }
    
}
