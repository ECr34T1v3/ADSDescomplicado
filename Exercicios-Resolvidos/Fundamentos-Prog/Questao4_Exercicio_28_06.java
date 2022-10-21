/**
 * Enunciado: Enorme, deixarei no pastebin :p
 * (https://pastebin.com/5Rk5hwkc)
 * @author ecr34t1v3
 */

import java.util.Scanner;

public class Questao4_Exercicio_28_06 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        String tipoTaxa;
        double taxaNatalidade;
        double taxaMortalidade;
        int criancasNascidas;
        int numeroHabitantes;
        int numeroObitos;
        
        System.out.println("Informe qual taxa deverá ser calculada");
        System.out.println("Taxa de natalidade = natalidade");
        System.out.print("Taxa de mortalidade = mortalidade: ");
        tipoTaxa = input.nextLine();
        
        switch (tipoTaxa.toUpperCase()) {
            
            case "NATALIDADE":
                System.out.print("Informe o número de crianças nascidas: ");
                criancasNascidas = input.nextInt();
                System.out.print("Informe o número de habitantes: ");
                numeroHabitantes = input.nextInt();
                taxaNatalidade = (criancasNascidas * 1000) / numeroHabitantes;
                
                System.out.println("Taxa de Natalidade: " + taxaNatalidade + "%"); break;
                
            case "MORTALIDADE":
                System.out.print("Informe o número de óbitos: ");
                numeroObitos = input.nextInt();
                System.out.print("Informe o número de habitantes: ");
                numeroHabitantes = input.nextInt();
                taxaMortalidade = (numeroObitos * 1000) / numeroHabitantes;
                
                System.out.println("Taxa de Mortalidade: " + taxaMortalidade + "%"); break;
                
            default:
                System.out.println("Tipo de taxa não reconhecido");
                
        }
        
        
    }
    
}
