# Eps.14 Operator assignment
a = 5
a += 1
a -= 2
a *= 5
a /= 2
print("dapat diartikan a + 1 - 2 * 5 / 2 =",a)

b = 10
b %= 3
b *= 10
b //= 3
print("dapat diartikan b % 3 * 10 // 3 =",b)

c = True
c |= False
c &= False
c ^= True
print("dapat diartikan c | F & F ^ T =",c)

d = 0b0100
d >>= 1
print("dapat diartikan 0100 >> 1 =", format(d,'04b'))