package JavaPemdas.Pertemuan9;
import java.util.*;
public class Davin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("SELAMAT DATANG DI KIKO'RESTAURANT");
        System.out.println("LIST MAKANAN: ");
        System.out.println("1. Nasi Lalapan 13.000");
        System.out.println("2. Mi ayam 9.000");
        System.out.println("3. Nasi Campur 10.000");
        System.out.println("4. Nasi Pecel 10.000");
        System.out.println("0. Keluar");

        int price = 0;
        int amount = 0;

        while (true) {
            System.out.println("Pilih order dan masukkan jumlah:");

            int order = input.nextInt();
            if (order < 0 || order > 4) {
                System.out.println("Pilihan tidak ada");
            }
            else if (order == 0) {
                break;
            }
            else
                amount = input.nextInt();

            switch (order) {
                case 1 :
                    price += 13000 * amount;
                    break;
                case 2 :
                    price += 9000 * amount;
                    break;
                case 3 :
                    price += 10000 * amount;
                    break;
                case 4 :
                    price += 10000 * amount;
                    break;
            }
        }

        System.out.println("LIST MINUMAN: ");
        System.out.println("1. Teh 5.000");
        System.out.println("2. Jeruk 6.000");
        System.out.println("3. Susu 8.000");
        System.out.println("0. Keluar");

        while (true) {
            System.out.println("Pilih order dan masukkan jumlah:");

            int order = input.nextInt();
            if (order < 0 || order > 3) {
                System.out.println("Pilihan tidak ada");
            }
            else if (order == 0) {
                break;
            }
            else
                amount = input.nextInt();

            switch (order) {
                case 1 :
                    price += 5000 * amount;
                    break;
                case 2 :
                    price += 6000 * amount;
                    break;
                case 3 :
                    price += 8000 * amount;
                    break;
            }
        }

        System.out.println("Total belanja: " + price);

        System.out.println("Masukkan uang untuk membayar:");
        int pay = input.nextInt();

        int change = 0;

        if (pay > price) {
            change = pay - price;
            System.out.println("Kembalian: " + change);
        }
        else if (pay < price) {
            int minus = price - pay;
            
            do {
                System.out.print("Uang yang dimasukkan kurang " + minus + ". ");
                System.out.println("Masukkan uang lagi:");
                pay = input.nextInt();
                minus -= pay;
            }
            while (minus > 0);

            if (minus < 0) {
                change = Math.abs(minus);
                System.out.println("Kembalian: " + change);
            }
        }

        input.close();
        System.out.println("TERIMA KASIH TELAH BERBELANJA DI KIKO'S RESTAURANT");
    }
}
