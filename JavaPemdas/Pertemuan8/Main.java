package JavaPemdas.Pertemuan8;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String row1A = input.nextLine();
        String row2A = input.nextLine();
        String row1B = input.nextLine();
        String row2B = input.nextLine();

        row1A = row1A.replaceAll(" ", "");
        row2A = row2A.replaceAll(" ", "");
        row1B = row1B.replaceAll(" ", "");
        row2B = row2B.replaceAll(" ", "");

        int L1A=  Integer.parseInt(row1A.substring(0, 1));
        int R1A =  Integer.parseInt(row1A.substring(1,2));
        int L2A = Integer.parseInt(row2A.substring(0,1));
        int R2A = Integer.parseInt(row2A.substring(1,2));

        int L1B=  Integer.parseInt(row1B.substring(0, 1));
        int R1B =  Integer.parseInt(row1B.substring(1,2));
        int L2B = Integer.parseInt(row2B.substring(0,1));
        int R2B = Integer.parseInt(row2B.substring(1,2));

        // Penjumlahan
        int addL1 = L1A + L1B;
        int addR1 = R1A + R1B;
        int addL2 = L2A + L2B;
        int addR2 = R2A + R2B;

        // Pengurangan
        int subL1 = L1A - L1B;
        int subR1 = R1A - R1B;
        int subL2 = L2A - L2B;
        int subR2 = R2A - R2B;

        // perkalian
        int mulL1 = ((L1A * L1B) + (R1A * L2B));
        int mulR1 = ((L1A * R1B) + (R1A * R2B));
        int mulL2 = ((L2A * L1B) + (R2A * L2B));
        int mulR2 = ((L2A * R1B) + (R2A * R2B));
        
        // Print
        System.out.println("Hasil pertambahan");
        System.out.printf("%d %d \n", addL1, addR1);
        System.out.printf("%d %d \n", addL2, addR2);

        System.out.println("\nHasil pengurangan");
        System.out.printf("%d %d \n", subL1, subR1);
        System.out.printf("%d %d \n", subL2, subR2);

        System.out.println("\nHasil perkalian");
        System.out.printf("%d %d \n", mulL1, mulR1);
        System.out.printf("%d %d \n", mulL2, mulR2);
    }
}
