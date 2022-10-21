// Passos obrigatórios para executar códigos JS no VSCode:
// https://pastebin.com/ZPKBsqgB

// Função obrigatória para execução de entrada de dados do teclado (input)
const prompt = require("prompt-sync")();

/* Montar uma aplicação na qual o usuário informe dois números, a operação que deseja
realizar (+, -, x, /), calcule e exiba o resultado da operação matemática. */
// @author ecr34t1v3

var lodash = require("lodash") //Biblioteca lodash
let listNum = [], num, op, sum, sub, mult, div // listNum = [5, 3]

for (i = 1; i < 3; i++) {
    num = Number(prompt(`Informe o ${i}º número: `))
    listNum.push(num)
}

op = prompt('Informe o tipo de operação matemática (+, -, x, /): ')

switch (op) {

    case '+':
        sum = lodash.sum(listNum)
        console.log(sum)
        /* Poderia ser utilizado também:
        sum = list_Num[0] + list_Num[1]
        console.log(sum) */
        break
    
    case '-':
        sub = listNum[0] - listNum[1]
        console.log(sub)
        break

    case 'x':
        mult = listNum[0] * listNum[1]
        console.log(mult)
        break
    
    case '/':
        div = listNum[0] / listNum[1]
        console.log(div)
        break
    
    default:
        console.log('Opção matemática inválida, programa finalizado.')

}