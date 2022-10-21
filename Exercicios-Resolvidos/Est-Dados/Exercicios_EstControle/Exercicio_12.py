# Escrever um programa que receba três notas e calcule a média ponderada desse aluno,
# considerando que: a primeira nota tem peso 2,5; a segunda nota tem peso 3,5; e a terceira
# nota tem peso 4. Exibir as três notas e a média calculada.
# Média = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / (peso1 + peso2 + peso3)
# @author ecr34t1v3

tupl = (2.5, 3.5, 4)
list = []

print()

for i in range(3):
    nota = float(input(f"Informe a {i + 1}ª nota: "))
    list.append(nota)

media = ((list[0] * tupl[0]) + (list[1] * tupl[1]) + (list[2] * tupl[2]) / (tupl[0] + tupl[1] + tupl[2]))

print()
print("Boletim do Aluno")
print("*" * 30)
print(f"Notas: {list[0]}, {list[1]} e {list[2]}.")
print("Média ponderada:",media)
print("*" * 30)
print()