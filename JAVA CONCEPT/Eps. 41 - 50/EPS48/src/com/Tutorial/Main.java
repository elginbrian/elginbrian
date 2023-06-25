// Eps. 48 Pengenalan String
package com.Tutorial;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // Membuat string vs char
        String kataSTR = "hello";
        char[] kataCHAR = {'h','e','l','l','o'};

        // Mengakses komponen dari string vs char
        System.out.println("index 0 char = " + kataCHAR[0]);
        System.out.println("index 0 string = " + kataSTR.charAt(0));

        // Merubah komponen dari string vs char
        kataCHAR[0] = 'c';
        System.out.println(kataCHAR);
//      kataSTR[0] = "c";  <---- tidak bisa
//      System.out.println(kataSTR);  <---- tidak bisa

        // Merubah komponen string secara tidak langsung
        showAddress(kataSTR, kataSTR);
        kataSTR = "c" + kataSTR.substring(1,5);
        System.out.println(kataSTR);
        showAddress(kataSTR, kataSTR); // Address akan berbeda

        // Penyimpanan memory dari string
        String STR1 = "abc";
        String STR2 = "def";
        String STR3 = "defghi";
        String STR4 = "abc";

        showAddress(STR1, STR1);
        showAddress(STR2, STR2);
        showAddress(STR3, STR3); 
        showAddress(STR4, STR4); // STR1 dan STR4 memiliki address yang sama
                                 // karena komponenya sama

        STR3 = STR3.substring(0, 3);
        showAddress(STR3, STR3); // Adress tetap tidak akan sama dengan STR2

        // 1. String di Java bersifat immutable
        // 2. String yang ada di String Pool akan reusable
        //    sehingga memorinya akan lebih efisien
        // 3. Jika membuat string baru dengan .substring akan disimpan di memori lain
        //    bukan di String Pool

    }
    private static void showAddress(String nama, String data){
        int address = System.identityHashCode(data);
        System.out.println(nama + " = " + address);
    }
}
