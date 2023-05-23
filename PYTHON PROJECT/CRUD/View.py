from . import Operasi as ops
from . import Database as db
from . Utility import random_string
import time
import pprint

def read_console(): # read interface
    data_file = ops.read()

    index = "No"
    judul = "Judul"
    penulis = "Penulis"
    tahun = "Tahun"

    print(f"\n{'DATA BUKU TERSIMPAN':^80}")
    print("="*80)
    print(f"{index:4}  | {judul:30} | {penulis:25}   | {tahun:5}")
    print("-"*80)
    
    for index,data in enumerate(data_file):
        data_break = data.split(",")
        pk         = data_break[0]
        date_add   = data_break[1]
        judul      = data_break[2]
        penulis    = data_break[3]
        tahun      = data_break[4]
        print(f"{index+1:4}  | {judul:.30} | {penulis:.25}   | {tahun:5}", end="")

def create_console(): # create interface
    print(f"\n{'MEMBUAT DATA BUKU BARU':^80}")
    print("="*80)
    
    judul   = input("Judul\t: ")
    penulis = input("Penulis\t: ")
    while True:
        try:
            tahun   = int(input("Tahun\t: "))
            if len(str(tahun)) <= 4:
                break
            else:
                print("Tahun harus tidak boleh >4 angka, Program akan dilanjutkan dalam 5 detik.")
                time.sleep(5)
        except:
            print("Tahun harus angka (yyyy), Program akan dilanjutkan dalam 5 detik.")
            time.sleep(5)

    data = db.TEMPLATE.copy()

    data["pk"]       = random_string(6)
    data["date_add"] = time.strftime("%Y-%m-%d-%H-%M-%Sz", time.gmtime())
    data["judul"]    = judul + db.TEMPLATE["judul"][len(judul):]
    data["penulis"]  = penulis + db.TEMPLATE["penulis"][len(penulis):]
    data["tahun"]    = tahun

    data_str = f"{data['pk']},{data['date_add']},{data['judul']},{data['penulis']},{data['tahun']}\n"

    try:
        with open(db.DB_NAME, 'a', encoding="utf-8") as file:
            file.write(data_str)
    except:
        print("FAILED")

def update_console(): # update interface
    read_console()

    print("-"*80)
    print(f"\n\n{'PERBARUI DATA BUKU':^80}")
    print("="*80)

    while True:
        select_data = int(input("Buku nomor berapa yang ingin anda update\t: "))
        data_buku = ops.read(index=select_data)

        if data_buku:
            break
        elif select_data == 00:
            return print("Aksi dibatalkan.")
        else:
            print("Index tidak ditemukan.")

    data_break = data_buku.split(',')
    pk       = data_break[0]
    date_add = data_break[1]
    judul    = data_break[2]
    penulis  = data_break[3]
    tahun    = data_break[4][:-1]
    
    while True:
        print(f"\nInformasi apa yang ingin anda ubah?")
        print(f"1. Judul\t: {judul:.50}")
        print(f"2. Penulis\t: {penulis:.50}")
        print(f"3. Tahun\t: {tahun:.4}\n")

        user_option = input("Masukkan pilihan anda [1,2,3]\t: ")

        match user_option: # proccessing user input
            case "1" : judul   = input("Masukkan judul baru\t\t: ")
            case "2" : penulis = input("Masukkan penulis baru\t\t: ") 
            case "3" :
                while True:
                    try:
                        tahun   = int(input("Masukkan tahun terbit baru\t: "))
                        if len(str(tahun)) <= 4:
                            break
                        else:
                            print("Tahun harus tidak boleh >4 angka, Program akan dilanjutkan dalam 5 detik.")
                            time.sleep(5)
                    except:
                        print("Tahun harus angka (yyyy), Program akan dilanjutkan dalam 5 detik.")
                        time.sleep(5)

            case _: print("Massukkan pilihan yang sesuai.")

        isdone = input("Apakah anda ingin melanjutkan editing? (y/n)\t: ") #continue?
        if isdone.lower() == "n":
            break
        elif isdone.lower() != "y":
            print("Harap masukkan (y/n). Program akan diulang dalam 5 detik")
            time.sleep(5)

    ops.update(select_data,pk,date_add,judul,penulis,tahun)

def delete_console(): # delete interface
    read_console()

    print("-"*80)  
    print(f"\n\n{'HAPUS DATA BUKU':^80}")
    print("="*80)

    while True:
        select_data = int(input("Buku nomor berapa yang ingin anda hapus\t: "))
        data_buku = ops.read(index=select_data)

        if data_buku:
            break
        elif select_data == 00:
            return print("Aksi dibatalkan.")
        else:
            print("Index tidak ditemukan.") 

    data_break = data_buku.split(',')
    pk       = data_break[0]
    date_add = data_break[1]
    judul    = data_break[2]
    penulis  = data_break[3]
    tahun    = data_break[4][:-1]

    print(f"\n\tJudul\t: {judul:.30}")
    print(f"\tPenulis\t: {penulis:.25}")
    print(f"\tTahun\t: {tahun:.5}\n")

    print(f"Apakah anda yakin ingin menghapus buku nomor {select_data}?")
    confirm = input("Masukkan pilihan anda (y/n)\t: ")

    while True:
        if confirm.lower() == "n":
            break
        elif confirm.lower() == "y":
            ops.delete(select_data)
            print("Buku berhasil dihapus.")
            break
        else:
            print("Harap masukkan (y/n). Program akan diulang dalam 5 detik")
            time.sleep(5)

    
    
    