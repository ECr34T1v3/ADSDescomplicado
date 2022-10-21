/**
 * Enunciado: Faça um Programa que pergunte em que turno você estuda,
 * Peça para digitar: M-matutino ou V-Vespertino ou N- Noturno,
 * Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou
 * "Valor Inválido!", conforme o caso.
 * @author ecr34t1v3
 */

import java.util.Scanner;

public class Avaliacao_Q3 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        String turno;
        
        System.out.println("Informe o seu turno");
        System.out.print("M - Matutino, V - Vespertino, N - Noturno: ");
        turno = input.nextLine();
        
        switch (turno.toUpperCase()) {
            
                case "M":
                    System.out.println("Bom dia!"); break;
                    
                case "V":
                    System.out.println("Boa tarde!"); break;
                    
                case "N":
                    System.out.println("Boa noite!"); break;
                    
                default:
                    System.out.println("Valor inválido."); 
            
        }
        
    }
    
}
