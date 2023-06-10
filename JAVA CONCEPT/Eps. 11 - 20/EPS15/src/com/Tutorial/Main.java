// Eps. 15 Operator Logika
package com.Tutorial;
public class Main {
    public static void main(String[] args) {
        boolean a,b,c,e;
        a = true;
        b = false;
        c = true;

        // OR ||
        e = a || b;
        System.out.printf("%b or %b = %b \n",a,b,e);
        e = a || c;
        System.out.printf("%b or %b = %b \n",a,c,e);

        // AND &&
        e = a && b;
        System.out.printf("%b and %b = %b \n",a,b,e);
        e = a && c;
        System.out.printf("%b and %b = %b \n",a,c,e);

        // XOR ^
        e = a ^ b;
        System.out.printf("%b xor %b = %b \n",a,b,e);
        e = a ^ c;
        System.out.printf("%b xor %b = %b \n",a,c,e);

        // NOT !
        e = !a;
        System.out.printf("not %b = %b \n",a,e);
        e = !b;
        System.out.printf("not %b = %b \n",b,e);
    }
}
