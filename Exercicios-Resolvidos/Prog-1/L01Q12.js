// Passos obrigatórios para executar códigos JS no VSCode:
// https://pastebin.com/ZPKBsqgB

// Função obrigatória para execução de entrada de dados do teclado (input)
const prompt = require("prompt-sync")();

/* Escrever um programa que receba três notas e calcule a média ponderada desse aluno,
considerando que: a primeira nota tem peso 2,5; a segunda nota tem peso 3,5; e a terceira
nota tem peso 4. Exibir as três notas e a média calculada.
Média = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / (peso1 + peso2 + peso3) */
// @author ecr34t1v3

let listNotas = [], listPesos = [2.5, 3.5, 4], media, notas

for (i = 1; i < 4; i++) {
    notas = Number(prompt(`Informe a ${i}ª nota: `))
    listNotas.push(notas)

}

media = ((listNotas[0] * listPesos[0]) + (listNotas[1] * listPesos[1]) + (listNotas[2] * listPesos[2])) /
(listPesos[0] + listPesos[1] + listPesos[2])

console.log('Nota 1: ',listNotas[0])
console.log('Nota 2: ',listNotas[1])
console.log('Nota 3: ',listNotas[2])
console.log('Média do aluno: ',media)