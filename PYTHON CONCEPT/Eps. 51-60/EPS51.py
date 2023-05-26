# Eps.51 **kwargs pada fungsi
# metode normal
def function(name,age,height):
    print(f'name = {name}, age = {age}, height = {height}')
function('Louis',17,175)

# metode kwargs
def function(**kwargs):
    name = kwargs['name']
    age = kwargs['age']
    height = kwargs['height']
    print(f'name = {name}, age = {age}, height = {height}')

function(name='Louis',age=17,height=175)

# kalkulator banyak variabel dengan kwargs
def math(*args, **kwargs):
    output = 0
    if kwargs['option'] == '+':
        for num in args:
            output += num
    elif kwargs['option'] == '-':
        for num in args:
            output -= num
    elif kwargs['option'] == '*':
        output = 1
        for num in args:
            output *= num
    elif kwargs['option'] == '/':
        output = 1
        for num in args:
            output /= num
    else:
        print('ERROR')
    return output

print(math(1,2,3,4,5,option='*'))    
print(math(1,2,3,4,5,option='+'))    
print(math(1,2,3,4,5,option='-'))    
print(math(1,2,3,4,5,option='/'))   