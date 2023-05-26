import datetime
import os
import string
import random

# Make The Template
datatemplate = {
    'name' : 'name',
    'id' : '0000000',
    'age' : 0,
    'born' : datetime.datetime(1111,1,11)
}

database = {} # Make The Empty Dictionary

# Looping
while True :
    os.system('cls')
    print(f"{'WELCOME TO SUBMISSIONS' : ^40}")
    print('-'*40)

    data = dict.fromkeys(datatemplate.keys()) # Use The Template to Store Incoming Input

    data['name'] = input("Name\t\t: ")
    data['id'] = input("ID\t\t: ")
    data['age'] = int(input("Age\t\t: "))

    yb = int(input("Year Born\t: "))
    mb = int(input("Month Born\t: "))
    db = int(input("Day Born\t: "))

    data['born'] = datetime.datetime(yb,mb,db)
    print('-'*40)
    print('\n')

    print('-'*55)
    print(f"{'key':<9}{'name':<20}{'id':<10}{'age':<8}{'born':<10}") # Table Header

    key = ''.join((random.choice(string.ascii_uppercase) for i in range(6))) # Assign Random Key for Each Cycle
    database.update({key : data})

    for data in database :
        key = data
        name = database[key]['name']
        id = database[key]['id']
        age = database[key]['age']
        born = database[key]['born'].strftime('%x')
        print(f'{key:<9}{name:<20}{id:<10}{age:<8}{born:<10}') # Arrange Incoming Input to Table
    
    print('\n')
    isdone = input("Want to continue? (y/n): ") # Continue or not
    if isdone == 'n' or isdone == 'N' :
        break
    elif isdone == 'y' or isdone == 'Y' :
        continue
    else :
        break

print("END OF THE PROGRAM")
