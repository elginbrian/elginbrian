# Eps.19 String width dan allignment
name = "Luz Noceda"
age = 14
gender = "Female"
orientation = "Bisexual"
datastring = f"name = {name}, \nage = {age}, \ngender = {gender}, \norientation = {orientation}"
print(datastring)

datastring = f"""
name        = {name:>12}
age         = {age:>12}
gender      = {gender:>12}
orientation = {orientation:>12}
"""
print(datastring)