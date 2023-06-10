// Eps.16 Operator Bitwise
package com.Tutorial;
public class Main {
    public static void main(String[] args){
        // Operator Bitwise adalah operator untuk melakukan operasi pada bit
        byte a = 24;
        byte b,c,d;
        String a_bit, b_bit,c_bit,d_bit;
        
        a_bit = String.format("%8s", Integer.toBinaryString(a)).replace(" ", "0");
        System.out.printf("%s = %d \n\n", a_bit, a);


        // Shift Left
        System.out.println("=====SHIFT_LEFT======");
        b = (byte)(a << 1);
        b_bit = String.format("%8s", Integer.toBinaryString(b)).replace(" ", "0");
        System.out.printf("%s = %d \n", b_bit, b);
       
        // Shift Right
        System.out.println("=====SHIFT_RIGHT======");
        c = (byte)(a >> 1);
        c_bit = String.format("%8s", Integer.toBinaryString(c)).replace(" ", "0");
        System.out.printf("%s = %d \n\n", c_bit, c);
       
        
        // OR |
        System.out.printf("%s = %d \n", a_bit, a);
        System.out.printf("%s = %d \n", b_bit, b);
        System.out.println("============== OR");
        d = (byte)(a | b);
        d_bit = String.format("%8s", Integer.toBinaryString(d)).replace(" ", "0");
        System.out.printf("%s = %d \n\n", d_bit, d);

        // AND &
        System.out.printf("%s = %d \n", a_bit, a);
        System.out.printf("%s = %d \n", b_bit, b);
        System.out.println("============== AND");
        d = (byte)(a & b);
        d_bit = String.format("%8s", Integer.toBinaryString(d)).replace(" ", "0");
        System.out.printf("%s = %d \n\n", d_bit, d);

        // XOR ^
        System.out.printf("%s = %d \n", a_bit, a);
        System.out.printf("%s = %d \n", b_bit, b);
        System.out.println("============== XOR");
        d = (byte)(a ^ b);
        d_bit = String.format("%8s", Integer.toBinaryString(d)).replace(" ", "0");
        System.out.printf("%s = %d \n\n", d_bit, d);

        // NOT ~
        System.out.printf("%s = %d \n", a_bit, a);
        System.out.println("============== NOT");
        d = (byte)(~a);
        d_bit = String.format("%8s", Integer.toBinaryString(d).substring(24));
        System.out.printf("%s = %d \n\n", d_bit, d);





    }
}
