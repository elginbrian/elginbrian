// Eps. 46 Array Multidimensi Lebih Dalam
package com.Tutorial;
import java.util.Arrays;
public class Main {
    public static void main(String[] args){
        int[][] array2D =  {
            {1,2,3},
            {4,5,6},
        };

        System.out.println(Arrays.deepToString(array2D));
        System.out.println("Address utama = " + array2D); 
        System.out.println("Address per-komponen = "+ Arrays.toString(array2D)); 
        System.out.println("Address 123 = " + (array2D[0]));
        System.out.println("Address 456 = " + (array2D[1]));

        System.out.print("\n");

        // menggabungkan array 1D menjadi 2D
        int[] arrayA = {10,11,12};
        int[] arrayB = {13,14,15};

        int[][] arrayC = {
            arrayA,
            arrayB
        };
        
        System.out.println(Arrays.deepToString(arrayC));
        System.out.println("Address utama = " + arrayC); 
        System.out.println("Address per-komponen = "+ Arrays.toString(arrayC)); 
        System.out.println("Address 123 = " + (arrayC[0]));
        System.out.println("Address 456 = " + (arrayC[1]));
    }
}
