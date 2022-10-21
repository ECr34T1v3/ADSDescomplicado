// Passos obrigatórios para executar códigos JS no VSCode:
// https://pastebin.com/ZPKBsqgB

// Função obrigatória para execução de entrada de dados do teclado (input)
const prompt = require("prompt-sync")();

/* Ler um conjunto de números reais, armazenando-o em array e calcular o quadrado dos elementos deste array,
armazenando o resultado em outro array. Os conjuntos têm 10 elementos cada. Imprimir todos os conjuntos. */
// @author ecr34t1v3

let list_Num = []
let num = []

for (let i = 0; i < 10; i++) {
    list_Num.push(Math.floor(Math.random()*10))

}

for (let i in list_Num) {
    num[i] = Math.pow(list_Num[i],2)

}

console.log(list_Num)
console.log(num)