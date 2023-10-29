package JavaPemdas.UTP;
import java.util.*;
public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sudutElevasi = input.nextDouble();
        double kecepatanKMH = input.nextDouble();

        double kecepatanMH = kecepatanKMH * 1000;
        double kecepatanMS = kecepatanMH / 3600;
        double sudutElevasiRad = Math.toRadians(sudutElevasi);

        double tinggiGedung = 50;
        double jarakHorizontal = (tinggiGedung * Math.tan(sudutElevasiRad));
        int jarakHoriCeil = (int) Math.ceil(jarakHorizontal);
        
        double jarakMaksPeserta = 6 * kecepatanMS;
        boolean apaTertangkap = jarakHorizontal < jarakMaksPeserta;

        System.out.printf("Jarak horizontal bola terhadap gedung: %d meter\n", jarakHoriCeil);
        System.out.printf("Peserta dapat menangkap bola: %b", apaTertangkap);
    }
}
// %