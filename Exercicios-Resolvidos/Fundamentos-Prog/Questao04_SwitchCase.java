/**
 * Enunciado: Fazer um programa que obtenha o nome do tipo do funcionário e o
 * salário, em seguida efetue o aumento,caso seja técnico, aumente o salário
 * dele em 25%, caso seja analista aumente o salário em 20%, caso seja gerente,
 * aumente o salário em 15% e caso seja os demais cargos, aumente 10%.
 * @author ecr34t1v3
 */

import java.util.Scanner;

public class Questao04_SwitchCase {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String funcao; // Inicializando var do tipo string para armazenar texto
        double salario; // Inicializando var do salario
        double aumento; // Inicializando var do aumento
        
        System.out.print("Informe a função: ");
        funcao = input.nextLine(); // Recebendo o tipo do funcionario
        
        System.out.print("Informe o salário: ");
        salario = input.nextDouble(); // Recebendo o valor do salário atual
        
        switch (funcao.toUpperCase()) { // Efetuando uppercase para distinção de maiúsculas/minúsculas
            
            case "TECNICO":
                aumento = (salario * 0.25) + salario; break; // Aumento de 25% para técnico
            case "ANALISTA":
                aumento = (salario * 0.20) + salario; break; // Aumento de 20% para analista
            case "GERENTE":
                aumento = (salario * 0.15) + salario; break; // Aumento de 15% para gerente
            default:
                aumento = (salario * 0.10) + salario; // Aumento de 10% para qualquer outra função
                
        }
        
        System.out.println("Salário com aumento: " + aumento); // Informando ao usuário
        
    }
    
}
