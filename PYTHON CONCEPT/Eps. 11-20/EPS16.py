# Eps.16 Operasi dan Manipulasi String Part.1
# Menyambung string (concatenate)
firstname = "Sarah"
midname = "Nicole"
lastname = "Robles"
without = firstname + midname + lastname
print(without)
withspace = firstname + " " + midname + " " + lastname
print(withspace)

# menghitung panjang string
panjang = len(withspace)
print(panjang)

# mengecek apakah ada char atau string
n = "N"
status = n in withspace
status2 = n not in withspace
print(status, status2)

# mengulang string
print("wk"*5)

# Indexing
print("index ke-3 ada di :", withspace[3])
print("index ke--2 ada di :", withspace[-2])
print("index 0 s/d 4 :", withspace[0:5])
print("index 0 2 4 6 8 :", withspace[0:9:2])

# item paling kecil atau besar
print("paling kecil :", min(withspace))
print("paling besar :", max(withspace))

# mencari ASCII code 
ascii = ord("b")
print(str(ascii))
data = 117
print(chr(data))

# menghitung jumlah char tertentu
jumlahhuruf_a = withspace.count("a")
print(str(jumlahhuruf_a))