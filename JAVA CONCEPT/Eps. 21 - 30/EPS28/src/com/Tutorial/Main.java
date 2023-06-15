// Eps. 28 Do While Loop
package com.Tutorial;
public class Main {
    public static void main(String[] args){
        int a = 0;
        boolean kondisi = true;

        System.out.println("Awal Program");

        do {
            a++;
            System.out.println("Do While ke-" + a);
            if (a == 10){
                kondisi = false;}}
        
        while (kondisi);
        
        System.out.println("Akhir Program");
    }
}
