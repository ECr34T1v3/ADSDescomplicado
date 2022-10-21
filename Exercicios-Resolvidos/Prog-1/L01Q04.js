// Passos obrigatórios para executar códigos JS no VSCode:
// https://pastebin.com/ZPKBsqgB

// Função obrigatória para execução de entrada de dados do teclado (input)
const prompt = require("prompt-sync")();

/* Escrever um programa que leia dois valores quaisquer, calcule a diferença
entre o maior e o menor, e em seguida exiba os três valores. */
// @author ecr34t1v3

let num1, num2, diff

num1 = Number(prompt('Informe o primeiro número: '))
num2 = Number(prompt('Informe o segundo número: '))

if (num1>num2) {

    diff = num1 - num2
    console.log()
    console.log('A diferença do maior número para o menor número é',diff)

}
else if (num2>num1) {

    diff = num2 - num1
    console.log()
    console.log('A diferença do maior número para o menor número é',diff)

}
else{

    console.log()
    console.log('Não existe diferença.')

}