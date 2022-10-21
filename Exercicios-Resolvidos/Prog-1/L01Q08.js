// Passos obrigatórios para executar códigos JS no VSCode:
// https://pastebin.com/ZPKBsqgB

// Função obrigatória para execução de entrada de dados do teclado (input)
const prompt = require("prompt-sync")();

/* Montar uma aplicação que receba o nome de um aluno, suas quatro notas e calcule e exiba
a sua média final. A aplicação deverá exibir também a situação final desse aluno
(Aprovado/Recuperação/Reprovado). */
// @author ecr34t1v3

var lodash = require("lodash") //Biblioteca lodash
var nome, listNotas = [], notas, media

nome = prompt('Informe o nome do aluno: ')

for (i = 1; i < 5; i++) {
    notas = Number(prompt(`Informe a ${i}ª nota: `))
    listNotas.push(notas)

}

media = lodash.sum(listNotas) / 4

if (media < 5) {
    console.log(`O aluno ${nome} obteve média ${media}`)
    console.log('Situação: Reprovado.')

}
else if (media <= 6) {
    console.log(`O aluno ${nome} obteve média ${media}`)
    console.log('Situação: Recuperação.')

}
else {
    console.log(`O aluno ${nome} obteve média ${media}`)
    console.log('Situação: Aprovado.')

}