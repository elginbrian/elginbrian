# Eps.17 Operasi dan manipulasi string (part 2)
# upper
salam = "bro!"
salam2 = salam.upper()
print(salam2)

# lower
salam3 = salam2.lower()
print(salam3)

#isX
apakah_lower = salam.islower()
print(str(apakah_lower))

alpha = "alpha"
alnum = "alnum1"
decimal = "123"
space = " "
title = "Lorem Ipsum"

a = alpha.isalpha()
b = alnum.isalnum()
c = decimal.isdecimal()
d = space.isspace()
e = title.istitle()
print(a,b,c,d,e)

# startswith endswith
cekstart = "Lorem Ipsum".startswith("Lorem")
cekend = "Lorem Ipsum".endswith("Ipsum")
print(cekstart, cekend)

# join split
pisah = ['one''two''three']
gabung = ' '.join(pisah)
print(pisah)
print(gabung)

gabung = "its impossible"
print(gabung.split("im"))

# rjust ljust center
kanan = "kanan".rjust(10)
print("'"+kanan+"'")
kiri = "kiri".ljust(10)
print("'"+kiri+"'")
tengah = "tengah".center(10,"-")
print("'"+tengah+"'")

# strip
tengah = "tengah".strip("-")
print("'"+tengah+"'")
kanan = "kanan".strip(" ")
print("'"+kanan+"'")
