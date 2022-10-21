/**
 * Enunciado: Elabore um programa que efetue a apresentação do valor
 * da conversão em real (R$) de um valor lido em dólar (US$),
 * o algoritmo deverá solicitar o valor da cotação do dólar
 * e também a quantidade de dólares disponíveis com o usuário. 
 * @author ecr34t1v3
 */

import java.util.Scanner;

public class Questao8_Exercicio_22_06 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double real;
        double dolar;
        double cotacao;
        
        System.out.print("Informe o quantitativo em dólar: ");
        dolar = input.nextDouble();
        
        System.out.print("Informe a cotação do dólar: ");
        cotacao = input.nextDouble();
        
        real = dolar * cotacao;
        
        System.out.println("Quantia em reais: " + real + "R$");
        
    }
    
}
