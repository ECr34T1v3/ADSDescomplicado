// Passos obrigatórios para executar códigos JS no VSCode:
// https://pastebin.com/ZPKBsqgB

// Função obrigatória para execução de entrada de dados do teclado (input)
const prompt = require("prompt-sync")();

// Escrever um programa que leia três valores, e identifique o maior valor dentre eles
// @author ecr34t1v3

let num1, num2, num3, num

console.log()
num1 = Number(prompt('Informe o primeiro número: '))
num2 = Number(prompt('Informe o segundo número: '))
num3 = Number(prompt('Informe o terceiro número: '))

num = (num1, num2, num3) // Tupla armazenando os valores das variáveis

console.log()
console.log('Maior número:',Math.min(num)) //Função para selecionar maior valor sem precisar de condicional