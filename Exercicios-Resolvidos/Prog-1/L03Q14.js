// Passos obrigatórios para executar códigos JS no VSCode:
// https://pastebin.com/ZPKBsqgB

// Função obrigatória para execução de entrada de dados do teclado (input)
const prompt = require("prompt-sync")();

/* Faça um programa que receba do usuário dois arrays, A e B, com 10 números inteiros cada. Crie um novo array
denominado C calculando C = A - B. Mostre na tela os dados do array C. */
// @author ecr34t1v3

let listA = []
let listB = []
let listC = []

for (let i = 0; i < 10; i++) {
    listA.push(Math.floor(Math.random()*10))

}

for (let i = 0; i < 10; i++) {
    listB.push(Math.floor(Math.random()*10))

}

listC = listA - listB

console.log(listA)
console.log(listB)
console.log(listC)
