/**
 * Enunciado: Obter nota e pesos e informar se o aluno estiver com média 
 * acima ou igual a 6, indique que ele está aprovado, caso contrário, mostrar
 * somente a média.
 * @author ecr34t1v3
 */

import java.util.Scanner;

public class Questao01_Condicionais {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double nota1, nota2, pesoNota1, pesoNota2, media;
        
        System.out.print("Informe a primeira nota: ");
        nota1 = input.nextDouble();
        
        System.out.print("Informe o peso da primeira nota: ");
        pesoNota1 = input.nextDouble();
        
        System.out.print("Informe a segunda nota: ");
        nota2 = input.nextDouble();
        
        System.out.print("Informe o peso da segunda nota: ");
        pesoNota2 = input.nextDouble();
        
        media = (nota1*pesoNota1 + nota2*pesoNota2) / (pesoNota1+pesoNota2);
        
        if (media >= 6) {
            
            System.out.println("Aprovado");
            
        }
        
        System.out.println("Média: " + media);
        
    }
    
}
