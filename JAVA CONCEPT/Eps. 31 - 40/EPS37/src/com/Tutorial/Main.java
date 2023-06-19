// Eps. 37 Fungsi Rekursif
package com.Tutorial;
import java.util.*;
public class Main {
    private static void countdown(int parameter){ // Rekursif hitung mundur
        System.out.println("Value = "+ parameter);
        if (parameter == 0){
            return;
        }
        parameter --;
        countdown(parameter);
    }
    private static int cumulative(int parameter){ // Rekursif hitung total
        if (parameter == 0){
            return parameter;
        }
        return parameter + cumulative(parameter - 1);
    }
    private static int factorial(int parameter){ // rekursif hitung faktorial x!
        if (parameter == 1){
            return parameter;
        }
        return parameter * factorial(parameter - 1);    
    }
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.print("Input = ");
        int collected = userInput.nextInt();

        countdown(collected);
        int total = cumulative(collected);
        System.out.println("Total = " + total);
        int factorial = factorial(collected);
        System.out.println("factorial = " + factorial);
    }
}
