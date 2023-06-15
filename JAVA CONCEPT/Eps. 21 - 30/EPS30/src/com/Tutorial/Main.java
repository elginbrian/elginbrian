// Eps. 30 Latihan Looping Sederhana
package com.Tutorial;
import java.util.*;

public class Main {
    public static void main(String[] args){

        // Menghitung nilai total deret aritmatika (Sn)
        int a, b, n, x, total;
        Scanner userInput = new Scanner(System.in);

        System.out.print("Masukkan angka awal (a) = ");
        a = userInput.nextInt();
        System.out.print("Masukkan beda (b) = ");
        b = userInput.nextInt();
        System.out.print("Masukkan angka terakhir (n) = ");
        n = userInput.nextInt();

        total = 0;

        while (a <= n){
            x = total;
            total = total + a;
            System.out.println(x + " + " + a + " = "+ total);
            a = a + b;
        }

        System.out.printf("S%d = %d", n, total);
        }
}
