// Passos obrigatórios para executar códigos JS no VSCode:
// https://pastebin.com/ZPKBsqgB

// Função obrigatória para execução de entrada de dados do teclado (input)
const prompt = require("prompt-sync")();

/* Em uma eleição presidencial existem três candidatos. Os votos são informados
por meio de código. Os códigos utilizados são:
- 1, 2, 3 -> Votos para os respectivos candidatos
- 4 -> Voto nulo
- 5 -> Voto em branco 
Faça um algoritmo que calcule e mostre: A porcentagem de votos do candidato
que ganhou a eleição, e a porcentagem de votos nulos e brancos sobre o total
de votos. OBS: Para finalizar a votação, o usuário deverá digitar o código 0. */
// @author ecr34t1v3

let candidato1 = [], candidato2 = [], candidato3 = [], votoNulo = [], votoEmBranco = []
let nota, totalVotos, votacao

console.log()
console.log('*****ELEIÇÃO EXTRAORDINÁRIA*****')
console.log('Para votar no candidato 1: Digite 1')
console.log('Para votar no candidato 2: Digite 2')
console.log('Para votar no candidato 3: Digite 3')
console.log('Para votar em Nulo: Digite 4')
console.log('Para votar em Branco: Digite 5')
console.log('Para finalizar a votação, digite 0')
console.log('*********************************')
votacao = parseInt(prompt('Informe o código do candidato: '))

switch (votacao) {

    case '0':
        console.log('Nenhum dado foi computado, votação finalizada.')
        break
    case '1':
        candidato1.push(1)
        break
    case '2':
        candidato2.push(1)
        break
    case '3':
        candidato3.push(1)
        break
    case '4':
        votoNulo.push(1)
        break
    case '5':
        votoEmBranco.push(1)
        break
    default:
        console.log('Código inválido, votação finalizada.')
        break
}

while (votacao != 0) {

    console.log()
    console.log('*****ELEIÇÃO EXTRAORDINÁRIA*****')
    console.log('Para votar no candidato 1: Digite 1')
    console.log('Para votar no candidato 2: Digite 2')
    console.log('Para votar no candidato 3: Digite 3')
    console.log('Para votar em Nulo: Digite 4')
    console.log('Para votar em Branco: Digite 5')
    console.log('Para finalizar a votação, digite 0')
    console.log('*********************************')
    votacao = parseInt(prompt('Informe o código do candidato: '))

    switch (votacao) {
        
        case '0':
            console.log('Nenhum dado foi computado, votação finalizada.')
            break
        case '1':
            candidato1.push(1)
            break
        case '2':
            candidato2.push(1)
            break
        case '3':
            candidato3.push(1)
            break
        case '4':
            votoNulo.push(1)
            break
        case '5':
            votoEmBranco.push(1)
            break
        default:
            console.log('Código inválido, votação finalizada.')
            break
    }

}



console.log(candidato2)