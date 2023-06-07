// Eps.8 Variable, Assignment, dan Deklarasi
package com.Tutorial;
public class Main{
    public static void main(String[] args){

        // Ini adalah comment
    
        /*
        Ini adalah comment
        multiline
        */

        // contoh assignment
        int x = 10;
        int y = 15;
        System.out.println("Nilai x = " + x);
        System.out.println("Nilai y = " + y);
        System.out.println("x + y = "+ x + y); // akan menghasilkan 1015 bukan 25

        x = 20; // tidak perlu menyebutkan tipe data
        System.out.println("Nilai x sekarang adalah = "+ x);

        // contoh deklarasi
        int b;
        //System.out.println("Nilai b = "+ b); tidak akan bisa dijalankan
        b = 7;
        System.out.println("Nilai b = "+ b); // Baru bisa dijalankan
    }
}