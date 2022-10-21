# Faça um programa que leia N valores e os escreva na ordem contrária à que foram digitados.
# @author ecr34t1v3

list1 = []

print("Coleta de dados - Ordem Contrária")

while True:

    num = int(input("Informe um número: "))
    list1.append(num)
    opcao = input("Deseja continuar a coleta de dados? (S/N):")

    if opcao.upper() != "S":
        break

# Método para reverter a lista.
list1.reverse()

print("Órdem contrária:",list1)