# Eps.26 Continue dan Pass
# Pass
angka = 0
while angka < 4 :
    angka += 1
    if angka == 3 :
        pass
    print(angka)

print("\n")
#continue
angka = 0
while angka < 4 :
    angka += 1
    print(f"aksi 1 : {angka}")
    if angka == 3 :
        print("aksi 3")
        continue
    print("aksi 2")
print("finish")