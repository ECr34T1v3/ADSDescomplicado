# Faça um programa que leia 100 valores e conte quantos são pares e quantos são ímpares.
# @author ecr34t1v3

from random import randint

num = (randint(0,10), randint(0,10), randint(0,10), randint(0,10), randint(0,10))

print(f'Os valores sorteados foram: ',end='')

for n in num:
    print(f'{n} ', end='')

print('\nOs valores pares digitados foram: ', end='')

for n in num:
    if n % 2 == 0:
        print(f'{n} ', end='')

print('\nOs valores ímpares digitados foram: ', end='')

for n in num:
    if n % 2 == 1:
        print(f'{n} ',end='')

print()