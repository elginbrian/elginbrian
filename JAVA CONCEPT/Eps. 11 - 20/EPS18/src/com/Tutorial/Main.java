// Eps.18 Pengelompokan Operasi Aritmatika
package com.Tutorial;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Operasi aritmatika dilakukan sesuai dengan aturan pemdas
        int hasil = 5 + 2 * 3;
        System.out.println(hasil);
        
        hasil = (5 + 2) * 3;
        System.out.println(hasil + "\n");

        // Menghitung persamaan kuadrat
        System.out.println("Menghitung persamaan kuadrat");
        int x,y,m,c;
        Scanner inputuser = new Scanner(System.in);

        System.out.print("nilai m = ");
        m = inputuser.nextInt();
        System.out.print("nilai x = ");
        x = inputuser.nextInt();
        System.out.print("nilai c = ");
        c = inputuser.nextInt();

        y = (m * x * x) + c;
        System.out.println("nilai y = " + y);
    }
}
