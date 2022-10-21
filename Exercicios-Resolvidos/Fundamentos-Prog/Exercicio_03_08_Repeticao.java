/**
 * Enunciado: https://pastebin.com/KYwwaFKs
 * @author ecr34t1v3
 */

import java.util.Scanner;

public class Exercicio_03_08_Repeticao {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        /** Inicializando variáveis principais **/
        int matricula, idade;
        String sexo, concursado;
        
        /** Inicializando contadores **/
        int cont30SemConcurs = 0, contFConcurs = 0, contConcurs = 0, contM = 0;
        double cont40 = 0;
        
        /** Inicializando variáveis para altura **/
        double altura, mediaAltura, somaAltura = 0;
        
        System.out.print("Matrícula: ");
        matricula = input.nextInt();
        
        /** Estabelecendo condicional para finalizar programa no início caso matrícula seja = 0 **/
        if (matricula == 0) {
            System.out.println("Matrícula igual a zero no início, programa finalizado");
            return;
        }
        
        System.out.print("Idade: ");
        idade = input.nextInt();
        
        System.out.print("Sexo (M ou F): ");
        sexo = input.next();
        
        System.out.print("Altura (em metros): ");
        altura = input.nextDouble();
        
        System.out.print("Concursado(a)? (S/N): ");
        concursado = input.next();
        
        int maiorIdade = idade; //Debugando para receber var de maiorIdade após apresentar pelo usuário
        
        /** Enquanto matrícula for diferente de zero, repita condicionais **/
        while (matricula != 0) {
            
            if (sexo.equalsIgnoreCase("F") && concursado.equalsIgnoreCase("S")) {
                contFConcurs++; //Se sexo for feminino e for concursada, contabilize
            }
            
            if (sexo.equalsIgnoreCase("M")) {
                contM++; //Se sexo for masculino, contabilize
            }
            
            if (sexo.equalsIgnoreCase("M") && concursado.equalsIgnoreCase("S")) {
                /* Se a idade for maior que a maiorIdade, a variável de maiorIdade irá receber a idade */
                if (idade > maiorIdade) {
                    maiorIdade = idade;
                }
            }
            
            if (sexo.equalsIgnoreCase("F") && concursado.equalsIgnoreCase("N")) {
                /* Se sexo for feminino, não concursado e se a idade for maior que 30 anos, contabilize */
                if (idade > 30) {
                    cont30SemConcurs++;
                }
            }
            
            if (concursado.equalsIgnoreCase("S")) {
                contConcurs++; //Se for concursado, contabilize
            }
            
            /* Se sexo for masculino e a idade for menor que 40 anos, estabeleça
            ** a soma da altura recebendo altura, e contabilize */
            if (sexo.equalsIgnoreCase("M") && idade < 40) {
                somaAltura += altura;
                cont40++;
            }
            
            /** Solicitando os dados no loop **/
            
            System.out.print("Matrícula: ");
            matricula = input.nextInt();
            
            /** Estabelecendo condicional no loop para finalizar programa
             * caso matrícula seja = 0 sem perguntar o restante dos dados **/
            if (matricula == 0) {
                break;
            }
            
            System.out.print("Idade: ");
            idade = input.nextInt();
            
            System.out.print("Sexo (M ou F): ");
            sexo = input.next();
            
            System.out.print("Altura (em metros): ");
            altura = input.nextDouble();
            
            System.out.print("Concursado(a)? (S/N): ");
            concursado = input.next();
            
        }
        
        //Informando a contagem de dados para o usuário
        System.out.println("Número de funcionárias concursadas: " + contFConcurs);
        System.out.println("Número de funcionários (somente homens): " + contM);
        System.out.println("Maior idade dos homens concursados: " + maiorIdade);
        System.out.println("Quantidade de mulheres com mais de 30 anos sem concurso: " + cont30SemConcurs);
        System.out.println("Quantidade de concursados: " + contConcurs);
        mediaAltura = (double)somaAltura / (double)cont40; //Estabelecendo cast para média da altura
        System.out.println("Média das alturas dos homens com menos de 40 anos: " + mediaAltura);
        
    }
    
}
