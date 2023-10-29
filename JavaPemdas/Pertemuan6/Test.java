package JavaPemdas.Pertemuan6;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        String line1 = input.nextLine();
        String color = input.nextLine();
        
        String city = line1.substring(0,3);
        int submission = Integer.parseInt(line1.substring(4,6));

        int deadlineMLG = 25;
        int deadlineSBY = 22;
        
        String type = "";
        String status = "";
        
        // identifikasi lomba
        if (city.equalsIgnoreCase("MLG")){
            type = (color.equalsIgnoreCase("hijau")) ? "Lomba menulis essay" : "Lomba menulis puisi";
        }
        else if (city.equalsIgnoreCase("SBY")){
            type = (color.equalsIgnoreCase("hijau")) ? "Lomba menulis puisi" : "Lomba menulis essay";
        }

        // idendifikasi deadline
        if (city.equalsIgnoreCase("MLG")){
            status = (submission <= deadlineMLG) ? "Diterima" : "Ditolak";
        } 
        else if (city.equalsIgnoreCase("SBY")){
            status = (submission <= deadlineSBY) ? "Diterima" : "Ditolak";
        }

        System.out.println(type);
        System.out.println(status);
    }
}
