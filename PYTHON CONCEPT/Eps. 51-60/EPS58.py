# Eps.58 menggunakan standart library 
# datetime
import datetime
output = datetime.datetime.now()
print(f"date time now = {output}")
print(f"year = {output.year}")
print(f"day = {output.strftime('%A')}")

# counter
from collections import Counter
data = ['a','b','d','a','a','b','a']
datacount = Counter(data)
print(f'data count = {datacount}')
print(f" data a = {datacount['b']}")
print(f"data b = {datacount['a']}")

# io
import io
file = io.open('paraEPS58.txt','r')
print(file.read())