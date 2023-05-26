# Eps.34 Deep Copy List
# Mengambil data pada nested list
data_0 = [1,2]
data_1 = [3,4]
data_2D = [data_0, data_1]
print(data_2D)
collect = data_2D[0]
collect2 = data_2D[0][1]
print(collect, collect2)

print("\n")

# Copy pada nested list
datacopy = data_2D.copy()
print(f'address original : {hex(id(data_2D))} \naddress copy : {hex(id(datacopy))}')
print(f'address original : {hex(id(data_2D[0]))} \naddress copy : {hex(id(datacopy[0]))}')

data_2D[1][0] = 5
print(data_2D)
print(datacopy)

data_2D.append(6)
print(data_2D)
print(datacopy)

print("\n")
# Deep copy pada nested list
from copy import deepcopy
datacopy = data_2D.copy()
print(f'address original : {hex(id(data_2D))} \naddress copy : {hex(id(datacopy))}')
print(f'address original : {hex(id(data_2D[0]))} \naddress copy : {hex(id(datacopy[0]))}')

data_2D[1][0] = 5
print(data_2D)
print(datacopy)

data_2D.append(6)
print(data_2D)
print(datacopy)