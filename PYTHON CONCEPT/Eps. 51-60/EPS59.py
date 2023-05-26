import tkinter as tk
from tkinter import ttk
from tkinter.messagebox import showinfo

# Initialize Tkinter window
window = tk.Tk()

# Main Window
window.configure(bg="grey")
window.geometry("270x350")
window.resizable(False, True)
window.title('Database Sederhana')

# Frame
header_frame = tk.Frame(window)
header_frame.pack(padx=10, fill="x", expand=True)

frame = tk.Frame(window)
frame.pack(padx=10, fill="x", expand=True)

output_frame = tk.Frame(window)
output_frame.pack(padx=10, fill="x", expand=True)

# Label
HEADER = '''
Selamat Datang!
Silahkan masukkan nama depan 
dan nama belakang anda.
'''
label = ttk.Label(header_frame, text=HEADER)
label.pack(fill='x', expand=True, padx=10, pady=10)

# Entry
# INPUT 1
INPUT1 = tk.StringVar()
label_1 = tk.Label(frame, text='Nama Depan:')  # Label Input 1
label_1.pack(fill="x", expand=True)

entry = ttk.Entry(frame, textvariable=INPUT1)
entry.pack(fill='x', expand=True, padx=10)

# INPUT 2
INPUT2 = tk.StringVar()
label_2 = tk.Label(frame, text='Nama Belakang:')  # Label Input 2
label_2.pack(fill="x", expand=True)

entry = ttk.Entry(frame, textvariable=INPUT2)
entry.pack(fill='x', expand=True, padx=10)

# Button
def click():
    print(INPUT1.get(), INPUT2.get())
    showinfo(title='Information', message='Submission Complete')  # Show information

    # Call the update_database function
    update_database()

button = tk.Button(frame, text='Submit', command=click)
button.pack(fill='x', expand=True, padx=10, pady=15)

# Output Label
label_output = tk.Label(output_frame, text='Data yang dimasukkan akan keluar di sini:')  # Label Input 1
label_output.pack(fill="x", expand=True)

# List to store submitted names
submitted_names = []

# Function to update the database and display the entries
def update_database():
    # Clear previous entries
    for widget in output_frame.winfo_children():
        widget.destroy()

    if INPUT1.get() and INPUT2.get():
        FULLNAME = INPUT1.get() + ' ' + INPUT2.get()
        submitted_names.append(FULLNAME)

        # New output label 
        label_output = tk.Label(output_frame, text='Data yang dimasukkan akan keluar di sini:')  # Label Input 1
        label_output.pack(fill="x", expand=True)
        label_border = tk.Label(output_frame, text='-'*40)
        label_border.pack(fill="x", expand=True)

        # Display submitted names
        for name in submitted_names:
            label_name = tk.Label(output_frame, text=name)
            label_name.pack(fill="x", expand=True)


# Run the Tkinter event loop
window.mainloop()
