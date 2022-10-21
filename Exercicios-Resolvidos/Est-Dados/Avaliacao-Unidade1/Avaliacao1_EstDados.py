""" Algoritmo para listas lineares sequenciais e ordenadas.
              @author Erik Garcia (ECr34T1v3)           
                https://github.com/ECr34T1v3            """

# Importando bibliotecas

'''Para testes sem a necessidade da função main (principal), desmarque o comentário da biblioteca random
abaixo, comente a função main e utilize a chamada das funções no final do código manualmente.'''
#import random

import sys
from bisect import insort
from os import system

# Lista para receber valores
lista = []

# Campo de funções

def inserir_lista(chave, lista):
    """
    Insere a chave na lista
    """
    lista.append(chave)
    i, p = 0, 0
    while lista[i] < chave:
        i += 1
    p = len(lista) - 2
    while p >= i:
        lista[p + 1] = lista[p]
        p -= 1
    lista[i] = chave

def busca_sentinela(chave, lista):
    """ Algoritmo de busca sentinela """
    lista.append(chave)
    i = 0
    while lista[i] != chave:
        i += 1
    if i == len(lista) - 1:
        lista.pop()
        return -1
    lista.pop()
    return i

def deleta_valor(chave, lista):
    """ Deleta uma valor na lista """
    posicao = busca_sentinela(chave, lista)
    if posicao >= 0:
        lista.pop(posicao)
        return True
    return False

def remove_repetidos(lista):
    """ Remove números repetidos """
    l = []
    for i in lista:
        if i not in l:
            l.append(i)
    l.sort()
    return l

def mostra_lista(lista):
    """ Imprime a lista """
    print("Valores da Lista:", lista)


def main():

    def limpa():
        """Limpa a tela"""
        system('cls')

    print()
    print("*** Est. Dados Descomplicada - Algoritmo para listas lineares sequenciais ***")
    interacao = input("Deseja iniciar a coleta de dados para a lista? (S/N): ")
    limpa()
    
    # Condicional para sair do programa caso seja digitado algo diferente de S
    if (interacao.upper() != "S"):
        sys.exit()

    while (interacao.upper() == "S"):
        print()
        inserir_lista(int(input("Informe um número: ")), lista)
        limpa()

        interacao = input("Deseja adicionar mais um valor? (S/N): ")

    limpa()
    mostra_lista(lista)

    print()
    print("*** Busca Sentinela (Busca um valor em uma posição determinada) ***")
    interacao = input("Deseja realizar a busca sentinela na Lista? (S/N): ")

    if (interacao.upper() == "S"):
        print()
        num = int(input("Informe o número a ser buscado na lista: "))
        limpa()
        print('O Valor informado está na posição ' + str(busca_sentinela(num, lista)) + ".")

    mostra_lista(lista)

    print()
    interacao = input("Deseja adicionar valores não ordenados na lista? (S/N): ")

    while (interacao.upper() == "S"):
        print()
        num = int(input("Informe um número: "))
        lista.append(num)
        limpa()

        interacao = input("Deseja adicionar mais um valor? (S/N): ")

    limpa()
    print("Limpando ítens repetidos automaticamente...")
    list_not_repeat = remove_repetidos(lista)
    mostra_lista(list_not_repeat)

    print()
    interacao = input("Deseja adicionar valores ordenados na lista? (S/N): ")

    while (interacao.upper() == "S"):
        print()
        insort(lista, int(input("Informe um número: ")))
        limpa()

        interacao = input("Deseja adicionar mais um valor? (S/N): ")

    limpa()
    print("Limpando ítens repetidos automaticamente...")
    list_not_repeat = remove_repetidos(lista)
    mostra_lista(list_not_repeat)

    print()
    interacao = input("Deseja remover valores na lista? (S/N): ")

    while (interacao.upper() == "S"):
        print()
        # Condicional que para a execução do loop, caso a lista esteja vazia.
        if not lista:
            break
        num = int(input("Informe o número a ser removido: "))
        deleta_valor(num, lista)
        limpa()
        print("Valor", num, "Removido.")
        print()

        interacao = input("Deseja remover mais um valor? (S/N): ")

    limpa()
    print("Limpando ítens repetidos automaticamente...")
    list_not_repeat = remove_repetidos(lista)
    mostra_lista(list_not_repeat)


main() # Chama a função principal para execução primária.


# Campo de chamada das funções manuais

'''
mostra_lista(lista)
print()
'''
 
'''for i in range(0, 20):
    inserir_lista(random.randint(1, 20), lista)'''

'''print('Valor na posicao: ' + str(busca_sentinela(1, lista)))
mostra_lista(lista)
deleta_valor(1, lista)
lista = remove_repetidos(lista)
print ("Lista sem ítens repetidos: ", lista)
mostra_lista(lista)
lista.append(10)
print("Adicionando não ordenado: ", lista)
insort(lista, int(input('digite o número:')))
print("Adicionando ordenado: ", lista)'''