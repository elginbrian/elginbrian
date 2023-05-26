# Eps.55 Membuat Module
# import keseluruhan
import paraEPS55 # atau from paraEPS55 import *
hasil = paraEPS55.tambah(1,2,3,4)
print(hasil)
hasil = paraEPS55.kali(1,2,3,4)
print(hasil)

# import sebagian
from paraEPS55 import tambah
hasil = tambah(1,2,3,4)
print(hasil)

# import dengan alias
from paraEPS55 import tambah as add
hasil = add(1,2,3,4)
print(hasil)