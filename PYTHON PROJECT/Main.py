import os
import CRUD as CRUD
import time

if __name__ == "__main__":
    sistem_operasi = os.name
    match sistem_operasi:
            case "posix": os.system("clear") # clear for Linux and MacOS
            case "nt": os.system("cls") # clear for Windows
    
    print(f"{'SELAMAT DATANG DI PROGRAM':^40}")
    print(f"{'DATABASE PERPUSTAKAAN':^40}")
    print(f"{'='*40:^}")

    # check database aviablity
    CRUD.init_console()

    while True: # main loop
        match sistem_operasi:
            case "posix": os.system("clear") 
            case "nt": os.system("cls") 
            
        print(f"{'SELAMAT DATANG DI PROGRAM':^80}")
        print(f"{'DATABASE PERPUSTAKAAN':^80}")
        print(f"{'='*80:^}")

        print(f"Tindakan apa yang ingin anda lakukan?") #first menu
        print(f"1. Baca Data Buku")
        print(f"2. Buat Data Buku Baru")
        print(f"3. Perbarui Data Buku")
        print(f"4. Hapus Data Buku\n")

        user_option = input("Masukkan pilihan anda [1,2,3,4]\t: ")

        match user_option: # proccessing user input
            case "1" : CRUD.read_console()
            case "2" : CRUD.create_console()
            case "3" : CRUD.update_console()
            case "4" : CRUD.delete_console()
            case "00": break
            case _   : print("Massukkan pilihan yang sesuai.")
             
        print(f"\n{'='*80:^}")

        isdone = input("Apakah anda ingin melanjutkan program? (y/n)\t: ") #continue?
        if isdone.lower() == "n":
            break
        elif isdone.lower() != "y":
            print("Harap masukkan (y/n). Program akan diulang dalam 5 detik")
            time.sleep(5)

    print("\n[May 2023] [Amateur CRUD project with Python by: Elgin Brian]") #credit 
    print("Program Berakhir\n")

        

    
