# Crie um programa que tenha uma tupla totalmente preenchida
# com uma contagem por extenso, de zero até vinte.
# Seu programa deve ler um número pelo teclado (entre 0 e 20)
# e mostrá-lo por extenso.
# @author ecr34t1v3

cont = ('zero', 'um', 'dois', 'três', 'quatro', 'cinco',
        'seis', 'sete', 'oito', 'nove', 'dez', 'onze',
        'doze', 'treze', 'quatorze', 'quinze', 'dezesseis',
        'dezessete', 'dezoito', 'dezenove', 'vinte')

while True:

    num = int(input("Informe um número entre 0 e 20: "))
    if 0 <= num <= 20:
        break
    print('Tente novamente. ', end='')

print(f'Você digitou o número {cont[num]}.')



