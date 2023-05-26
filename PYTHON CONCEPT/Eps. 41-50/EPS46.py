# Eps.46 Fungsi Dengan Return
def kuadrat(input):
    output = input**2
    return output
y = kuadrat(3)
print(y)
print(kuadrat(3))

z = 10 + kuadrat(3)
print(z)

# bentuk lebih ringkas
def kuadrat(input):
    return input**2
y = kuadrat(3)
print(y)

# fungsi dengan banyak return
def operation(num1,num2):
    add = num1 + num2
    subs = num1 - num2
    mult = num1 * num2
    div = num1 / num2
    return add, subs, mult, div
k,l,m,n = operation(9,5)
print(k,l,m,n)

