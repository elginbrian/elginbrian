package JavaPemdas.Pertemuan9;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Increment decrement
        int a = 0;
        a++;
        // a = a + 1;
        a--;
        // a = a - 1;

        // for loop
        for (int i = 1; i < 10; i++){
            System.out.println("loop ke-"+i);
        }

        String nama = "Safira";
        for (int j = 0; j < nama.length() ;j++){
            System.out.println(nama.charAt(j));
        }

        // while loop
        int b = 1;
        while (b < 10){
            System.out.println(b);
            b++;
        }
        boolean breakLoop = true;
        while (breakLoop) {
            String isi = input.nextLine();
            switch (isi){
                case "MINUM" :
                System.out.println("Minum banh");
                break;
                case "TIDUR" :
                System.out.println("zzzzzzzzzz....");
                break;
                case "EXIT" :
                breakLoop = false;
                break;
            }
        }
        // bikin segitiga
        for (int c = 0; a < 5; a++){
            System.out.println("*");
            for (int d = 0; d < 5; d++){
                System.out.println("");
            }
        }
    }
}
