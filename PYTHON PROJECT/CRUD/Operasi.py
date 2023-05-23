from . import Database as db
from . Utility import random_string
import time
import os

def delete(select_data): # delete function
    try:
        with open(db.DB_NAME, 'r') as file:
            counter = 0
            if os.path.exists("data_temp.txt"):  # Check if the temporary file exists
                os.remove("data_temp.txt")  # Delete the temporary file if it exists
            
            with open("data_temp.txt", 'w', encoding="UTF-8"):  # Create an empty temporary file
                while True:
                    content = file.readline()
                    if len(content) == 0:
                        break
                    elif counter == select_data - 1:
                        pass
                    else:
                        with open("data_temp.txt", 'a', encoding="UTF-8") as temp_file:
                            temp_file.write(content)
                    counter += 1
    except:
        print("[FAILED]")
    
    os.remove("data.txt") # remove original file
    os.rename("data_temp.txt",db.DB_NAME) # rename temporary file

def update(select_data,pk,date_add,judul,penulis,tahun): # update function 
    data = db.TEMPLATE.copy()

    data["pk"]       = pk
    data["date_add"] = date_add
    data["judul"]    = judul + db.TEMPLATE["judul"][len(judul):]
    data["penulis"]  = penulis + db.TEMPLATE["penulis"][len(penulis):]
    data["tahun"]    = tahun

    data_str = f"{data['pk']},{data['date_add']},{data['judul']},{data['penulis']},{data['tahun']}\n"

    data_length = len(data_str)

    try:
        with open(db.DB_NAME, 'r+', encoding="utf-8") as file: # replace old data with new data
            file.seek(data_length*(select_data-1))
            file.write(data_str)
    except:
        print("[FAILED]")

def create_first_data(): # create function
    judul   = input("Judul\t: ")
    penulis = input("Penulis\t: ")
    tahun   = input("Tahun\t: ")

    data = db.TEMPLATE.copy()

    data["pk"]       = random_string(6)
    data["date_add"] = time.strftime("%Y-%m-%d-%H-%M-%Sz", time.gmtime())
    data["judul"]    = judul + db.TEMPLATE["judul"][len(judul):]
    data["penulis"]  = penulis + db.TEMPLATE["penulis"][len(penulis):]
    data["tahun"]    = tahun

    data_str = f"{data['pk']},{data['date_add']},{data['judul']},{data['penulis']},{data['tahun']}\n"
    
    try:
        with open(db.DB_NAME, 'w', encoding="utf-8") as file: # write new data
            file.write(data_str)
    except:
        print("[FAILED]")

def read(**kwargs): # read function
    try:
        with open(db.DB_NAME, 'r', encoding="utf-8") as file:
            content = file.readlines()
            amount = len(content)

            if "index" in kwargs: # matching user input with avalaible index
                real_index = kwargs["index"]-1
                if real_index < 0 or real_index > amount:
                    return False
                else:
                    return content[real_index]
            else:
                return content
    except:
        return "[FAILED] Index tidak ditemukan."
