// Eps.29 For Loop
package com.Tutorial;
public class Main {
    public static void main(String[] args){

//      for (inisialisasi; kondisi; step nilai){
//           aksi;}    

        System.out.println("Awal Program");

        // Increment
        System.out.println("Increment");
        for (int a = 1; a <= 10; a++){
            System.out.println("Nilai a = "+ a);}

        // Decrement
        System.out.println("Decrement");
        for (int a = 10; a >= 1; a--){
            System.out.println("Nilai a = "+ a);}

        // Inisialisasi di luar loop
        System.out.println("Inisialisasi di luar loop");
        int a = 1;
        for(; a <= 10; a++){
            System.out.println("Nilai a = "+ a);}
            
        System.out.println("Akhir Program");
    }
}
