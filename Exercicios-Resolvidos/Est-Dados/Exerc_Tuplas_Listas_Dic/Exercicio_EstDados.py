# Sistema para gerenciamento de clientes

from os import system


class Cliente(object):  # Classe cliente vazia, pois pode ser atribuido propriedades mais tarde
    pass


class Pilha(object):  # Classe Pilha

    def __init__(self):  # Método construtor
        self.pilha = []  # Declara lista vazia sendo propriedade da classe

    def incluir(self):
        """Inclui um cliente na pilha"""
        cliente = Cliente()  # Instancia objeto cliente
        cliente.nome = input('Nome: ')  # Inclui propriedade NOME no objeto com valor digitado
        cliente.telefone = input('Telefone: ')  # Inclui propriedade TELEFONE no objeto com valor digitado
        cliente.cpf = input('CPF: ')  # Inclui propriedade CPF no objeto com valor digitado
        self.pilha.insert(0, cliente)  # Insere sempre na primeira posição

    def consultar(self):
        """Lista todos os itens"""
        for item in self.pilha:  # Faz uma iteração em todos os itens da lista
            print('\nNome: ' + item.nome)
            print('Telefone: ' + item.telefone)
            print('CPF: ' + item.cpf)
        input()  # Aguarda tecla enter

    def excluir(self):
        """Exclui o primeiro item da lista"""
        if len(self.pilha) > 0:  # Pega o tamanho (length) da pilha e compara
            self.pilha.pop(0)  # Exclui item da posição 0
            print('Ítem excluído.')
        else:
            print('Pilha vazia.')
        input()  # Aguarda tecla enter


def main():

    def limpa():
        """Limpa a tela"""
        system('cls')

    p = Pilha()  # Instancia objeto Pilha atribuindo para variável p
    while True:  # Loop infinito, sempre verdadeiro
        limpa()
        print('-=' * 10)
        print('Gerenciar Clientes')
        print('-=' * 10)
        print("1. Incluir: ")
        print("\n2. Consultar: ")
        print("\n3. Excluir: ")
        print("\n4. Sair: ")
        print('-=' * 10)
        try:  # Tenta fazer
            op = int(input())  # Pega a entrada do teclado e converte para int
            if op == 1:       # Caso dê erro na conversão, cai no except abaixo
                limpa()
                p.incluir()  # Chama método INCLUIR do objeto p (pilha)
            elif op == 2:
                limpa()
                p.consultar()  # Chama método CONSULTAR do objeto p (pilha)
            elif op == 3:
                limpa()
                p.excluir()  # Chama método EXCLUIR do objeto p (pilha)
            elif op == 4:
                break  # Quebra o loop e fecha o programa
            else:
                print('Opção inválida.')
        except:  # Caso tenha exceção, (por exemplo digitar uma letra) sera executado:
            print('Opção inválida, digite um número.')

main()  # Chama o main, primeira função a ser executada