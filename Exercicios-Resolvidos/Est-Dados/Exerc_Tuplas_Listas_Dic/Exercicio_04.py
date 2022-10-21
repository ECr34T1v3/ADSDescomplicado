# Escrever um programa que lê um vetor com N posições, escrevendo seus valores em seguida.
# Encontre e escreva, a seguir, o maior e o menor valor e suas respectivas posições.
# @author ecr34t1v3

list1 = []

print("Coleta de Dados - Maior/Menor número")

while True:

    num = int(input("Informe um número: "))
    list1.append(num)

    opcao = input("Deseja continuar? (S/N): ")
    
    if opcao.upper() != "S":
        break

print()
print(f"O maior número é {max(list1)}")
print(f"O menor número é {min(list1)}")
print(f"{list(list1)} são as respectivas posições.")