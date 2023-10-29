package JavaPemdas.Pertemuan6;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float meter = input.nextInt();
        int second = input.nextInt();
        
        // memecah detik ke jam, menit, dan detik
        float kilometer = meter / 1000f;
        int hour = Math.floorDiv(second, 3600);
        second = second - (hour * 3600);
        int minute = Math.floorDiv(second, 60);
        second = second - (minute * 60);
        
        // menghitung kecepatan
        float speedMS = meter / second;
        float speedMH = speedMS * 3600f;
        float speedKMH = speedMH / 1000f;

        // membentuk format 00:00:00
        String hourSTR = Integer.toString(hour);
        String minuteSTR = Integer.toString(minute);
        String secondSTR = Integer.toString(second);

        hourSTR = (hour < 10) ? ("0" + hourSTR) : hourSTR;
        minuteSTR = (minute < 10) ? ("0" + minuteSTR) : minuteSTR;
        secondSTR = (second < 10) ? ("0" + secondSTR) : secondSTR;
        
        // print
        System.out.printf("%.2f \n", kilometer);
        System.out.printf("%S:%S:%S \n", hourSTR, minuteSTR, secondSTR);
        System.out.printf("%.2f \n", speedKMH);
    }
}
