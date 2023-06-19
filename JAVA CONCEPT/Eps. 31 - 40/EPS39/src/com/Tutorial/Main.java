// Eps. 39 Overload Method / Fungsi
package com.Tutorial;
public class Main {
    // Overload untuk print beda tipe data
    private static void print(int angkaInt){
        System.out.println("angkaInt: " + angkaInt);
    }
    private static void print(float angkaFloat){
        System.out.println("angkaFloat: " + angkaFloat);
    }    
    private static void print(double angkaDouble){
        System.out.println("angkaDouble: " + angkaDouble);
    }

    // Overload untuk operasi beda tipe data
    private static int sum(int num1, int num2){
        return num1 + num2;
    }
    private static float sum(int num1, float num2){
        return num1 + num2;
    }
    private static float sum(float num1, int num2){
        return num1 + num2;
    }

    // Main
    public static void main(String[] args){
        // Satu nama fungsi, banyak tipe data
        print(2);   
        print(5.3f);
        print(7.4d);

        System.out.println(sum(3,2));
        System.out.println(sum(3.5f,4));
        System.out.println(sum(8,2.1f));
    }
}
