# Ler um vetor D de 10 elementos. Retire todos os valores nulos ou negativos do vetor D.
# Escrever o vetor após a retirada dos nulos e negativos.
# @author ecr34t1v3

listD = []

print()
print('Coleta de dados - Retirando Nulos/Negativos')

while True:

    num = int(input("Digite um número: "))
    listD.append(num)

    if num <= 0:
        listD.remove(num)
    
    opcao = input("Deseja continuar? (S/N): ")

    if opcao.upper() != 'S':
        break

print(f'Os valores foram {listD[0:]} respectivamente.')