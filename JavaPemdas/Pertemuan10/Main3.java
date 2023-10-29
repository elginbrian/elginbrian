package JavaPemdas.Pertemuan10;
import java.util.*;
public class Main3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int primeAsked = input.nextInt();
        int primeCount = 0;
        boolean isPrime = true;

        for (int num = 2; ;num++){
            for (int denom = 2; denom < num; denom++){
                if (num % denom == 0){ 
                    // jika == 0 maka num bisa dibagi selain dgn 1 atau dirinya sendiri
                    isPrime = false;
                    break;
                }
            }
            if (isPrime == true){
                System.out.printf("%d ", num);
                primeCount++;
            }
            if (primeCount == primeAsked){
                break;
            }
            isPrime = true;
        }
    }
}
