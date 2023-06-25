// Eps. 34 Operasi Pada Array
package com.Tutorial;
import java.util.*;
public class Main {
    private static void header(String text){
        System.out.println(text);
    }
    private static void show(int[] name, int num){
        System.out.println("array"+ num + " = " + Arrays.toString(name));
    }
    private static void enter(){
        System.out.print("\n");
    }
    public static void main(String[] args){
        int[] array1 = {1, 2, 3, 4, 5};

        // Merubah array menjadi string
        header("Merubah array menjadi string");
        show(array1,1);
        enter();

        // Mengcopy array dengan loop
        int[] array2 = new int[5];
        header("Mengcopy array dengan loop");
        for (int i = 0; i < array1.length; i++){
            array2[i] = array1[i];
        }
        show(array2,2);
        enter();

        // Mengcopy array dengan copyOf
        header("Mengcopy Array dengan copyOf");
        int[] array3 = Arrays.copyOf(array1,5);
        show(array3,3);
        enter();

        // Mengcopy array dengan copyOfRange
        header("Mengcopy Array dengan copyOfRange");
        int[] array4 = Arrays.copyOfRange(array1, 2, 5);
        show(array4,4);
        enter();

        // Fill array
        header("Fill array");
        int[] array5 = new int[10];
        show(array5,5);
        Arrays.fill(array5,1);
        show(array5,5);
        enter();

        // Komparasi array
        header("Komparasi array");
        int[] array6 = {4,5,6,7,8};
        int[] array7 = {4,5,6,7,8};

        show(array6,6);
        show(array7,7);
        
        if (Arrays.equals(array6, array7)) {
            System.out.println("Array ini sama");}
        else{
            System.out.println("Array ini berbeda");}
        enter();

        // Mencari total komponen array yang lebih besar
        header("Mencari total komponen array yang lebih besar");
        int[] array8 = {1,7,9,10};
        int[] array9 = {1,7,5,10};
        
        int compare = Arrays.compare(array8, array9);
        if (compare == 1){
            System.out.println("Array8 lebih besar");
        }
        else if (compare == -1){
            System.out.println("Array9 lebih besar");
        }
        else{
            System.out.println("Keduanya sama besar");
        }
        enter();

        // Mengecek index yang berbeda
        header("Mengecek index yang berbeda");
        show(array8,8);
        show(array9,9);

        System.out.println(Arrays.mismatch(array8,array9));
        enter();

        // sort array
        header("sort array");
        int[] array10 = {3,4,5,8,2,7,2,6,4};
        show(array10,10);
        Arrays.sort(array10);
        show(array10,10);
        enter();

        // search array
        header("search array");
        show(array10,10);
        int find = 6;
        int index = Arrays.binarySearch(array10,find);
        System.out.printf("angka %d ada di index %d\n", find, index);
        enter();
    }
    
}
