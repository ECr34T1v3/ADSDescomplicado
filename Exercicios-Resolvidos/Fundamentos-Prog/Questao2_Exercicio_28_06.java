/**
 * Enunciado: Elabore um programa que obtenha como entrada o valor do produto e
 * a forma de pagamento (1= à vista ou 2= à prazo), Dessa forma, se o produto
 * for pago à vista aplique um desconto de 10% antes de mostrar o valor final,
 * senão informe o mesmo valor do produto.
 * @author ecr34t1v3
 */

import java.util.Scanner;

public class Questao2_Exercicio_28_06 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        double valorProduto;
        int formaPagamento;
        double valorDesconto;
        
        System.out.print("Digite o valor do produto: ");
        valorProduto = input.nextDouble();
        
        System.out.print("Digite a forma de pagamento (1 = à vista , 2 = à prazo): ");
        formaPagamento = input.nextInt();
        
        switch (formaPagamento) {
            
            case 1:
                valorDesconto = valorProduto - (valorProduto * 0.10);
                System.out.println("Valor do Produto com Desconto: " + "R$" + valorDesconto); break;
                
            case 2:
                System.out.println("Valor do Produto: " + "R$" + valorProduto); break;
                
            default:
                System.out.println("Forma de pagamento não reconhecida");
                
        }
        
    }
    
}
