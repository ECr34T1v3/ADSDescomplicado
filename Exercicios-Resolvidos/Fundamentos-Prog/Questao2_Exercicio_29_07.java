/**
 * Enunciado: Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50.
 * @author ecr34t1v3
 */

public class Questao2_Exercicio_29_07 {

    public static void main(String[] args) {
        
        for (int i = 1; i <= 50; i++) { //Iniciando laço de repetição com incremento até 50
            
            if (i % 2 == 1) { // Se a interação dividida por 2 for igual a um:
                
                System.out.println("Números ímpares de 1 até 50:");
                System.out.println(i); // Informe o número ímpar ao usuário.
                
            }
            
        }
       
    }
    
}
