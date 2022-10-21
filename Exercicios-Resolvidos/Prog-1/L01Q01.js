// Passos obrigatórios para executar códigos JS no VSCode:
// https://pastebin.com/ZPKBsqgB

// Função obrigatória para execução de entrada de dados do teclado (input)
const prompt = require("prompt-sync")();

// Montar uma aplicação que calcule a soma de dois números quaisquer.
// @author ecr34t1v3

console.log()
console.log("Soma de dois números")
console.log()

let valor1, valor2, soma

valor1 = Number(prompt("Informe o primeiro número: "))
valor2 = Number(prompt("Informe o segundo número: "))

soma = valor1 + valor2

console.log()
console.log("A soma de dois valores é igual a",soma)