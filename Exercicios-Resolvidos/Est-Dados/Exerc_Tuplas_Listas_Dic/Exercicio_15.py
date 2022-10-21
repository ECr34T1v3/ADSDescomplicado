# Ler um vetor de até 10 elementos. A leitura deverá ser executada até que o vetor fique totalmente
# preenchido ou seja informado um valor negativo ou zero. Calcular e imprimir a soma dos valores
# maiores que 5 existentes no vetor.
# @author ecr34t1v3

list1 = []
num = 0

print()
print("Coleta de dados - Soma maiores que 5")
print("Para parar a execução, informe um valor negativo ou zero.")
print()

for i in range(10):
    num = int(input("Digite um número: "))

    if num <= 0:
        break
    else:
        list1.append(num)