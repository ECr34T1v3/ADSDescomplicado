# EXEMPLO 01 
anoAtual = 2021
print("Obtendo um valor qualquer",end="\n")
print()

nome = input("Qual o seu nome completo? ")
print()

anoNascimento = int(input("Qual o ano do seu nascimento (YYYY)? "))
print()

print("O seu nome tem",len(nome),"caracteres.",end="\n")
print("O primeiro caracter é",nome[0],end="\n")
print("O último caracter é",(nome[len(nome) - 1]),end="\n")
print("O nome que você digitou foi",nome.upper(),end="\n")
print("Sua idade é de",anoAtual-anoNascimento,"anos.",end="\n")

texto = input("Qual texto deseja procurar nesse nome? ")

if nome.find(texto) != -1:
    print("Esse texto existe no nome. Está na posição",nome.find(texto))

else:
    print("Esse texto não existe no nome.")

print()
