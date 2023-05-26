# Eps.50 *args pada fungsi
# metode normal
def function(name,age,height):
    print(f'name = {name}, age = {age}, height = {height}')
function('Louis',17,175)

# metode list
def function(data_list):
    data = data_list.copy()
    name = data[0]
    age = data[1]
    height = data[2]
    print(f'name = {name}, age = {age}, height = {height}')
function(['Louis',17,175])

# metode args
def function(*args):
    name = args[0]
    age = args[1]
    height = args[2]
    print(f'name = {name}, age = {age}, height = {height}')
function('Louis',17,175)

# mengolah data yang tidak ditentukan banyaknya
def tambah(*data):
    output = 0
    for angka in data:
        output += angka
    return output

print(tambah(1,2,3,4,5,6,7,8,9,10))
print(tambah(2,2,4))
print(tambah(4,8,2,9))
