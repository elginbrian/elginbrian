// Eps. 36 Latihan Fungsi Menghitung dan menggambar
package com.Tutorial;
import java.util.*;
public class Main {
    private static void makesquare(int length, int width){
        for (int i = 0; i < width; i++){
            for (int j = 0; j < length; j++){
                System.out.print("* ");}
            System.out.print("\n");}
    }
    private static int area(int length, int width){
        int result = length * width;
        return result;
    }
    private static int circumference(int length, int width){
        int result = (length + width) * 2;
        return result;
    }
    private static void display(int length, int width){
        System.out.println("Area = "+ area(length, width));
        System.out.println("Circumference = "+ circumference(length, width));
    }

    public static void main(String[] args){
        Scanner inputUser = new Scanner(System.in);

        System.out.print("Length = ");
        int length = inputUser.nextInt();
        System.out.print("Width = ");
        int width = inputUser.nextInt();

        makesquare(length, width);
        display(length, width);
    }
}
