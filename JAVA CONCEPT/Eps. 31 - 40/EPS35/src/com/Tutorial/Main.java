// Eps. 35 Fungsi atau Method Void
package com.Tutorial;
public class Main {
    private static float nonvoid(){
        return 10.0f;
    }
    private static void yesvoid(String input){
        System.out.println("The input is = "+ input);
    }
    public static void main(String[] args){
        nonvoid();
        yesvoid("Halo");

    }
}

