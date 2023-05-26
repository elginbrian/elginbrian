# Eps.47 Default Argument Fungsi
# contoh 1
def sayhi(name = "you"):
    print(f"Hello {name}")
sayhi('Louis')
sayhi()

# contoh 2
def sayhi(message, name = "you"):
    print(f"Hello {name}, {message}")
sayhi('Have a nice day','Louis')
sayhi('Good Luck')

# contoh 3
def power(num,power):
    return num ** power
output = power(num=5,power=2)
print(output)

# contoh 4
def function(num1=1,num2=2,num3=3,num4=4):
    return num1 + num2 + num3 + num4
print(function())
print(function(num1=3))
print(function(num1=3,num3=5))
