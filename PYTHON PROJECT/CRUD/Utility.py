import random
import string

def random_string(panjang:int) -> str:
    output = ''.join((random.choice(string.ascii_letters)) for i in range(panjang))
    return output