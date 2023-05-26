import os
import math

def header():
    os.system('cls')
    print(f"{'PROGRAM MENGHITUNG LUAS BANGUN DATAR':^40}")
    print(f"{'-'*40:^40}") 

def choose():
    option = int(input('''
    Silahkan pilih jenis bangun datar:
    [1] Persegi
    [2] Segitiga
    [3] Lingkaran

    Jawaban:
    '''))
    return option

def cal_square():
    length = int(input("Enter length: "))
    width = int(input("Enter width: "))
    return length * width

def cal_triangle():
    base = int(input("Enter base: "))
    height = int(input("Enter height: "))
    return base * height / 2

def cal_circle():
    radius = int(input("Enter radius: "))
    return math.pi * radius**2

def display(message, value):
    print(f"{message} = {value}")

while True:
    header()
    user_choice = choose()

    # Splitting
    if user_choice == 1:
        square = cal_square()
        display("Luas :", square)
         
    elif user_choice == 2:
        triangle = cal_triangle()
        display("Luas :", triangle)

    elif user_choice == 3:
        circle = cal_circle()
        display("Luas :", circle)

    else:
        print('ERROR')

    # Continuity
    iscontinue = input("apakah ingin lanjut (y/n)?")
    if iscontinue == 'y' or iscontinue == 'Y':
        continue
    elif iscontinue == 'n' or iscontinue == 'N':
        os.system("cls")
        break
    else:
        print('ERROR')
        break