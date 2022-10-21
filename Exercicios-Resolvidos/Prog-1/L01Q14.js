// Passos obrigatórios para executar códigos JS no VSCode:
// https://pastebin.com/ZPKBsqgB

// Função obrigatória para execução de entrada de dados do teclado (input)
const prompt = require("prompt-sync")();

/* A partir da questão anterior, caso as medidas correspondam aos lados de um triângulo
informar o tipo desse triângulo, considerando que:
a) Triângulo Equilátero – possui os três lados iguais;
b) Triângulo Isósceles – possui dois lados iguais e um diferente;
c) Triângulo Escaleno – possui três lados com medidas diferentes. */
// @author ecr34t1v3

let lado, listLados = [] // [ladoA, ladoB, ladoC] = [pos0, pos1, pos2]

for (i = 1; i < 4; i++) {    
    lado = Number(prompt(`Informe o ${i}º lado: `))
    listLados.push(lado)
}

// if (ladoA + ladoB > ladoC && ladoA + ladoC > ladoB && ladoB + ladoC > ladoA)
if (listLados[0] + listLados[1] > listLados[2] && listLados[0] + listLados[2] > listLados[1]
&& listLados[1] + listLados[2] > listLados[0]) {

    console.log('Os três lados formam um triângulo')

    // if (ladoA == ladoB && ladoA == ladoC)
    if (listLados[0] == listLados[1] && listLados[0] == listLados[2]) {
        console.log('Tipo: Equilátero.')
    }
    // OBS: Operador lógico "||" = "ou"
    // if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC)
    else if (listLados[0] == listLados[1] || listLados[0] == listLados[2] || listLados[1] == listLados[2]) {
        console.log('Tipo: Isóceles.')
    }
    else {
        console.log('Tipo: Escaleno.')
    }

}
else {

    console.log('Os três lados não formam um triângulo.')

}