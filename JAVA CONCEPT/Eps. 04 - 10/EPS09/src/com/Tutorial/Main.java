// Eps.9 Tipe data fundamental atau primitif
package com.Tutorial;
public class Main {
    public static void main(String[] args) {
        // Integer (angka bulat) (4 bytes) (32 bit)
        int a = 20;
        System.out.println("Integer a = " + a);
        System.out.println("Nilai maks = " + Integer.MAX_VALUE);
        System.out.println("Nilai min = " + Integer.MIN_VALUE);
        System.out.println("Besar Integer = " + Integer.BYTES + " Bytes");
        System.out.println("Besar Integer = " + Integer.SIZE + " Bit \n");
        
        // Byte (angka bulat) (1 byte) (8 bit)
        byte b = 10;
        System.out.println("Byte b = " + b);
        System.out.println("Nilai maks = " + Byte.MAX_VALUE);
        System.out.println("Nilai min = " + Byte.MIN_VALUE);
        System.out.println("Besar Byte = " + Byte.BYTES + " Bytes");
        System.out.println("Besar Byte = " + Byte.SIZE + " Bit \n");
        
        // Short (angka bulat) (2 bytes) (16 bit)
        short c = 30;
        System.out.println("Short c = " + c);
        System.out.println("Nilai maks = " + Short.MAX_VALUE);
        System.out.println("Nilai min = " + Short.MIN_VALUE);
        System.out.println("Besar Short = " + Short.BYTES + " Bytes");
        System.out.println("Besar Short = " + Short.SIZE + " Bit \n");

        // Long (angka bulat (8 byte) (64 bit)
        long d = 40L;
        System.out.println("Long d = " + d);
        System.out.println("Nilai maks = " + Long.MAX_VALUE);
        System.out.println("Nilai min = " + Long.MIN_VALUE);
        System.out.println("Besar Long = " + Long.BYTES + " Bytes");
        System.out.println("Besar Long = " + Long.SIZE + " Bit \n");

        // Double (angka desimal) (8 byte) (64 bit)
        double e = 10.5d;
        System.out.println("Double e = " + e);
        System.out.println("Nilai maks = " + Double.MAX_VALUE);
        System.out.println("Nilai min = " + Double.MIN_VALUE);
        System.out.println("Besar Double = " + Double.BYTES + " Bytes");
        System.out.println("Besar Double = " + Double.SIZE + " Bit \n");

        // Float (angka desimal) (4 byte) (32 bit)
        float f = 10.5f;
        System.out.println("Float f = " + f);
        System.out.println("Nilai maks = " + Float.MAX_VALUE);
        System.out.println("Nilai min = " + Float.MIN_VALUE);
        System.out.println("Besar Float = " + Float.BYTES + " Bytes");
        System.out.println("Besar Float = " + Float.SIZE + " Bit \n");

        // Char (karakter ASCII) (2 byte) (16 bit)
        char g = 'g';
        System.out.println("Char g = " + g);
        System.out.println("Besar Char = " + Character.BYTES + " Bytes");
        System.out.println("Besar Char = " + Character.SIZE + " Bit \n");

        // Boolean (True/False)
        boolean h = true;
        System.out.println("Boolean h = " + h);
        System.out.println("Nilai maks = " + Boolean.TRUE);                
        System.out.println("Nilai min = " + Boolean.FALSE);                
    }
}
