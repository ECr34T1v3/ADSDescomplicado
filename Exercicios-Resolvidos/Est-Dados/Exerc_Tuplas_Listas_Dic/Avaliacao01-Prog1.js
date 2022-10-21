/* Um usuário necessita de uma listagem dos alunos de determinada turma que foram aprovados
(regra para aprovação: média maior ou igual 7). Comparativamente, quão melhor
os alunos aprovados foram que os alunos reprovados
(quantos % a média dos alunos aprovados foi superior aos alunos reprovados) ? 
@author ecr34t1v3 */

const input = require('prompt-sync')();


let Aluno = function(nome) {
    notas = []
    this.nome = nome
    this.definirNotas = function(...n) {
      this.notas = n
    }
    this.calcularMedia = function() {
      return this.notas.reduce((p, c) => p + c) / this.notas.length
    }
  }

  let confirme = ''
  while (confirme != 'n') {
    
    let nome = new Aluno(input('Informe o nome do aluno: '))
    nome.definirNotas = input('Informe a nota do Aluno: ')

    confirme = input('Deseja continuar? (S/N): ')

  }

  /* let samuel = new Aluno('samuel')
  let eduardo = new Aluno('eduardo')
  let mario = new Aluno('mario')
   
  samuel.definirNotas(1, 4, 7)
  eduardo.definirNotas(5, 8, 9)
  mario.definirNotas(10, 6, 10) */
   
  //let alunos = ['']
   
  let alunosAprovados = notas.filter(el => el.calcularMedia() >= 7)
  let alunosReprovados = notas.filter(el => el.calcularMedia() < 7)

  let mediaDosAlunosAprovados = alunosAprovados.map(el => el.notas.reduce((p, e) => p + e)).reduce((p, e) => p + e) / alunosAprovados.map(el => el.notas.length).reduce((p, e) => p + e)
  let mediaDosAlunosReprovados =
  alunosReprovados.map(el => el.notas.reduce((p, e) => p + e)).reduce((p, e) => p + e) / alunosReprovados.map(el => el.notas.length).reduce((p, e) => p + e)
   
  console.log('Os alunos aprovados foram: ' + alunosAprovados.map(x => x.nome))//[mario, eduardo]
  console.log('A média dos alunos aprovados foi: ' + mediaDosAlunosAprovados)//8
  console.log('A média dos alunos reprovados foi: ' + mediaDosAlunosReprovados)//4
  console.log('Os alunos aprovados tiveram uma média de notas ' + ((mediaDosAlunosReprovados /mediaDosAlunosAprovados) * 100) + '%' + ' superior aos alunos reprovados')//50%