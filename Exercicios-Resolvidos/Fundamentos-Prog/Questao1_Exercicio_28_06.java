/**
 * Enunciado: Tendo como dado de entrada a altura (h) e o sexo de uma pessoa,
 * construa um programa em Java que calcule seu peso ideal, utilizando as
 * seguintes fórmulas:
 * Para homens: (72.7*h) - 58
 * Para mulheres: (62.1*h) - 44.7
 * @author ecr34t1v3
 */

import java.util.Scanner;

public class Questao1_Exercicio_28_06 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String sexo; // Inicializando var do tipo string para armazenar texto
        double h; // Inicializando var da altura
        double pesoIdeal = 0; // Inicializando var do peso ideal, adicionando um valor 0 para debugar
        
        System.out.print("Informe o seu sexo (OBS: Masculino ou Feminino): ");
        sexo = input.nextLine(); // Recebendo o sexo de uma pessoa
        
        System.out.print("Informe a sua altura (OBS: Em metros. Exemplo: 1,74): ");
        h = input.nextDouble(); // Recebendo a altura de uma pessoa, em vírgula (ponto estava dando erro)
        
        switch (sexo.toUpperCase()) {
            // Executando condições caso seja masculino ou feminino, em uppercase
            case "MASCULINO":
                pesoIdeal = (72.7 * h) - 58;
                System.out.println("O seu peso ideal é de: " + pesoIdeal + "Kg"); break;
            // Caso seja masculino, efetuar o cálculo do peso ideal e informe ao usuário
            case "FEMININO":
                pesoIdeal = (62.1 * h) - 44.7;
                System.out.println("O seu peso ideal é de: " + pesoIdeal + "Kg"); break;
            // Caso seja feminino, efetuar o cálculo do peso ideal e informe ao usuário  
            default:
                System.out.println("Tipo de sexo não reconhecido");
            // Caso o sexo não seja nem masculino nem feminino, exiba a mensagem de erro    
        }
        
      }
        
    }
