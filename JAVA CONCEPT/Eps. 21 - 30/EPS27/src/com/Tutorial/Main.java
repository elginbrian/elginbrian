// Eps. 27 While Loop
package com.Tutorial;
public class Main {
    public static void main(String[] args){
        int a = 1;
        boolean kondisi = true;

        System.out.println("Awal Program");

        while (kondisi){
            System.out.println("Perulangan ke-"+ a);
            if (a == 10){
                kondisi = false;}
            a++;
        }

        System.out.println("Akhir Program");
    }
}
