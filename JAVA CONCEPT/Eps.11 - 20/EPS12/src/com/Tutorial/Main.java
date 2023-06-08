// Eps.12 Operator Unary (Decrement dan Increment)
package com.Tutorial;
public class Main {
    public static void main(String[] args){
        // Unary = operasi yang dilakukan pada satu variabel saja
        int a = 2;
        int b = -3;

        // Unary minus
        System.out.println("a ="+ -a); // -2

        // Unary plus
        System.out.println("b ="+ +b); // 3

        // Unary increment
        a++;
        System.out.println("a ="+ a); // 3
        ++a;
        System.out.println("a ="+ a); // 4

        // Unary decrement
        int c = 6;
        c--;
        System.out.println("c ="+ c); // 5
        --c;
        System.out.println("c ="+ c); // 4

        // Unary negasi boolean
        boolean f = true;
        System.out.println("Boolean f = "+ !f);
        boolean g = false;
        System.out.println("Boolean g = "+ !g);

        // Pengaruh penempatan operator (prefiks dan postfix)
        int d = 4;
        System.out.printf("d = %d \n", ++d); // ditambah dulu baru ditampilkan
        int e = 4;
        System.out.printf("e = %d \n", e++); // ditampilkan dulu baru ditambah
        System.out.printf("e = %d \n", e);
    }
}
