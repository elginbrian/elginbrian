# Eps. 32 Copy List

# Menduplikat List
a = ["alpha", "beta", "gamma"]
print(a)
b = a
print(b)
a[0] = "alfa"
b.reverse()
print(a)
print(b)
print(f"address a = {hex(id(a))}")
print(f"address b = {hex(id(b))}")

print("\n")
# Menduplikat List tanpa references
a = ["alpha", "beta", "gamma"]
print(a)
b = a.copy()
print(b)
a[0] = "alfa"
b.reverse()
print(a)
print(b)
print(f"address a = {hex(id(a))}")
print(f"address b = {hex(id(b))}")