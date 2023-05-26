# Eps.66 Exception, Error, Try and Except
# contoh 1
inputuser = int(input("Masukkan angka:"))
hasil = 0
try:
    hasil = 10/inputuser
except:
    print("input tidak boleh nol")
print(hasil)
print("akhir dari program 1")


# contoh 2
while True:
    angka = int(input("Masukkan angka :"))
    try:
        hasil = 10/angka
        print(hasil)
        isdone = input("Mau melanjutkan? (y/n) :")
        if isdone == "n" or isdone == "N":
            break
    except:
        print("input tidak boleh nol")
print("akhir dari program 2")


# contoh 3
while True:
    try:
        with open("paraEPS66.txt","r") as file:
            print(file.read())
    except:
        print("file tidak ditemukan, membuat file baru")
        with open("paraEPS66.txt","w") as file:
            file.write("file baru")
    break
print("akhir dari program 3")


# contoh 4
from numbers import Number
def tambah(a,b):
    if not isinstance(a,Number) or not isinstance(b,Number):
        raise ValueError("Input harus angka")
    return a+b
print(tambah(5,5))
print("akhir dari program 4")


# contoh 5 (mengeprint error messege)
angka = 0
try:
    hasil = 10/angka
except Exception as error_messege:
    print(f"Error: {error_messege}")