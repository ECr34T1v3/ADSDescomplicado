// Passos obrigatórios para executar códigos JS no VSCode:
// https://pastebin.com/ZPKBsqgB

// Função obrigatória para execução de entrada de dados do teclado (input)
const prompt = require("prompt-sync")();

/* Escrever um programa para calcular e escrever o fatorial de um número inteiro N,
sabendo-se que:

N! = 1 {se N = 0}
Ou

N! = 1 x 2 x 3 x ... x N {se N > 0} */
// @author ecr34t1v3

let cont, fatorial, num

num = Number(prompt('Informe um número: '))

if (num == 1) {
    console.log('N! = 1')
}