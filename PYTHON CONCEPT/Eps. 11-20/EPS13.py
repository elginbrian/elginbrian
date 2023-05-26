# Eps.13 Operator Bitwise
a = 9
b = 5

# or |
print("or")
c = a | b
print(a, "biner :" ,format(a,'08b'))
print(b, "biner :" ,format(b,'08b'))
print("------------------------ (|)")
print(c, "biner :" ,format(c,'08b'))

print("\n")

# and &
print("and")
c = a & b
print(a, "biner :" ,format(a,'08b'))
print(b, "biner :" ,format(b,'08b'))
print("------------------------ (&)")
print(c, "biner :" ,format(c,'08b'))

print("\n")

# xor ^
print("xor")
c = a ^ b
print(a, "biner :" ,format(a,'08b'))
print(b, "biner :" ,format(b,'08b'))
print("------------------------ (&)")
print(c, "biner :" ,format(c,'08b'))

print("\n")

# not ~
print("not")
c = ~a
print(a, "biner :" ,format(a,'08b'))
print("------------------------ (~)")
print(c, "biner :" ,format(c,'08b'))

print("\n")

# shifting right >>
print("shift right")
c = a >> 1
print(a, "biner :" ,format(a,'08b'))
print("------------------------ (>>)")
print(c, "biner :" ,format(c,'08b'))

print("\n")

# shifting left <<
print("shift left")
c = a << 1
print(a, "biner :" ,format(a,'08b'))
print("------------------------ (<<)")
print(c, "biner :" ,format(c,'08b'))