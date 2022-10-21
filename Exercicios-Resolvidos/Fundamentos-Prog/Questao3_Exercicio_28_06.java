/**
 * Enunciado: Uma loja oferece 15% de desconto para funcionários e 10% de
 * desconto para clientes premium, implemente um programa em Java que
 * calcule o valor total a ser pago por uma pessoa, o programa deverá ler o
 * valor total da compra efetuada e um código que identifique se o comprador
 * é um cliente comum (1), funcionário (2) ou premium(3).
 * @author ecr34t1v3
 */

import java.util.Scanner;

public class Questao3_Exercicio_28_06 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        double valorTotal;
        double desconto;
        int tipoCliente;
        
        System.out.print("Informe o valor total da compra: ");
        valorTotal = input.nextDouble();
        
        System.out.println("Informe o tipo de cliente");
        System.out.print("(1 = Comum, 2 = Funcionário, 3 = Premium): ");
        tipoCliente = input.nextInt();
        
        switch (tipoCliente) {
            
            case 1:
                System.out.println("O valor total é: " + "R$" + valorTotal); break;
            
            case 2:
                desconto = valorTotal - (valorTotal * 0.15);
                System.out.println("O valor total é: " + "R$" + desconto); break;
            
            case 3:
                desconto = valorTotal - (valorTotal * 0.10);
                System.out.println("O valor total é: " + "R$" + desconto); break;
                
            default:
                System.out.println("Tipo de cliente não reconhecido");
                
        }
        
    }
    
}
