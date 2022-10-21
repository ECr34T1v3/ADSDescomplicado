# Small Challenge @author ecr34t1v3
# Primeiro algorítmo

#lista = []
#chave = []

#def BuscaBinaria (lista, chave):
    #tamanho = len(lista)
    #ladoEsq = 0
    #ladoDir = tamanho - 1

    #while (ladoEsq <= ladoDir):
        #meio = int((ladoEsq + ladoDir) / 2)
        #if lista[meio] == chave:
            #print(meio)
            #break
        #if chave < lista[meio]:
            #ladoDir = meio - 1

        #if chave > lista[meio]:
            #ladoEsq = meio + 1

        #else:
            #print("Valor não encontrado")

#listaA = [1, 2, 3, 4, 5, 6, 7 ,8 ,9, 10]
#listaB = 2

#BuscaBinaria(listaA, listaB)


#Segundo algorítmo

#def BuscaBinaria(lista):
    #ladoEsq = 0
    #ladoDir = len(a) - 1

    #while ladoEsq <= ladoDir:

        #meio = (ladoEsq + ladoDir) // 2 # Esse operador "//" significa divisão truncada

        #if lista[meio] == x:
            #return meio
        #elif x < lista[meio]:
            #ladoDir = meio - 1
        #elif x > meio:
            #ladoEsq = meio + 1

    #return -1 # Irá retornar -1 se o valor não for encontrado

#print()
#num = input("Entre a lista crescente de números inteiros separados por espaços: ")
#lista = [int (item) for item in num.split()]
#x = int(input("Elemento a ser buscado: "))

#localiz = BuscaBinaria(lista, x)

#if localiz == -1:
    #print()
    #print("#" * 36)
    #print("Elemento não encontrado. ")
    #print("#" * 36)
#else:
    #print()
    #print("#" * 36)
    #print("Localização do elemento: " + str(localiz) + ".") # Localização começando em zero.
    #print("#" * 36)


#Terceiro algoritmo

import random

def BuscaBinIterativa(lista, num):
    ladoEsq, ladoDir, tentativ = 0, len(lista), 1
    while 1:
        meio = (ladoEsq + ladoDir) // 2 # Esse operador "//" significa divisão truncada
        num_aux = lista[meio]
        if num == num_aux:
            return tentativ
        elif num > num_aux:
            ladoEsq = meio
        else:
            ladoDir = meio
        tentativ += 1

def BuscaBinRecursiva(lista, num, esq, dir, tentativ):
    meio = (esq + dir) // 2
    num_aux = lista[meio]
    if num == num_aux:
        return tentativ
    elif num > num_aux:
        return BuscaBinRecursiva(lista, num, meio, dir, tentativ + 1)
    return BuscaBinRecursiva(lista, num, esq, meio, tentativ + 1)

def Teste():
    lista = [i for i in range(1, 51)]
    num = random.choice(lista)
    print("Numeros sorteados da lista: ", lista)
    print("Número escolhido: ", num)
    print("Tentativa (Iterativo): ", BuscaBinIterativa(lista, num))
    print("Tentativa (Recursivo): ", BuscaBinRecursiva(lista, num, 0, len(lista), 1))

Teste()


#Quarto algorítmo

#lista = [4, 6, 1, 3, 0]
#num_ord = sorted(lista)

#print()
#print("#" * 36)
#print ("Lista não-ordenada: ", lista)
#print ("Lista ordenada: ", num_ord)
#print("#" * 36)


#Quinto algorítmo

#lista = []
#print()
#print("*** Coleta de Dados para a Lista ***")
#interacao = input("Deseja iniciar a coleta? (S/N): ")

#while (interacao.upper() == "S"):
    #print()
    #num = int(input("Informe um número (inteiro): "))
    #lista.append(num)
    #lista.sort()

    #interacao = input("Deseja continuar? (S/N): ")

#print()
#print("#" * 36)
#print ("Lista Ordenada: ", lista)
#print("#" * 36)


#Sexto algorítmo

#lista = []
#print()
#print("*** Coleta de Dados para a Lista ***")
#interacao = input("Deseja iniciar a coleta? (S/N): ")

#while (interacao.upper() == "S"):
    #num = int(input("Informe um número (inteiro): "))
    #for chave, valor in enumerate(lista):
        #if num < valor:
            #lista.insert(chave, num)
            #break
    #else:
        #lista.append(num)
    #nteracao = input("Deseja continuar? (S/N): ")

#print()
#print("#" * 36)
#print("Lista Ordenada: ", lista)
#print("#" * 36)