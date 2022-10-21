# Montar uma aplicação que receba o nome de um aluno, suas quatro notas e calcule e exiba
# a sua média final. A aplicação deverá exibir também a situação final desse aluno
# (Aprovado/Recuperação/Reprovado).
# @author ecr34t1v3

notas = []

print()
nome = input("Informe o nome do aluno: ")

for i in range(4):
    num = float(input(f"Informe a {i + 1}ª nota: "))
    notas.append(num)

media = sum(notas) / 4

if media >= 7:
    print()
    print("Boletim do Aluno")
    print('*' * 30)
    print("Nome do aluno:",nome.upper())
    print("Média do aluno:",media)
    print("Situação do aluno: APROVADO.")
    print("*" * 30)
    print()

if media <= 6:
    print()
    print("Boletim do Aluno")
    print('*' * 30)
    print("Nome do aluno:",nome.upper())
    print("Média do aluno:",media)
    print("Situação do aluno: RECUPERAÇÃO.")
    print("*" * 30)
    print()

if media <= 5:
    print()
    print("Boletim do Aluno")
    print('*' * 30)
    print("Nome do aluno:",nome.upper())
    print("Média do aluno:",media)
    print("Situação do aluno: REPROVADO.")
    print("*" * 30)
    print()