# Eps.64 Read External File
# metode konvensional
file = open("paraEPS64.txt", mode="r")
print(file.read())
print(f"readable? = {file.readable()}")
print(f"writable? = {file.writable()}")

file.close() # reset


# membaca per baris
file = open("paraEPS64.txt", mode="r")
print(file.readline())
print(file.readline())

file.close() # reset


# membaca semua baris sebagai list
file = open("paraEPS64.txt", mode="r")
print(file.readlines())

file.close() # reset

file = open("paraEPS64.txt", mode="r")
print(file.readlines(),end=" ")


# mengecek apakah file sudah di close
print(f"closed? = {file.closed}")
file.close()
print(f"closed? = {file.closed}")


# dengan with (tidak perlu menggunakan close)
with open("paraEPS64.txt", mode="r") as file:
    content = file.readline()
    print(content, end=" ")