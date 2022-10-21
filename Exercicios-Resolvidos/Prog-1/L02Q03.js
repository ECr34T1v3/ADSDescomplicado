// Passos obrigatórios para executar códigos JS no VSCode:
// https://pastebin.com/ZPKBsqgB

// Função obrigatória para execução de entrada de dados do teclado (input)
const prompt = require("prompt-sync")();

/* Dado um conjunto de valores positivos, lidos através do teclado, escrever um programa
para determinar a soma desses valores. Um valor negativo lido indica o fim da leitura dos
dados e não deve ser considerado na soma (esse último valor chama-se flag). */
// @author ecr34t1v3

var lodash = require("lodash")

let num, listNum = [], sum

console.log('Soma de números positivos')
console.log('Se desejar parar a execução, digite um número negativo')
num = Number(prompt('Digite um número: '))

if (num < 0) {
    console.log('Programa finalizado')
    return
}

listNum.push(num)

while (num >= 0) {
    num = Number(prompt('Digite outro número: '))
    if (num < 0) {
        console.log('Programa finalizado')
        break
    }
    listNum.push(num)

}

sum = lodash.sum(listNum)
console.log('Soma dos números:',sum)
