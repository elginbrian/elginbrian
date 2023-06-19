// Eps. 38 Rekursif bercabang
package com.Tutorial;
import java.lang.String;
import java.util.*;
public class Main {
    private static int fibonacci(int x, String branch){
        System.out.println(branch + "branch");
        System.out.println("Iteration = "+ x);
        if (x == 1 || x == 0){
            return x;
        }
        else{
            return fibonacci(x - 1, "left ") + fibonacci(x - 2, "right ");
        }
    }
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.print("Fibonacci = ");
        int collected = userInput.nextInt();
        int result = fibonacci(collected, "upper ");
        System.out.println("Fibonacci "+ collected + " = " + result);
    }
}
