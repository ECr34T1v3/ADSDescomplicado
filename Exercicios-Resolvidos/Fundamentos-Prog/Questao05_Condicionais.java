/**
 * Enunciado: Determine qual é a idade que o usuário faz no ano atual,
 * para isso solicite o ano de nascimento do usuário e o ano atual.
 * @author ecr34t1v3
 */

import java.util.Scanner;

public class Questao05_Condicionais {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int anoNascimento;
        int anoAtual;
        int idade;
        
        System.out.print("Informe o ano do nascimento: ");
        anoNascimento = input.nextInt();
        
        System.out.print("Informe o ano atual: ");
        anoAtual = input.nextInt();
        
        idade = anoAtual - anoNascimento;
        
        System.out.println("Você fará " + idade + " anos em " + anoAtual);
        
    }
    
}
