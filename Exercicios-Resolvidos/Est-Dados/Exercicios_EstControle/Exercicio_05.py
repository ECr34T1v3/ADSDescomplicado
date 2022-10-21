# Escrever um programa que leia três valores, e identifique o maior valor dentre eles.
# @author ecr34t1v3

lista=[]

for i in range(3):
    num = int(input("Informe um número: "))
    lista.append(num)

print('O maior numero digitado foi: {} '.format(max(lista)))
print('O menor numero digitado foi: {} '.format(min(lista)))