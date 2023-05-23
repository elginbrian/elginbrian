from . import Operasi as ops  
import time 

DB_NAME = "data.txt"

TEMPLATE = { # template for the details of the information
    "pk"       : "xxxxxx",
    "date_add" : "yyyy-mm-dd",
    "judul"    : 50*" ",
    "penulis"  : 50*" ",
    "tahun"    : "yyyy"
}

def init_console():
    print("Mengecek database")
    try:
        with open(DB_NAME,"r") as file: 
            print("Database Tersedia, init done!") # if data.txt already exists
    except:
        print("Database belum tersedia, init begin...\n") # if data.txt doesnt exists
        ops.create_first_data()
        print("Program akan dilanjutkan dalam 5 detik")
        time.sleep(5) 
        