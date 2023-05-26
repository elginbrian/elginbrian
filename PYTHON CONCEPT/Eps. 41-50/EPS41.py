# Eps.41 Copy dan Pop Dictionary
data_dict = {
    'a' : 'alpha',
    'b' : 'beta',
    'g' : 'gamma',
    'd' : 'delta'
}

# Copy
data_dict2 = data_dict.copy()
data_dict3 = data_dict
data_dict['a'] = 'alfa'
print(data_dict2)
print(data_dict3)

# Pop
gamma = data_dict.pop('g')
print(gamma)
print(data_dict)

# Pop item
last = data_dict.popitem()
print(last)
print(data_dict)