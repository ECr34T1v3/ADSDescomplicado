// Passos obrigatórios para executar códigos JS no VSCode:
// https://pastebin.com/ZPKBsqgB

// Função obrigatória para execução de entrada de dados do teclado (input)
const prompt = require("prompt-sync")();

/* Dados três números inteiros, verificar se esses números correspondem aos lados de um
triângulo. Para que correspondam aos lados de um triângulo, cada lado deve ser menor que a
soma dos comprimentos dos outros dois lados. */
// @author ecr34t1v3

let lado, listLados = [] // [lado1, lado2, lado3] = [pos0, pos1, pos2]

for (i = 1; i < 4; i++) {    
    lado = Number(prompt(`Informe o ${i}º lado: `))
    listLados.push(lado)
}

// if lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1
if (listLados[0] + listLados[1] > listLados[2] && listLados[0] + listLados[2] > listLados[1]
&& listLados[1] + listLados[2] > listLados[0]) {

    console.log('Os três lados formam um triângulo.')

}
else {

    console.log('Os três lados não formam um triângulo.')

}