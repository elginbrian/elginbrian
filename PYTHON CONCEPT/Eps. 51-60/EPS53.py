# Eps.53 Global dan Local Scope
# Contoh global
nama_global = "Louis"
# akses global dalam fungsi
def fungsi():
    print(nama_global) # V
fungsi() 
print(nama_global) # V

# akses global dalam loop
for i in range(0,5):
    print(f"{i} - {nama_global}") # V

# akses global dalam percabangan
if True:
    print(nama_global) # V
# global dapat diakses dimanapun


# Contoh lokal
def fungsi():
    nama_local = 'Philipp'
fungsi() # V
# print(nama_local) # X
# lokal hanya dapat diakses didalam indentasi


# penempatan global
nama = "Louis" # V
def sayhi():
    print(f'hello {nama}')
nama = "Louis" # V
sayhi()
# nama = "Louis" # X 


# mengubah variabel global
angka = 0
def ubah(nilai_baru):
    global angka # agar global bisa dimodifikasi dalam fungsi
    angka = nilai_baru
print(f'before {angka}')
ubah(10)
print(f'after {angka}')

# global dalam for
angka_global = 0

for i in range(0,5):
    angka_global += i
    angka_local = 5
print(angka_global)
print(angka_local)

# global dalam if
angka_global = 0
if True:
    angka_global = 10
    angka_local = 5
print(angka_global)
print(angka_local)