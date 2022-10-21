# Escrever um programa que lê um vetor com 20 posições e o escreve. Em seguida, troque, 1o elemento
# com o último, o 2o com o penúltimo, etc., até o 10o com o 11o e escreva o vetor N assim modificado.
# @author ecr34t1v3

list1 = []

for i in range(20):
    num = int(input("Informe um número: "))
    list1.append(num)

print("Vetor original:",list(list1))

for i in range(10):
    aux = list1[i]
    list1[i] = list[19-i]
    list1[19-i] = aux

print("Vetor modificado: ", end='')

for i in range(20):
    print(f"{list1[i]} ", end='')
