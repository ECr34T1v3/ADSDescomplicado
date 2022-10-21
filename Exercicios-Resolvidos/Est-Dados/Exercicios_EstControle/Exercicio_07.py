# Montar uma aplicação na qual o usuário informe dois números, a operação que deseja
# realizar (+, -, x, /), calcule e exiba o resultado da operação matemática.
# @author ecr34t1v3

num1 = int(input("Informe um número: "))
num2 = int(input("Informe mais um número: "))

print("Informe o tipo de operação matemática a ser feito")
opMath = int(input("1 - Adição, 2 - Subtração, 3 - Multiplicação, 4 - Divisão: "))

match opMath:

    case 1:
        print("Soma dos valores:",num1+num2)
    
    case 2:
        print("Subtração dos valores:",num1-num2)

    case 3:
        print("Multiplicação dos valores:",num1*num2)

    case 4:
        print("Divisão dos valores:",num1/num2)

    case _:
        print("Tipo de operação inválida.")