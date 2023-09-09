package JavaPemdas;
import java.util.*;
public class Kalkulator {
    public static void main(String[] args){

        // Nama  = Elgin Brian Wahyu Bramadhika
        // NIM   = 235150701111031
        // Prodi = Teknologi Informasi
        // Kelas = C

        float num1, num2;
        char operator, confirm;
        Scanner userInput;

        while (true){ 
            System.out.println("\nProgram Kalkulator Sederhana");
            System.out.println("==================================");
            userInput = new Scanner(System.in);

            System.out.print("Masukkan angka pertama      : ");
            num1     = userInput.nextFloat();
            System.out.print("Masukkan angka kedua        : ");
            num2     = userInput.nextFloat();
            System.out.print("Masukkan operator (+,-,*,/) : ");
            operator = userInput.next().charAt(0);

            calculate(num1, num2, operator);

            System.out.print("\nApakah anda ingin melanjutkan program? (y/n) : ");
            confirm = userInput.next().charAt(0);

            if (confirm == 'y' || confirm =='Y') {
                continue;
            }
            else{
                break;
            }
        }
    }
    private static void calculate(float num1, float num2, char operator){
        float result;
        System.out.println("==================================");
        if (operator == '+') {
            result = num1 + num2;
        }
        else if (operator == '-') {
            result = num1 - num2;
        }
        else if (operator == '*') {
            result = num1 * num2;
        }
        else if (operator == '/') {
            if (num2 != 0){
                result = num1 / num2;
            }
            else{
                System.out.println("Pembagian dengan Nol Tidak Terdefinisi");
                return;
            }
        }
        else{
            System.out.println("Operator Tidak Valid");
            return;
        }
        System.out.printf("Hasil = %f \n", result);
    }
}


