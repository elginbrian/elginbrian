# Eps.42 Multi Keys dan Nesting Dictionary
import datetime
char1 = {
    'name' : 'Luz Noceda',
    'age' : 14,
    'gender' : 'female',
    'queer' : True,
    'born' : datetime.datetime(2006,4,22) 
}

char2 = {
    'name' : 'Willow Park',
    'age' : 14,
    'gender' : 'female',
    'queer' : False,
    'born' : datetime.datetime(2006,5,23) 
}

char3 = {
    'name' : 'Amity Blight',
    'age' : 14,
    'gender' : 'female',
    'queer' : True,
    'born' : datetime.datetime(2006,6,24) 
}

char4 = {
    'name' : 'Augustus',
    'age' : 12,
    'gender' : 'male',
    'queer' : False,
    'born' : datetime.datetime(2008,4,22) 
}

charx = {
    'C1' : char1,
    'C2' : char2,
    'C3' : char3,
    'C4' : char4
}

print(f'{"KEY": <5}{"Name": <17}{"Age": <5}{"gender": <7}{"queer": ^9}{"born": <10}')
for char in charx :
    key = char
    name = charx[key]['name']
    age = charx[key]['age']
    gender = charx[key]['gender']
    queer = charx[key]['queer']
    born = charx[key]['born'].strftime('%x')
    print(f'{key: <5}{name: <17}{age: <5}{gender: <7}{queer: ^9}{born: <10}')