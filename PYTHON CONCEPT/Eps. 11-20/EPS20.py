# Eps.20 Latihan date and time
# mengenal datetime
import datetime
#hari_ini = datetime.date.today()
#print(hari_ini)

#tanggal = datetime.date(2006,4,22)
#print(tanggal)
#print(f"hari ini : {hari_ini:%A}")
#print(f"hari itu : {tanggal:%A}")

# menghitung umur dari tanggal lahir
#print("\n")
print("="*10, "menghitung umur", "="*10)
print("Silahkan masukkan tanggal, bulan, dan tahun lahir :")
tanggal = int(input("Tanggal \t:"))
bulan = int(input("Bulan \t\t:"))
tahun = int(input("Tahun \t\t:"))
tanggal_lahir = datetime.date(tahun, bulan, tanggal)
print(f"Tanggal lahir anda : {tanggal_lahir}")
print(f"Hari lahir anda : {tanggal_lahir:%A}")
hari_ini = datetime.date.today()
umur = hari_ini - tanggal_lahir
umur_hari = umur.days
umur_tahun = umur_hari // 365
print(f"umur anda adalah : {umur_tahun} tahun")
umur_bulan_sisa = (umur_hari % 365)//30
print(f"umur bulan sisa adalah : {umur_bulan_sisa} bulan")

