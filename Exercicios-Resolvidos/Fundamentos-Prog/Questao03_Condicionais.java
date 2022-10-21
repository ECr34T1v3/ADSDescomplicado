/**
 * Enunciado: Obter nota e calcular a média, se a média for menor que 5, o aluno
 * será reprovado, caso contrário, se a nota for menor que 7, o aluno estará em
 * recuperação, caso contrário, ele será aprovado, e imprimir a média.
 * @author ecr34t1v3
 */

import java.util.Scanner;

public class Questao03_Condicionais {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double nota1, nota2, media;
        
        System.out.print("Informe a primeira nota: ");
        nota1 = input.nextDouble();
        
        System.out.print("Informe a segunda nota: ");
        nota2 = input.nextDouble();
        
        media = (nota1 + nota2) / 2;
        
        if (media < 5) {
            
            System.out.println("Reprovado");
            
        } else if (media < 7) {
            
            System.out.println("Recuperação");
            
        } else {
            
            System.out.println("Aprovado");
            
        }
        
        System.out.println("Média: " + media);
        
    }
    
}
