const input = require('prompt-sync')();

//Pega o ano atual
let data = new Date()
let ano = data.getFullYear()

//Armazena todos os objetos
let dados = []
let acumulador = 0
//Bloco de funções
function salvaDados(id){
    let nome = input("Digite o nome do aluno: ")
    let curso = input("Digite o curso do aluno: ")
    let sexo = input("Digite o sexo: M ou F: ")
    let idade = parseInt(input("Digite a idade: "))
    
    
    let dadosSalvo = geraMatricula(id,nome,idade,sexo,curso)
    
    dados.push(dadosSalvo)
}
//Função que gera os objetos
function geraMatricula(id,nome,idade,sexo,curso){
    let dados = {};
    dados.id = id
    dados.nome = nome
    dados.idade = idade
    dados.sexo = sexo.toUpperCase()
    dados.curso = curso
    dados.matricula = `${Math.floor(Math.random() * 1000)}${ano}`
    return dados
}
//Filter parar buscar dados
function busca(){
    console.log('Pesquisa...')
    let x = input(`Digite uma das opções para iniciar a busca:
        1-Para busca pelo nome;
        2-Para buscar pelo nome do curso;
        3-Para buscar pela matricula;
    `)
    switch(x){
        case '1':
            let nome = input('Digite o nome: ')
            console.log(dados.filter((chave)=> chave.nome == nome ))
            break;
        case '2':
            let curso = input("Digite o nome do curso: ")
            console.log(dados.filter((chave)=> chave.curso == curso ))
            break;
        case '3':
            let matricula = parseInt(input('Digite a matricula: '))
            console.log(dados.filter((chave)=> chave.matricula == matricula ))
            break
        default:
            console.log("Inválido")
            break;
    }
}
//Permitindo que edite



let confirme = ''
 


while(confirme != 'n'){
    console.log(`---------------- Sistema de matricula ----------------`)
    console.log(`
    1- Cadastrar Alunos.
    2- Pesquisar Alunos.
    3- Editar Aluno.
    `)

    let opcao = input("Escolha a opção: ")
    
    switch(opcao){
        case '1':
            salvaDados(acumulador)
            acumulador += 1
            break;
        case '2':
            //Busca
            busca()
            break;
        case '3':
            editar(dados);
            break;
        default:
            console.log('Inválido')
            break
    }
    confirme = input("Deseja continuar ? S/N: ").toLowerCase()
}
console.log(dados)