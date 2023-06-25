// Eps. 41 Looping Array For Each
package com.Tutorial;
public class Main {
    public static void main(String[] args){
        int[] arrayInt = {11,12,13,14,15};

        // Looping Standard
        System.out.println("Looping Standard");
        for (int i = 0; i < 5; i++) {
            System.out.printf("Index ke %d = %d\n", i, arrayInt[i]);
        }
        
        // Looping Properties
        System.out.println("Looping Properties");
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.printf("Index ke %d = %d\n", i, arrayInt[i]);
        }

        // Looping for each
        System.out.println("Looping for each");
        for (int angka : arrayInt){
            System.out.println("Angka sekarang = "+ angka);
        }

    }
}
