# Eps.30 Manipulasi List
# Mengambil data dari list 
data = ["satu", "dua", "tiga"]
print(data)
data0 = data[0]
print(data0)

# Menghilangkan data
data.remove("tiga")
print(data)

# Mengambil info jumlah data
panjang = len(data)
print(panjang)

# Menambah item pada list
data.insert(1,"setengah")
data.append("tiga")
print(data)

# Menambah list dengan list
data2 = ["lima","enam"]
data.extend(data2)
print(data)

# Merubah data
data[2] = "two"
print(data)

# menghilangkan data paling belakang
data_akhir = data.pop()
print(data)
print(data_akhir)