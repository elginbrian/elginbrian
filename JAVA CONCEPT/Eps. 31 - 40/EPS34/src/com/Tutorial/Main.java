// Eps. 34 Pengenalan Fungsi atau Method
package com.Tutorial;
public class Main {
    private static int hitung(int x){
        int hasil;
        hasil = (x + 2) * x;
        return hasil;
    }

    public static void main(String[] args){
        int x,y;

        x = 5;
        y = hitung(x);
        System.out.printf("x = %d, y = %d\n",x,y);

        x = 10;
        y = hitung(x);
        System.out.printf("x = %d, y = %d\n",x,y);

        x = 15;
        y = hitung(x);
        System.out.printf("x = %d, y = %d\n",x,y);
    }
}
