# Eps.40 Looping Dictionary
data_dict = {
    'a':'alpha',
    'b':'beta',
    'g': 'gamma',
    'd' : 'delta'
}

for i in data_dict:
    print(i)
    
print('\n')
# Using Keys
keys = data_dict.keys()
print(keys)
for keys in data_dict.keys() :
    print(data_dict.get(keys))

print('\n')
# Using values
values = data_dict.values()
print(values)
for values in data_dict.values() :
    print(values)

print('\n')
# Using items
items = data_dict.items()
print(items)
for items in data_dict.items() :
    print(items)

print('\n')
# Mixed
for keys,values in data_dict.items() :
    print(f'keys = {keys} value = {values}')