# Eps. 27 Break
angka = 0
while angka < 4 :
    angka += 1
    print(f"aksi 1 : {angka}")
    if angka == 3 :
        print("aksi 3")
        break
    print("aksi 2")
print("finish")

print("\n")

dataint = int(input("Hitung sampai? :"))
angka = 0
while True :
    angka += 1
    print(f"count : {angka}")
    if angka == dataint :
        break
print("finish")
