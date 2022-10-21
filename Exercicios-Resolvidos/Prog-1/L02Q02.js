// Passos obrigatórios para executar códigos JS no VSCode:
// https://pastebin.com/ZPKBsqgB

// Função obrigatória para execução de entrada de dados do teclado (input)
const prompt = require("prompt-sync")();

/* Escrever um programa para calcular a soma dos números inteiros existentes entre 1 e N,
inclusive, onde o valor de N será lido através do teclado. N obrigatoriamente deve receber um
valor maior que 1. Caso o valor de N seja menor ou igual a 1 o programa deve mostrar uma
mensagem para o usuário e encerrar a execução. */
// @author ecr34t1v3

var lodash = require("lodash")

let num, listNum = [], sum

console.log('Soma de números inteiros')
console.log('Se desejar parar a execução, digite 1 ou um valor menor a qualquer momento')
num = Number(prompt('Digite um número: '))

if (num <= 1) {
    console.log('Programa finalizado')
}

listNum.push(num)

while (num > 1) {
    num = Number(prompt('Digite outro número: '))
    if (num <= 1) {
        console.log('Programa finalizado')
        break
    }
    listNum.push(num)

}

sum = lodash.sum(listNum)
console.log('Soma dos números:',sum)