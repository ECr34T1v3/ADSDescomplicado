// Passos obrigatórios para executar códigos JS no VSCode:
// https://pastebin.com/ZPKBsqgB

// Função obrigatória para execução de entrada de dados do teclado (input)
const prompt = require("prompt-sync")();

/* Faça um programa para ler a nota da prova de 15 alunos e armazene num array,
calcule e imprima a média geral. */
// @author ecr34t1v3

var lodash = require("lodash")

let list_Notas = []
let notas
let media

for (i = 1; i < 16; i++) {
    notas = Number(prompt(`Informe a nota do ${i}º aluno: `))
    list_Notas.push(notas)

}

media = lodash.sum(list_Notas) / list_Notas.length

console.log()
console.log('Média geral das notas: ' + media)