# Eps. 36 Latihan List
# Membuat database sederhana:
listbuku = []
while True:
    print('='*5,'MASUKKAN DATA BUKU','='*5)
    judul = input('Masukkan judul\t\t: ')
    penulis = input('Masukkan penulis\t: ')
    tahun = input('Masukkan tahun\t\t: ')

    buku = [judul,penulis,tahun]
    listbuku.append(buku)
    
    print("="*30)
    print("\n\n")
    
    for index,buku in enumerate(listbuku):
        print(f'{index+1} | {buku[0]} | {buku[1]} | {buku[2]}')

    print("\n")
    print("="*30)
    continunity = input("Lanjut Mengisi (Y/N)? ")

    if continunity == 'Y' or continunity == 'y':
        continue
    elif continunity == 'N' or continunity == 'n' :
        break
    else :
        break

print('='*6, 'PROGRAM SELESAI', '='*6)


