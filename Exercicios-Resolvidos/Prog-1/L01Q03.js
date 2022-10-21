// Passos obrigatórios para executar códigos JS no VSCode:
// https://pastebin.com/ZPKBsqgB

// Função obrigatória para execução de entrada de dados do teclado (input)
const prompt = require("prompt-sync")();

/* Escrever um programa para calcular a temperatura em grau Celsius a partir da temperatura
corrente medida em Farenheit. Utilizar a fórmula ao lado: C = (F-32) / 1,8 */
// @author ecr34t1v3

console.log()
console.log('Cálculo de conversão de temp.')
console.log()

let f, c

F = Number(prompt('Informe a temperatura em Fahrenheit: '))

C = (F-32) / 1.8

console.log()
console.log('Temperatura em Celsius: ',C)