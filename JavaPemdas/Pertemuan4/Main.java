package JavaPemdas.Pertemuan4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // Output
        System.out.println("Hello world");
        System.out.println(16);

        String name = "Elgin";
        int age = 17;
        System.out.println("Namaku " + name + " umurku " + age + " tahun.\n");

        Scanner input = new Scanner(System.in);

        //System.out.print("Masukkan nama depan: ");
        //String shortName = input.next();
        //System.out.print("Masukkan nama panjang: ");
        //String fullName = input.nextLine();

        //System.out.println("\nNama pendek: " + shortName);
        //System.out.println("Nama panjang: " + fullName);

        int a = 5;
        double b = 4.5;
        int c = 24;
        double z = a+b;
        double y = c / (double) a;
        System.out.println(y);

        // modulo %
        int aa = 9 % 5;
        System.out.println(aa);

        // perpangkatan
        double num1 = Math.pow(2,5);
        System.out.println(num1);

        // akar pangkat 2
        double num2 = Math.sqrt(16);
        System.out.println(num2);

        // akar pangkat 3
        double num3 = Math.cbrt(27);
        System.out.println(num3);

        // randomizer
        int num4 = (int)Math.random();
        System.out.println(num4);

        // Output
        String greet =  "hello";
        System.out.println(greet); //
        System.out.print(greet + "\n");
        System.out.printf("%s everyone", greet);

        float num5 = 1.2345f;
        System.out.printf("1 angka: %.1f, 2 angka: %.2f, 3 angka: %.3f, 4 angka: %.4f.", num5, num5, num5, num5);
    }
}

