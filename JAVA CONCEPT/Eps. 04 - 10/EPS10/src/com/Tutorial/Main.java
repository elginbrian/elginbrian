// Eps. 10 Operator Aritmatika
package com.Tutorial;
public class Main {
    public static void main(String[] args) {
    int num1 = 5;
    int num2 = 7;
    int num3 = 3;
    
    float num4 = 9f;
    float num5 = 4f;

    float hasil_float;
    int hasil;

    // Penjumlahan
    hasil = num1 + num2;
    System.out.println(num1 + "+" + num2 + "=" + hasil);
    System.out.printf("%d + %d = %d \n", num1, num2, hasil); // Alternatif

    // Pengurangan
    hasil = num2 - num3;
    System.out.println(num2 + "-" + num3 + "=" + hasil);
    System.out.printf("%d - %d = % d \n", num2, num3, hasil);

    // Perkalian
    hasil = num1 * num3;
    System.out.println(num1 + "x" + num3 + "=" + hasil);
    System.out.printf("%d x %d = %d \n", num1, num3, hasil);

    // Pembagian (Integer)
    hasil = num3 / num1;
    System.out.println(num3 + "/" + num1 + "=" + hasil); // hasil tidak bisa koma karena integer
    
    // Pembagian (Float)
    hasil_float = num4 / num5;
    System.out.println(num4 + "/" + num5 + "=" + hasil_float); // hasil bisa koma karena float

    // Modulus (Sisa pembagian)
    hasil = num2 % num3;
    System.out.println(num2 + "%" + num3 + "=" + hasil);
    System.out.printf("%d %% %d = %d \n", num2, num3, hasil);
    }
}
