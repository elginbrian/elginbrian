# Eps.18 Format String
# contoh format huruf
nama = "marlene"
formatstr = f"hello{nama}"
print(formatstr)

# contoh format angka
angka = 2005.5
formatstr = f"angka = {angka}"
print(formatstr)

# contoh format bool
boolean = True
formatstr = f"bool = {boolean}"
print(formatstr)

# contoh format bilangan bulat
angka = 15
formatstr = f"bilbul = {angka:d}"
print(formatstr)

# contoh format bilangan ribuan
angka = 2000
formatstr = f"ribuan = {angka:,}"
print(formatstr)

# contoh format bilangan desimal
angka = 2005.54321
formatstr = f"desimal = {angka:2f}"
print(formatstr)

# contoh format leading zero
angka = 2005.54321
formatstr = f"desimal = {angka:8.2f}"
print(formatstr)

# contoh menambahkan + atau -
minus = -10
plus = 10
formatmin = f"min = {minus}"
formatplus = f"plus = {plus:+d}"
print(formatmin)
print(formatplus)

# contoh format persen
persen = 0.045
formatstr = F"persen = {persen:%}"
print(formatstr)

# contoh format aritmatika
harga = 10000
jumlah = 5
formatstr = f"harga total = {harga*jumlah}"
print(formatstr)

# contoh format biner octal hex
angka = 255
bin = f"bin = {bin(angka)}"
oct = f"oct = {oct(angka)}"
hex = f"hex = {hex(angka)}"
print(bin)
print(oct)
print(hex)