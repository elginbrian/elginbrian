# Eps.53 Lambda Function dan Anonymous
# Bentuk normal
def f_kuadrat(angka):
    return angka ** 2
print(f_kuadrat(3))

# bentuk lambda function
kuadrat = lambda angka: angka ** 2
print(kuadrat(3))

# bentuk lambda 2 parameter
pangkat = lambda num,pow: num ** pow
print(pangkat(3,2))

# sorting list dengan lambda
data_list = ['orange','apple','melon']
data_list.sort(key= lambda nama: len(nama))
print(data_list)

# filter list dengan lambda
data_list = [1,2,3,4,5,6,7,8,9,10]
less5_list = list(filter(lambda x: x<5, data_list))
print(less5_list)

genap = list(filter(lambda x: (x % 2 == 0), data_list))
print(genap)

ganjil = list(filter(lambda x: (x % 2 != 0), data_list))
print(ganjil)