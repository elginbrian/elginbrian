# Fungsi dengan argument

def function(name):
    print(f'welcome {name}')
function('Elgin')

def tambah(angka1,angka2):
    hasil = angka1 + angka2
    print(hasil)
tambah(1,3)

def sayhi(name):
    list = name.copy()
    for data in list:
        print(f'hello {data}')
list = ['lala','lili','lulu']
sayhi(list)