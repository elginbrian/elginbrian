# Eps.65 write external file
# mode write (menimpa)
with open("paraEPS65.txt","w",encoding="utf-8") as file:
    file.write("halo")
with open("paraEPS65.txt","w",encoding="utf-8") as file:
    file.write("hola \n")

# mode append (tidak menimpa)
with open("paraEPS65.txt","a",encoding="utf-8") as file:
    file.write("baris-1 \n")
with open("paraEPS65.txt","a",encoding="utf-8") as file:
    file.write("baris-2 \n")

# mode r+ (menimpa, tapi bisa di read)
with open("paraEPS65.txt","r+",encoding="utf-8") as file:
    file.write("baris-1 \n")
with open("paraEPS65.txt","r+",encoding="utf-8") as file:
    data = file.read()
    print(data)
