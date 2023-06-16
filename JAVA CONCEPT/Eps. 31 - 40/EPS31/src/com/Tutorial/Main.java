// Eps.31 Lathihan Looping Fibonacci
package com.Tutorial;
import java.util.*;
public class Main{
    public static void main(String[] args){
        // Menghitung nilai deret fibonacci ke-n
        int Fn, Fn_1, Fn_2, n;
        Scanner inputUser = new Scanner(System.in);

        System.out.print("Mencari nilai fibonacci ke? = ");
        n = inputUser.nextInt();

        Fn_2 = 0;
        Fn_1 = 1;
        Fn = 1;

        for (int i = 1; i <= n; i++) {
            System.out.println("Nilai ke-"+ i + " = "+ Fn);
            Fn = Fn_1 + Fn_2;
            Fn_2 = Fn_1;
            Fn_1 = Fn;
        }
    }
}
