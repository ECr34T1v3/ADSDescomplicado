/**
 * Implemente um programa em Java que leia dois vetores de 10 posições de memória,
 * um vetor deve armazenar os nomes dos alunos e outro vetor deve armazenar
 * a média final destes alunos e Mostre, ao final:
 * O nome do aluno com maior média (e sua média);
 * A situação final de cada aluno (APROVADO ou REPROVADO) considerando que
 * a nota a ser alcançada é 6 (seis).
 * @author ecr34t1v3
 */

import java.util.Scanner;

public class Questao2_Vetores_09_09 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int i = 0;
        String nomeAluno[] = new String[9];
        double mediaFinal[] = new double[9];
        
        for (i = 1; i < 10; i++) {
            
            System.out.print("Informe o nome do " + nomeAluno[i] + "º" + " aluno: ");
            nomeAluno[i] = input.nextLine();
            
            System.out.print("Informe a " + mediaFinal[i] + "º" + " média final do aluno");
            mediaFinal[i] = input.nextDouble();
        }
        
        for (i = 1; i < 10; i++) {
            
            if (mediaFinal[i] > 6) {
                
                System.out.println("Aluno " + nomeAluno[i] + " possui média " + mediaFinal[i]);
                
            } else {
                
                System.out.println("Não existe");
                
            }
        }
        if (mediaFinal[i] > 6) {
            System.out.println("Aluno: " + nomeAluno[i]);
        }
    }
    
}
