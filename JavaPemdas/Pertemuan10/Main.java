package JavaPemdas.Pertemuan10;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        // break dan continue
        for (int i = 0; i < 10; i++) {
            if  (i == 8){
                break;
            }
            else if (i % 2 == 0){
                continue;
            } else {
                System.out.println("Perulangan ke - " + i);
            }
        }

        int b = 5;
        do {
            System.out.println("b = "+ b);
        } while (b < 10);
    }
}
