package JavaPemdas.UTP;
import java.util.*;
public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jenisKendaraan = input.nextInt();
        int lamaParkir = input.nextInt();
        int uangParkir = input.nextInt();
        int tarif = 0;
        if (jenisKendaraan == 1) {
            tarif = 2000;
        } else if (jenisKendaraan == 2) {
            tarif = 4000;
        } else if (jenisKendaraan == 3) {
            tarif = 9000;
        }

        int tagihan = tarif * lamaParkir;
        if (uangParkir == tagihan){
            System.out.println("Uang yang dibayarkan pas.");
        } else if (uangParkir < tagihan){
            System.out.println("Uang anda belum mencukupi.");
        } else if (uangParkir > tagihan){
            uangParkir = uangParkir - tagihan;
            int uang10rb = uangParkir / 10000;
            uangParkir = uangParkir % 10000;
            int uang5rb = uangParkir / 5000;
            uangParkir = uangParkir % 5000;
            int uang500 = uangParkir / 500;
            uangParkir = uangParkir % 500;
            int uang100 = uangParkir / 100;

            System.out.println("Anda mendapatkan kembalian sebesar:");
            System.out.printf("%d uang 10.000", uang10rb);
            System.out.printf("%d uang 5.000", uang5rb);
            System.out.printf("%d uang 500", uang500);
            System.out.printf("%d uang 100", uang100);
        }
    }
}
// %
