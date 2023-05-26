# Eps.29 List
# kumpulan angka
data_angka = [1,5,2,3]
print(data_angka)

# kumpulan string 
data_string = ["satu", "dua", "tiga"]

# kumpulan boolean
data_bool = [True, False, True]
print(data_bool)

# data campuran
data_mix = [1, "dua", True]
print(data_mix)

# list dengan range
data_range = range(0,5)
data_list = list(data_range)
print(data_list)

# list dengan for loop
data_list = [i for i in range(0,5)]
print(data_list)

# operasi list dalam for loop
data_list = [i**2 for i in range(0,5)]
print(data_list)

# list dengan for dan if
data_list = [i for i in range(1,7) if i !=5]
print(data_list)
data_list = [i for i in range(1,7) if i % 2 == 0]
print(data_list)