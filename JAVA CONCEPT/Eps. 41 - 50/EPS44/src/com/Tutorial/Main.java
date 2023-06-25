// Eps. 44 Latihan Array 
package com.Tutorial;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int[] array1 = {3,6,5,8,9,1};
        int[] array2 = {8,2,5,9,2,1};

        show(array1,"array ke-1 ");
        show(array2,"array ke-2 ");

        // Penjumlahan antara 2 array
        int[] hasil = addArray(array1, array2);
        show(hasil,"penjumlahan ");

        // Menggabungkan 2 buah array (merge)
        hasil = mergeArray(array1, array2);
        show(hasil,"merge ");
        
        // Reverse sorting (type 1)
        hasil = reverseArray1(array1);
        show(hasil,"reverse sort ");

        // Reverse sorting (type 2)
        hasil = reverseArray2(array1);
        show(hasil,"reverse only ");
    }
    private static int[] reverseArray2(int[] array){
        Arrays.sort(array);
        int buffer;
        for (int i = 0; i < (array.length/2); i++){
            buffer = array[i];
            array[i] = array[(array.length - 1) - i];
            array[(array.length - 1) - i] = buffer;
        }
        return array;
    }
    private static int[] reverseArray1(int[] array){
        Arrays.sort(array);
        int[] buffer = Arrays.copyOf(array, array.length);
        for(int i = 0; i < array.length; i++){
            array[i] = buffer[(buffer.length - 1) - i];
        }
        return array;
    }
    private static int[] mergeArray(int[] arrayA, int[] arrayB){
        int[] result = new int[arrayA.length + arrayB.length];
        for (int i = 0; i < arrayA.length; i++){
            result[i] = arrayA[i];
        }
        for (int i = 0; i < arrayB.length; i++){
            result[i + arrayA.length] = arrayB[i];
        }
        return result;
    }
    private static int[] addArray(int[] arrayA, int[] arrayB){
        int[] result = new int[arrayA.length];
        for (int i = 0; i < result.length; i++){
            result[i] = arrayA[i] + arrayB[i];
        }
        return result;
    }
    private static void show(int[] array, String message){
        System.out.println(message + Arrays.toString(array));
    }    
}
