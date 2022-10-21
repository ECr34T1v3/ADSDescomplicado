// Passos obrigatórios para executar códigos JS no VSCode:
// https://pastebin.com/ZPKBsqgB

// Função obrigatória para execução de entrada de dados do teclado (input)
const prompt = require("prompt-sync")();

/* Escrever um programa para calcular a área de um retângulo cujos lados são a e b.
Deverá ser impresso também o valor dos lados. */
// @author ecr34t1v3

console.log()
console.log('Área de um retângulo')
console.log()

let base, altura, area

base = Number(prompt('Valor da base do retângulo: '))
altura = Number(prompt('Valor da altura do retângulo: '))

area = (base * altura)

console.log()
console.log('Valor da área:',area)