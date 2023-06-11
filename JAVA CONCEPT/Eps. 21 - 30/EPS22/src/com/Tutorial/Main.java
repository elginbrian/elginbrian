// Eps.22 Nested If
package com.Tutorial;
public class Main {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        System.out.println("Ini adalah awal dari program");

        if (a == 2){
            if (b == 5){
                System.out.println("Ini kondisi a = 2, b = 5");}
            else{
                System.out.println("Ini kondisi a = 2, b != 5");}}

        else{
            System.out.println("Ini kondisi a != 2, b != 5");}

        System.out.println("Akhir dari program");
    }
}
