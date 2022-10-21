// Passos obrigatórios para executar códigos JS no VSCode:
// https://pastebin.com/ZPKBsqgB

// Função obrigatória para execução de entrada de dados do teclado (input)
const prompt = require("prompt-sync")();

/* Desenvolva um programa que leia o nome e a idade de 3 pessoas
e mostre o nome da pessoa mais velha e o nome da pessoa mais nova. */
// @author ecr34t1v3

let nome, idade
let lista_Nome = [], lista_Idade = []

for (i = 1; i < 4; i++) {
    nome = String(prompt(`Digite o ${i}º nome: `))
    lista_Nome.push(nome)

    idade = prompt('Digite a idade: ')
    lista_Idade.push(idade)
}

console.log('Nome da pessoa mais velha: ',Math.max(lista_Idade))