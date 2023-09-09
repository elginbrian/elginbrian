package JavaPemdas.Pertemuan2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        
        String firstName = "Elgin";
        String lastName = "Brian";
        int age = 17;
        
        System.out.println("Nama saya adalah "+ firstName + " " + lastName + ", umur saya "+ age + " tahun.\n");

        int num1 = 10;
        int num2 = 5;
        
        byte tinyNum = 3;
        short smallNum = 4;
        long bigNum = 5;

        float decimal = 3.5f;
        double bigDecimal = 4.5;

        char character = 'a';

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan bulat/integer : ");
        int numInput = input.nextInt();
        System.out.println("bilangan yang anda masukkan adalah : " + numInput);
    }
}
