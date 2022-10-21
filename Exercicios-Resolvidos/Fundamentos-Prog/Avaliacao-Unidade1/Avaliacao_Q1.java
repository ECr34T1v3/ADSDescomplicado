/**
 * Enunciado: https://pastebin.com/Kp59vBhK
 * @author ecr34t1v3
 */

import java.util.Scanner;

public class Avaliacao_Q1 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        int tipoCarne;
        int tipoPagamento;
        double valorCompra = 0;
        double valorFinal;
        double qtdCarne = 0;
        double desconto = 0;
        
        System.out.println("Açougue Sergipe");
        System.out.println("Informe o tipo de carne desejada");
        System.out.print("1 - Filé Mignon, 2 - Alcatra, 3 - Picanha: ");
        
        tipoCarne = input.nextInt();
        
        switch (tipoCarne) {
            
            case 1:
                
                System.out.println("Informe a quantidade de carne desejada (em KG): ");
                qtdCarne = input.nextDouble();
                if (qtdCarne > 5) {
                    valorCompra = (qtdCarne * 30.80);
                }
                else {
                    valorCompra = (qtdCarne * 34.90);
                } break;
                
            case 2:
                
                System.out.println("Informe a quantidade de carne desejada (em KG): ");
                qtdCarne = input.nextDouble();
                if (qtdCarne > 5) {
                    valorCompra = (qtdCarne * 32.80);
                }
                else {
                    valorCompra = (qtdCarne * 35.90);
                } break;
                
            case 3:
                
                System.out.println("Informe a quantidade de carne desejada (em KG): ");
                qtdCarne = input.nextDouble();
                if (qtdCarne > 5) {
                    valorCompra = (qtdCarne * 42.80);
                }
                else {
                    valorCompra = (qtdCarne * 45.90);
                } break;
                
            default:
                System.out.println("Opção Inválida.");
                return;
                
        }
        
                System.out.println("Informe o meio de pagamento");
                System.out.print("1 - A vista, 2 - A prazo: ");
                tipoPagamento = input.nextInt();
                
                if (tipoPagamento == 1) {
                    desconto = (valorCompra * 0.05);
                    valorFinal = (valorCompra - desconto);
                }
                else {
                    valorFinal = valorCompra;
                }
                
                System.out.println("CUPOM FISCAL - Açougue Sergipe");
                System.out.println("Tipo de Carne: " + tipoCarne);
                System.out.println("Quantidade de Carne: " + qtdCarne + "KG");
                System.out.println("Preço Total: " + "R$" + valorCompra);
                System.out.println("Forma de pagamento: " + tipoPagamento);
                System.out.println("Valor do desconto: " + "R$" + desconto);
                System.out.println("Valor Total: " + "R$" + valorFinal);
                  
    }
    
}
