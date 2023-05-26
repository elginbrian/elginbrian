# Eps. 33 Nested List
data_0 = [1,2]
data_1 = [3,4]
list_biasa = [1,2,3,4]
list_nested = [data_0, data_1]
print(list_biasa)
print(list_nested)
print("\n")

# Contoh penggunaan
peserta_0 = ["Luz",14,"Female"]
peserta_1 = ["Gus",12,"Male"]
peserta_2 = ["Hunter",16,"Male"]

list_peserta = [peserta_0,peserta_1,peserta_2]
print(list_peserta)
print("\n")
for peserta in list_peserta :
    print(f"nama\t: {peserta[0]}")
    print(f"umur\t: {peserta[1]}")
    print(f"gender\t: {peserta[2]}\n")