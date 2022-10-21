/**
 * Enunciado: https://pastebin.com/qT7nSZDz
 * @author ecr34t1v3
 */

import java.util.Scanner;

public class Exercicio1_ListaResolvidosRpt {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        double totalCompras = 0, desconto = 0, valorCompra;
        
        for (int i = 0; i < 10; i++) {
            
            System.out.println("Valor da compra: ");
            valorCompra = input.nextDouble();
            
            if (valorCompra >= 250) {
                desconto = valorCompra * 0.2;
            }
            else {
                desconto = valorCompra * 0.15;
            }
            valorCompra -= desconto;
            totalCompras += valorCompra;
            
            System.out.println("Desconto: R$" + desconto);
            System.out.println("Valor da Compra: R$" + valorCompra);
           
        }
        
        System.out.println("Valor total das compras: R$" + totalCompras);
        
    }
    
}
