// Eps. 50 String Builder
package com.Tutorial;
import java.lang.StringBuilder;
public class Main {
    public static void main(String[] args) {
        StringBuilder stringBee = new StringBuilder("Halo");
        check(stringBee);

        // append
        stringBee.append(" semuanya");
        check(stringBee);
        
        stringBee.append(" warga Surabaya");
        check(stringBee);

        // insert
        stringBee.insert(19, " Kota");
        check(stringBee);

        // delete
        stringBee.delete(5,14);
        check(stringBee);

        // merubah karakter pada index tertentu
        stringBee.setCharAt(5, 'W');
        check(stringBee);

        // replace
        stringBee.replace(16, 24, "Bandung");
        check(stringBee);

        // casting to string
        String kalimat = stringBee.toString();
        System.out.println("Data     = " + kalimat);
        int address = System.identityHashCode(kalimat);
        System.out.println("Address  = " + address + "\n");

    }
    private static void check(StringBuilder string){
        System.out.println("Data     = " + string);
        System.out.println("Length   = " + string.length());
        System.out.println("Capacity = " + string.capacity());
        
        int address = System.identityHashCode(string);
        System.out.println("Address  = " + address + "\n");
    }
}
