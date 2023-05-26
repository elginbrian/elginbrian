# Eps.9 Latihan perihitungan sederhana
# c ke r, f, dan k
print("\nkonversi temperatur c ke r, f, dan k\n")

celcius = float(input("masukkan celcius :"))
print("suhu dalam celcius adalah :", celcius, "c")

r = 4/5
reamur = r * celcius
print("suhu dalam reamur adalah :", reamur, "r")

f = 9/5
f_kons = 32
fahrenheit = f * celcius + f_kons
print("suhu dalam fahrenheit adalah :", fahrenheit, "f") 

k_kons = 273
kelvin = celcius + k_kons
print("suhu dalam kelvin adalah :", kelvin, "k")