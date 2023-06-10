// Eps.19 Latihan Operasi Logika
package com.Tutorial;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // Scanner
        Scanner input = new Scanner(System.in);

        // Program sederhana untuk menebak angka
        int nilaiBenar = 6;
        int nilaiTebakan;
        boolean statusTebakan;
        
        System.out.print("Masukkan nilai tebakan anda = ");
        nilaiTebakan = input.nextInt();
        System.out.println("Nilai tebakan anda adalah "+ nilaiTebakan);
        statusTebakan = (nilaiBenar == nilaiTebakan);
        System.out.println("Tebakan anda adalah "+ statusTebakan + "\n");

        // Menebak rentang angka
        System.out.print("Menebak rentang angka 4 s/d 9 = ");
        nilaiTebakan = input.nextInt();
        System.out.println("Nilai rentang anda adalah "+ nilaiTebakan);
        statusTebakan = (nilaiTebakan >= 4) && (nilaiTebakan <= 9);
        System.out.println("Rentang anda adalah "+ statusTebakan + "\n");
        
    }
}
