// Passos obrigatórios para executar códigos JS no VSCode:
// https://pastebin.com/ZPKBsqgB

// Função obrigatória para execução de entrada de dados do teclado (input)
const prompt = require("prompt-sync")();

/* Dadas as notas obtidas por cada aluno de uma disciplina, escrever um programa para ler
essas notas. O programa deve calcular e exibir a média aritmética das notas dos alunos.
Considerar o flag como sendo a nota 99. */
// @author ecr34t1v3

var lodash = require("lodash")

let listNotas = [], nota, media

console.log('Média Aritmética de Notas')
console.log('Se desejar parar a execução, digite o número 99')
nota = Number(prompt('Informe a nota: '))

if (nota == 99) {
    console.log('Programa finalizado.')
    return
}

listNotas.push(nota)

while (nota != 99) {
    nota = Number(prompt('Informe outra nota: '))
    if (nota == 99) {
        break
    }
    listNotas.push(nota)
}

media = lodash.sum(listNotas) / listNotas.length

console.log('Média aritmética do aluno:',media)