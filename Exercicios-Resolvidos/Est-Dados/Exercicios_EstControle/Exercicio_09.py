# Escrever um programa que leia o nome e ano de nascimento de uma
# pessoa e calcule a idade atual dele. Exibir o nome e a idade calculada.

list = []
anoAtual = 2021

nome = input("Digite seu nome: ")
list.append(nome.upper())

anoNasc = int(input("Informe seu ano de nascimento: "))
list.append(anoNasc)

idade = anoAtual - list[1]

print('Nome:',nome)
print(f'Você possui {idade} anos de idade.')