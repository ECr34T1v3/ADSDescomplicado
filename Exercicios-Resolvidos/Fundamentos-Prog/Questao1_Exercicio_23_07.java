/**
 * Enunciado: Construa um programa em JAVA que imprima todos os números ímpares
 * compreendidos entre 81 e 953.O programa também deve mostrar a soma de todos
 * os valores.
 * @author ecr34t1v3
 */
public class Questao1_Exercicio_23_07 {

    public static void main(String[] args) {
        
        
        int i;
        int soma = 0;
        
        for (i = 81; i <= 953; i++) {
            if (i % 2 == 1) {
                soma += i;
                System.out.println("Números ímpares (entre 81 e 953): " + i);
                System.out.println("Soma dos ímpares: " + soma);
            }

        }
        
    }
    
}
