# Eps. 39 Operasi dictionary
data_dict = {
    'a' : 'alpha',
    'b' : 'beta',
    'g' : 'gamma'
}
# Panjang dictionary
lendict = len(data_dict)
print(f'panjang : {lendict}')

# Mengecek key exist atau tidak
key = 'a'
check = key in data_dict
print(f'apakah ada : {check}')

# Mengakses value dengan get
print(data_dict.get("a"))
print(data_dict.get("f"))
print(data_dict.get("f","data tidak ditemukan"))

# Mengupdate data
data_dict['a'] = 'alfa'
print(data_dict)

# Menambah data
data_dict.update({'d' : 'delta'})
print(data_dict)

# Delete data
del data_dict['b']
print(data_dict)