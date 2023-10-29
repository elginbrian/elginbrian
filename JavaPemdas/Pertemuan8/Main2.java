package JavaPemdas.Pertemuan8;
import java.util.*;
public class Main2 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        float num1, num2;
        char operator, confirm;

        num1     = userInput.nextFloat();
        num2     = userInput.nextFloat();     
        operator = userInput.next().charAt(0);

        float result;
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
            } else{
                System.out.println("Pembagian dengan Nol Tidak Terdefinisi");
                return;
            }
        System.out.printf("Hasil operasi: %f \n", result);
        }
    }
}
    
   