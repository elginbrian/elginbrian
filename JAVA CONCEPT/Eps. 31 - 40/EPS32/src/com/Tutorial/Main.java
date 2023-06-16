// Eps. 32 Control Flow Break, Continue, dan Return
package com.Tutorial;
public class Main {
    public static void main(String[] args){
        int a = 0;

        while (true) {
            if (a == 5){
                System.out.println("Dampak dari continue");}

            a++;
            if (a == 10){
                break;} // break memaksa program keluar dari loop
            else if (a == 5){
                continue;} // continue memaksa program mengulang loop dari awal
            
            System.out.println("Looping ke - "+ a);    
        }
    
        while (true){
            a++;
            if (a == 13){
                return;} // return mematikan program secara total
            System.out.println("Looping ke - "+ a);
        }
    }
}
