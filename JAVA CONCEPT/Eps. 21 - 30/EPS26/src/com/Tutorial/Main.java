// Eps.26 Latihan Kalkulator Switch Case
package com.Tutorial;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        
        // Deklarasi
        Scanner inputUser;
        float a, b, hasil;
        String operator;
        inputUser = new Scanner(System.in);
        
        // Input
        System.out.print("Masukkan angka pertama = ");
        a = inputUser.nextFloat();
        System.out.print("Masukkan angka kedua = ");
        b = inputUser.nextFloat();
        System.out.print("Masukkan operator (+,-,x,/) = ");
        operator = inputUser.next();

        // Display
        System.out.printf("%f %s %f \n", a, operator, b);

        // Switch
        switch (operator) {
            case "+":
                hasil = a + b;
                System.out.println("Hasil = "+ hasil);
                break;
            case "-":
                hasil = a - b;
                System.out.println("Hasil = "+ hasil);
                break;
            case "x":
                hasil = a * b;
                System.out.println("Hasil = "+ hasil);
                break;
            case "/":
                hasil = a / b;
                System.out.println("Hasil = "+ hasil);
                break;
            default :
                System.out.println("Operator tidak ditemukan");}

        // End
        System.out.println("End");
    }
}
