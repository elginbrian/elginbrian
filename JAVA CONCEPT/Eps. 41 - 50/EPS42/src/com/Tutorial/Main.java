// Eps. 42 Pass By Reference
package com.Tutorial;
import java.util.Arrays;
public class Main {
    public static void main(String[] args){
        int[] array1 = {1,2,3,4};
        int[] array2 = new int[4];

        System.out.println("Address 1 = "+ array1); // sebelum digabung
        System.out.println("Address 2 = "+ array2 + "\n");

        System.out.println("Array 1 = "+ Arrays.toString(array1));
        System.out.println("Array 2 = "+ Arrays.toString(array2) + "\n");

        array1 = array2;

        System.out.println("Address 1 = "+ array1); // setelah digabung
        System.out.println("Address 2 = "+ array2 + "\n");

        array1[0] = 5;
        array2[3] = 8;

        System.out.println("Array 1 = "+ Arrays.toString(array1));
        System.out.println("Array 2 = "+ Arrays.toString(array2));
    }
}
