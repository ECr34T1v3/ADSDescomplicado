/**
 * Enunciado: https://pastebin.com/Lqd9prsb
 * @author ecr34t1v3
 */

import java.util.Scanner;

public class Questao2_Exercicio_23_07 {

    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);

    float i;
    float filhos;
    float totalFilhos = 0;
    float populacao;
    float mediaFilhos = 0;
    float varSalario = 1;
    float salario;
    float totalSalario = 0;
    float mediaSalario = 0;
    float maiorSalario = 0;
    float porcentagemSalario = 0;

    System.out.print("Informe a população: ");
    populacao = input.nextFloat();

    for (i = 1; i <= populacao; i++) {
        
        System.out.println("Informe o salario (em R$)");
        System.out.println("Para finalizar a leitura de dados, insira um valor negativo.");
        salario = input.nextFloat();
        
        if (salario < 0) {
            break;
        }

        System.out.print("Informe a quantidade de filhos: ");
        filhos = input.nextFloat();
        
        totalSalario = salario + totalSalario;
        totalFilhos = filhos + totalFilhos;

        if (maiorSalario < salario) {
            
            maiorSalario = salario;
        
        }
        
        if (salario <= 100) {
            
            porcentagemSalario = (varSalario * 100) / populacao;
            varSalario++;
            
        }
        
    }
    
    mediaFilhos = totalFilhos / populacao;
    mediaSalario = totalSalario / populacao;
    
    System.out.println("******** PESQUISA HABITACIONAL ********");
    System.out.println("Média do salário da população: " + "R$" + mediaSalario);
    System.out.println("Média do número de filhos: " + mediaFilhos);
    System.out.println("Maior salário: " + "R$ " + maiorSalario);
    System.out.println("Porcentagem das pessoas com salários até R$100,00: " + porcentagemSalario + "%");

    }    
    
}
