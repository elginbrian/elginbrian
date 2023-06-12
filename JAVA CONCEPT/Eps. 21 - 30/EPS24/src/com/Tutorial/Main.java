// Eps. 24 Ternary Operator
package com.Tutorial;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int input, x;
        Scanner inputUser = new Scanner(System.in);

        System.out.print("Masukkan nilai = ");
        input = inputUser.nextInt();

        // variabel x = ekspresi ? statement_true : statement_false
        x = (input == 10) ? 10 : 0;
        System.out.println((x == 10) ? "Sepuluh" : "Bukan Sepuluh");

        System.out.println("End");
    }
}
