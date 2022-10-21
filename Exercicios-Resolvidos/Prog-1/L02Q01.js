// Passos obrigatórios para executar códigos JS no VSCode:
// https://pastebin.com/ZPKBsqgB

// Função obrigatória para execução de entrada de dados do teclado (input)
const prompt = require("prompt-sync")();

/* Escrever um programa que leia através do teclado um conjunto indeterminado de valores
até que um valor nulo (igual a zero) seja informado. Identificar e exibir o maior e o menor
número informado. */
// @author ecr34t1v3

let listNum = [], num

console.log('Menor e maior número')
console.log('Se desejar parar a execução, digite 0 a qualquer momento')
num = Number(prompt('Informe um número: '))
listNum.push(num)

while (num != 0) {
    num = Number(prompt('Informe outro número: '))
    listNum.push(num)

}

console.log('Menor número: ',Math.min(...listNum))
console.log('Maior número: ',Math.max(...listNum))