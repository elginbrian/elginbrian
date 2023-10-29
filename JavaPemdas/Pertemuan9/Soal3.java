package JavaPemdas.Pertemuan9;
import java.util.*;
public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int foodType, foodAmount, foodPrice = 0, beverageType, beverageAmount, beveragePrice = 0, customerCash, additionalCash;
        int cumulativePrice = 0;

        System.out.println("SELAMAT DATANG DI KIKO'RESTAURANT");
        System.out.println("LIST MAKANAN:");
        System.out.println("1. Nasi Lalapan 13.000");
        System.out.println("2. Mi ayam 9.000");
        System.out.println("3. Nasi Campur 10.000");
        System.out.println("4. Nasi Pecel 10.000");
        System.out.println("0. Keluar");

        while (true) {
            System.out.println("Pilih order dan masukkan jumlah:");
            foodType = input.nextInt();

            if (foodType == 0) {
                break;

            } switch (foodType){
                case 1:
                    foodPrice = 13000;
                    break;
                case 2:
                    foodPrice = 9000;
                    break;
                case 3:
                case 4:
                    foodPrice = 10000;
                    break;
                default:
                    System.out.println("Pilihan tidak ada");

            } if ((foodType > 0) && (foodType <= 4)){
                foodAmount = input.nextInt();
                cumulativePrice += (foodPrice * foodAmount);
            }
        }

        System.out.println("LIST MINUMAN:");
        System.out.println("1. Teh 5.000");
        System.out.println("2. Jeruk 6.000");
        System.out.println("3. Susu 8.000");
        System.out.println("0. Keluar");

        while (true){
            System.out.println("Pilih order dan masukkan jumlah:");
            beverageType = input.nextInt();

            if (beverageType == 0){
                break;

            } switch (beverageType){
                case 1:
                    beveragePrice = 5000;
                    break;
                case 2:
                    beveragePrice = 6000;
                    break;
                case 3:
                    beveragePrice = 8000;
                    break;
                default:
                    System.out.println("Pilihan tidak ada");

            } if ((beverageType > 0) && (beverageType <= 3)){
                beverageAmount = input.nextInt();
                cumulativePrice += (beveragePrice * beverageAmount);
            }
        }

        System.out.printf("Total belanja: %d\n", cumulativePrice);
        System.out.println("Masukkan uang untuk membayar:");

        customerCash = input.nextInt();

        if (customerCash > cumulativePrice){
            System.out.printf("Kembalian: %d\n", (customerCash - cumulativePrice));

        } else if (customerCash < cumulativePrice){
            while (customerCash < cumulativePrice){
                System.out.printf("Uang yang dimasukkan kurang %d. Masukkan uang lagi:\n", (cumulativePrice - customerCash));
                additionalCash = input.nextInt();
                customerCash += additionalCash;

            } System.out.printf("Kembalian: %d\n", (customerCash - cumulativePrice));
        }
        System.out.println("TERIMA KASIH TELAH BERBELANJA DI KIKO'S RESTAURANT");
    }
}

 








