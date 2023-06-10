// Eps.14 Operator Komparasi
package com.Tutorial;
public class Main {
    public static void main(String[] args) {
        // Operator komparasi akan menghasilkan nilai dalam bentuk boolean

        int a,b,c,d;
        a = 10;
        b = 20;
        c = 5;
        d = 10;

        // Lebih dari
        System.out.printf("Is %d > %d? %s \n", a, c, (a > c));
        System.out.printf("Is %d > %d? %s \n", c, a, (c > a));
    
        boolean hasil = (a > b);
        System.out.println(hasil + "\n");

        // Kurang dari
        System.out.printf("Is %d < %d? %s \n", a, b, (a < b));
        System.out.printf("Is %d < %d? %s \n", b, a, (b < a));

        boolean hasil2 = (a < b);
        System.out.println(hasil2 + "\n");

        // Sama dengan
        System.out.printf("Is %d == %d? %s \n", a, b, (a == b));
        System.out.printf("Is %d == %d? %s \n", a, d, (a == d));

        boolean hasil3 = (a == d);
        System.out.println(hasil3 + "\n");

        // Tidak sama dengan
        System.out.printf("is %d != %d? %s \n", a, d, (a != d));
        System.out.printf("is %d != %d? %s \n", a, c, (a != c));

        boolean hasil4 = (a != c);
        System.out.println(hasil4 + "\n");

        // Lebih dari sama dengan
        System.out.printf("Is %d >= %d? %s \n", a, d, (a >= d));
        System.out.printf("Is %d >= %d? %s \n", a, b, (a >= b));

        boolean hasil5 = (a >= b);
        System.out.println(hasil5 + "\n");

        // Kurang dari sama dengan
        System.out.printf("Is %d <= %d? %s \n", a, d, (a <= d));
        System.out.printf("Is %d <= %d? %s \n", a, b, (a <= b));
        
        boolean hasil6 = (a <= b);
        System.out.println(hasil6 + "\n");

    }
}
