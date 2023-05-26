# Eps.35 Looping List dan Enumerate

# For Loop
list = [4,3,2]
for i in list:
    print(f"angka = {i}")

print('\n')

# For Loop dan Range
list = [4,3,2,5]
panjang = len(list)

for i in range(panjang):
    print(f"angka = {list[i]}")

print('\n')

# While Loop
list = [4,3,2,5]
panjang = len(list)
i = 0
while i < panjang:
    print(f"angka = {list[i]}")
    i += 1

print('\n')

# List Comprehension
list = [4,3,2,5]
[print(f"angka {i}") for i in list]

print('\n')

# List Enumerate
list = [1,2,3,4]
for index,data in enumerate(list):
    print(f"index = {index}, data = {data}")
