// Eps. 23 Switch Case
package com.Tutorial;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        String input;
        Scanner inputUser = new Scanner(System.in);

        System.out.print("Call Name : ");
        input = inputUser.next();

        // Switch menerima ekspresi berupa satuan (int, long, byte, short), string, atau enum
        // Case harus diakhiri dengan break jika ingin opsi dibawahnya tidak dieksekusi

        switch(input){
            case "Luz":
                System.out.println("Hi person named Luz");
                break;
            case "Amity":
                System.out.println("Hi Amity Blight");
                break;
            case "Gus":
                System.out.println("Hi Augustus");
                break;
            default:
                System.out.println("Hi Strange person");
        }

        System.out.println("End");
    }
}
