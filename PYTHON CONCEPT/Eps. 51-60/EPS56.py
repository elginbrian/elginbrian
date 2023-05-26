# Eps. 56 membuat package
import time
t_start = time.time()

import Package56.matematika
hasil =  Package56.matematika.kali(2,3)
print(hasil)

t_end = time.time()
print(t_end - t_start)

from Package56 import fisika
hasil = fisika.gaya(10,3)
print(hasil)