# Escrever um programa que lê um vetor A com 25 posições e o escreve. Ordene a seguir os elementos de A em
# ordem crescente e escreva novamente A.
# @author ecr34t1v3

list1 = []

print()
print("Coleta de dados - Ordenando Números")

while True:

    num = int(input("Digite um número: "))
    list1.append(num)

    opcao = input("Deseja continuar a coleta? (S/N): ")

    if opcao.upper() != 'S':
        break

print(f'Os números digitados foram {list1[0:]}')
print(f'Os números ordenados são {sorted(list1)} respectivamente.')