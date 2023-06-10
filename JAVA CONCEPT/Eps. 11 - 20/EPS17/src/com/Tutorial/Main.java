// Eps.17 Mengambil Input User
package com.Tutorial;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        
        // Program menghitung luas persegi panjang
        Scanner UserInput = new Scanner(System.in);

        System.out.println("Program menghitung luas persegi panjang");

        System.out.print("Panjang = ");
        int input1 = UserInput.nextInt();

        System.out.print("Lebar = ");
        int input2 = UserInput.nextInt();

        int luas = input1 * input2;
        System.out.printf("Luas = %d x %d = %d", input1, input2, luas);

    }
}
