/**
 * Enunciado: Escreva um programa que leia o nome de um aluno e as notas
 * das três provas que ele obteve no semestre e no final
 * informar o nome do aluno e a sua média (aritmética).   
 * @author ecr34t1v3
 */

import java.util.Scanner;

public class Questao7_Exercicio_22_06 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String nomeAluno;
        double nota1;
        double nota2;
        double nota3;
        double media;
        
        System.out.print("Informe o nome do aluno: ");
        nomeAluno = input.nextLine();
        
        System.out.print("Informe a primeira nota: ");
        nota1 = input.nextDouble();
        
        System.out.print("Informe a segunda nota: ");
        nota2 = input.nextDouble();
        
        System.out.print("Informe a terceira nota: ");
        nota3 = input.nextDouble();
        
        media = (nota1 + nota2 + nota3) / 3;
        
        System.out.println("Nome do aluno: " + nomeAluno);
        System.out.println("O valor da média aritmética é: " + media);
        
    }
    
}
