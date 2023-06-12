// Eps. 25 Latihan Kalkulator If Else
package com.Tutorial;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Deklarasi
        Scanner inputUser;
        float a,b,hasil;
        char operator;
        inputUser = new Scanner(System.in);

        // Input
        System.out.print("Masukkan angka pertama = ");
        a = inputUser.nextFloat();
        System.out.print("Masukkan angka kedua = ");
        b = inputUser.nextFloat();
        System.out.print("Masukkan operator (+,-,x,/) = ");
        operator = inputUser.next().charAt(0);

        // Display
        System.out.printf("%f %s %f \n",a,operator,b);

        // If Else
        if (operator == '+'){
            hasil = (a + b);
            System.out.println("Hasil = " + hasil);}
        else if (operator == '-'){
            hasil = (a - b);
            System.out.println("Hasil = " + hasil);}
        else if (operator == 'x'){
            hasil = (a * b);
            System.out.println("Hasil = " + hasil);}
        else if (operator == '/'){
            if (b == 0){
                System.out.println("Angka kedua tidak boleh nol");}
            else{
            hasil = (a / b);
            System.out.println("Hasil = " + hasil);}}
        else{
            System.out.println("Masukkan operator yang sesuai");}

        // End
        System.out.println("End");
    }
}
