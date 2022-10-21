/**
 *
 * @author ecr34t1v3
 */

import java.util.Scanner;

public class Questao2_ListaExerciciosRpt {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        int num;
        int cont = 3;
        
        System.out.println("Informe um número positivo: ");
        num = input.nextInt();
        
        while (num < 0) {
            System.out.println("Número incorreto");
            num = input.nextInt();
        }
        
        System.out.println("Números ímpares entre 1 e " + num + ":");
        while (cont < num) {
            System.out.println(cont + "");
            cont += 2; // cont = cont + 2
        }
        
    }
    
}
