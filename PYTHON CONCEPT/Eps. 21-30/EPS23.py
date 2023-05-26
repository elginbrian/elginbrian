# Eps.23 Latihan Percabangan
print("\n")
print("="*5,"Kalkulator","="*5)
angka1 = float(input("Masukkan angka pertama :"))
operator = (input("Masukkan Operator (+,-,*,/) :"))
angka2 = float(input("Masukkan angka kedua :"))
if operator == "+" :
    hasil = angka1 + angka2
    print(f"Hasil : {hasil}")
elif operator == "-" :
    hasil = angka1 - angka2
    print(f"Hasil : {hasil}")
elif operator == "*" or operator == "x" :
    hasil = angka1 * angka2
    print(f"Hasil : {hasil}")
elif operator == "/" :
    hasil = angka1 / angka2
    print(f"Hasil : {hasil}")
else :
    print("Error")