/**
 * Enunciado: https://pastebin.com/wAvZmrPD
 * @author ecr34t1v3
 */

import java.util.Scanner;

public class Questao1_ListaExerciciosRpt {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        int opcao;
        double saldo = 0, saque = 0, deposito = 0;
        
        System.out.println("***** Banco Digital ******");
        System.out.println("1 - Consulta saldo");
        System.out.println("2 - Saque");
        System.out.println("3 - Depósito");
        System.out.println("4 - Sair");
        opcao = input.nextInt();
        
        while (opcao != 4) {
            
            if (opcao == 1) {
                System.out.println("Saldo: R$" + saldo);
                 
            }
            else if (opcao == 2) {
                System.out.println("Valor do Saque: R$" + saque);
                saque = input.nextDouble();
                if (saldo > saque) {
                    saldo = saldo - saque;
                }
                else {
                    System.out.println("Saque não pode ser realizado");
                    System.out.println("Seu saldo é R$" + saldo);
                }
            }
            else if (opcao == 3) {
                System.out.println("Valor do depósito: R$");
                deposito = input.nextDouble();
                saldo = saldo + deposito;
            }
            System.out.println("Deseja continuar? Veja as opções abaixo");
            System.out.println("***** Banco Digital ******");
            System.out.println("1 - Consulta saldo");
            System.out.println("2 - Saque");
            System.out.println("3 - Depósito");
            System.out.println("4 - Sair");
            opcao = input.nextInt();
            
        }
        
    }
    
}
