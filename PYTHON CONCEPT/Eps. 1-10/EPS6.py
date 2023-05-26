# Eps.6 casting tipe data

#data int to float, str, bool
print("===INT===")
data_int = 9
print("data :", data_int, "type :", type(data_int))

data_float = float(data_int)
print("data :", data_float, "type :", type(data_float))

data_string = str(data_int)
print("data :", data_string, "type :", type(data_string))

data_bool = bool(data_int)
print("data :", data_bool, "type :", type(data_bool))


#data float to int, str, bool
print("===FLOAT===")
data_float = 9.3
print("data :", data_float, "type :", type(data_float))

data_int = int(data_float)
print("data :", data_int, "type :", type(data_int))

data_string = str(data_float)
print("data :", data_string, "type :", type(data_string))

data_bool = bool(data_float)
print("data :", data_bool, "type :", type(data_bool))


#data bool to int, float, str
print("===BOOL===")
data_bool = True
print("data :", data_bool, "type :", type(data_bool))

data_int = int(data_bool)
print("data :", data_int, "type :", type(data_int))

data_float = float(data_bool)
print("data :", data_float, "type :", type(data_float))

data_string = str(data_bool)
print("data :", data_string, "type :", type(data_string))


#data string to int, float, bool
print("===STRING===")
data_string = "0"
print("data :", data_string, "type :", type(data_string))

data_int = int(data_string)
print("data :", data_int, "type :", type(data_int))

data_float = float(data_string)
print("data :", data_float, "type :", type(data_float))

data_bool = str(data_string)
print("data :", data_bool, "type :", type(data_bool))
