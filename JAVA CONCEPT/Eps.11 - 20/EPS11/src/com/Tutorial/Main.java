// Eps.11 Konversi Tipe Data
package com.Tutorial;
public class Main {
    public static void main(String[] args) {
        // Misal
        byte b = 100; //8 bit
        System.out.println("Nilai byte = "+ b);

        // Memperluas ke tipe data yang lebih besar
        short s = b; //16 bit
        System.out.println("Nilai short = "+ s);

        int i = s; //32 bit
        System.out.println("Nilai int = "+ i);

        long L = i; //64 bit
        System.out.println("Nilai long = "+ L);



        // Misal
        L = 99999;
        System.out.println("Nilai long = "+ L);

        // Memperkecil tipe data
        int ii = (int)L;
        System.out.println("Nilai int = "+ ii);

        short ss = (short)ii;
        System.out.println("Nilai short = "+ ss); // Angka akan berubah karena melebihi max value
        System.out.println("Max short = "+ Short.MAX_VALUE); 

        byte bb = (byte)ss;
        System.out.println("Nilai byte = "+ bb); // Angka akan berubah karena melebihi max value
        System.out.println("Max byte = "+ Byte.MAX_VALUE);



        // Casting pembagian
        int num1 = 10;
        int num2 = 4;
        float num3 = 4;

        int hasil = num1 / num2; // menghasilkan integer
        float hasil2 = num1 / num2; // menghasilkan float X.000
        float hasil3 = num1 / num3; // Jika salah satu variabel adalah float maka hasil akan menjadi float
        float hasil4 = (float) num1 / num2; // jika kedua variabel = int namun ingin hasil = float

        System.out.println(hasil);
        System.out.println(hasil2);
        System.out.println(hasil3);
        System.out.println(hasil4);
    }
}
