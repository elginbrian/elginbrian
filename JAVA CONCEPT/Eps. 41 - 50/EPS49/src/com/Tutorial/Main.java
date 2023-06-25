// Eps. 49 Operasi String
package com.Tutorial;
public class Main {
    public static void main(String[] args){
        String kalimat = "Saya suka makan pisang";

        // concatenation (concat)
        String kata = kalimat.substring(10,15);
        String kalimat2 = kata + " bakwan";
        System.out.println(kalimat2);

        // concatenation dengan non string 
        int jumlah = 20;
        String kalimat3 = kalimat2 + " " + jumlah;
        System.out.println(kalimat3);
    
        // lowercase dan uppercase
        System.out.println(kalimat.toUpperCase());
        System.out.println(kalimat.toLowerCase());

        // replace (tapi membuat string baru)
        String kalimat4 = kalimat.replace("pisang", "banana");
        System.out.println(kalimat4);

        // equality (address)
        String STR1 = "abc"; // ini
        String STR2 = "abc"; // dan ini ada di string pool
        String STR3 = new String("abc"); // ini tidak

        equalAddress(STR1, STR2); // sama
        equalAddress(STR1, STR3); // tidak sama

        // equality (content)
        equalContent(STR1, STR2); // sama
        equalContent(STR1, STR3); // sama

        // compare
        STR1 = "aab";
        STR2 = "baa";
        STR3 = "aca";

        System.out.println(STR1.compareTo(STR3)); // a <-- c = -2
        System.out.println(STR2.compareTo(STR3)); // b <-- a =  1
        System.out.println(STR1.compareTo(STR2)); // a <-- b = -1
    }
    private static void equalAddress(String str1, String str2){
        if (str1 == str2){
            System.out.println(str1 + " & " + str2 + " sama");
        } else {
            System.out.println(str1 + " & " + str2 + " tidak sama");
        }
    }
    private static void equalContent(String str1, String str2){
        if (str1.equals(str2)){
            System.out.println(str1 + " & " + str2 + " sama");
        } else {
            System.out.println(str1 + " & " + str2 + " tidak sama");
        }
    }
}
