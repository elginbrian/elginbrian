// Eps. 40 Pengenalan Array
package com.Tutorial;
import java.util.Arrays;
public class Main {
    public static void main(String[] args){
        // Assignment
        // tipedata [] nama = {komponen array};
        System.out.println("Assignment Array");

        //        Index =  0 1 2 3
        int [] arrayInt = {2,5,7,3};
        arrayInt[0] = 8;

        System.out.println(arrayInt[0]);
        System.out.println(arrayInt[1]);
        System.out.println(arrayInt[2]);
        System.out.println(arrayInt[3]);

        // Deklarasi
        System.out.println("Deklarasi Array");
        float[] arrayFloat = new float[4];
        arrayFloat[2] = 6.0f;

        System.out.println(arrayFloat[0]);
        System.out.println(arrayFloat[1]);
        System.out.println(arrayFloat[2]);
        System.out.println(arrayFloat[3]);

        // Konversi array ke string
        System.out.println("Konversi array ke string");
        System.out.println(Arrays.toString(arrayInt));
        System.out.println(Arrays.toString(arrayFloat));
        }
}
