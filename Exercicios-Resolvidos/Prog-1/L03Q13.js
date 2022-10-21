// Passos obrigatórios para executar códigos JS no VSCode:
// https://pastebin.com/ZPKBsqgB

// Função obrigatória para execução de entrada de dados do teclado (input)
const prompt = require("prompt-sync")();

/* Faça um array de tamanho 50 preenchido com o seguinte valor: (i+ 5 ∗ i) % (i+ 1), sendo i, a posição do
elemento no array. Em seguida imprima o array na tela. */
// @author ecr34t1v3

let listNum = []

for (let i = 0; i < 50; i++) {

    listNum.push((i+ 5 * i) %(i + 1))
}

console.log(listNum)