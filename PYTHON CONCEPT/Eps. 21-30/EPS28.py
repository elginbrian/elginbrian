# Eps. 28 Latihan Perulangan
# Segitiga dengan For
sisi = 4
count = 1
for i in range(sisi) :
    print("*"*count)
    count += 1

print("\n")
# Segitiga dengan While
sisi = 4
count = 1
while True :
    print("*"*count)
    count += 1
    if count > sisi :
        break

print("\n")
# hanya genap
sisi = 6
count = 1
while True :
    if count % 2 == 1:
        count += 1
        continue
    print("*"*count)
    count += 1
    if count > sisi :
        break
  
print("\n")
# hanya ganjil
sisi = 6
count = 1
while True :
    if count % 2 == 0:
        count += 1
        continue
    print("*"*count)
    count += 1
    if count > sisi :
        break

print("\n")
# segitiga sama sisi
sisi = 6
count = 1
spasi = int(sisi//2)
while True :
    if count % 2 == 0:
        count += 1
        continue
    print(" "*spasi,"*"*count)
    count += 1
    spasi -= 1
    if count > sisi :
        break