#Eps.12 Latihan komparasi dan logika

# +++++ 3 ----- 10 +++++
input1 = float(input("masukkan angka yang bernilai x<3, x>10 :"))
print("\n")

# memeriksa daerah <3
kurang_dari_3 = (input1 < 3) 

# memeriksa daerah >10
lebih_dari_10 = (input1 > 10)

# memeriksa jika termasuk diantara <3 atau >10
nilai_true1 = kurang_dari_3 or lebih_dari_10
print("angka :", input1, "bernilai <3 atau >10 :", nilai_true1)

# ----- 3 +++++ -----
input2 = float(input("masukkan angka yang bernilai 3<x<10 :"))
print("\n")

# memeriksa daerah >3
lebih_dari_3 = (input2 > 3) 

# memeriksa daerah >10
kurang_dari_10 = (input2 < 10)

# memeriksa jika termasuk diantara 3<x<10
nilai_true2 = kurang_dari_10 and lebih_dari_3
print("angka :", input2, "bernilai 3<x<10 :", nilai_true2)