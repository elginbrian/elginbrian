// Eps. 45 Array Multidimensi
package com.Tutorial;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Array 2D dengan assignment
        int[][] array2D = {
            {1,2,3,4},
            {5,6,7,8}
        };

        showArray(array2D);
        showManual(array2D);
        showArray(array2D);
        
        // Array 2D dengan deklarasi
        //                      int[baris][kolom]  
        int[][] array2D_b = new int[3][2];

        showArray(array2D_b);
        showManual(array2D_b);
        showForEach(array2D_b);

        // Array tidak beraturan
        int[][] arrayRagged = {
            {1,2,3,4},
            {4,5},
            {6,7,8}
        };

        showArray(arrayRagged);
        showManual(arrayRagged);
        showForEach(arrayRagged);
    }

    // Looping array
    private static void showArray(int[][] array){
        System.out.println("Looping Normal");
        for (int i = 0; i < array.length; i++){
            System.out.println(Arrays.toString(array[i]));
        }
    }
    
    // Looping array manual
    private static void showManual(int[][] array){
        System.out.println("Looping Manual");
        for(int i = 0; i < array.length; i++){
            System.out.print("[ ");
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + ", ");
            }
            System.out.print("]\n");
        }
    }
    
    // Looping array for each
    private static void showForEach(int[][] array){
        System.out.println("Array for each");
        for (int[] baris : array){
            System.out.print("[ ");
            for (int angka : baris){
                System.out.print(angka + ", ");
            }
            System.out.print("]\n");
        }
    }
}
