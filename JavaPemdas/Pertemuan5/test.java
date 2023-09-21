package JavaPemdas.Pertemuan5;
import java.io.*;
import java.util.*;
public class test {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bounceN = input.nextInt();
        int height0 = 5;
        int differenceB = 2;
        int differenceC = 2;
        int count = 1;

        if (bounceN < 0) {
        bounceN = 1;
        }

        while (count < bounceN) {
            height0 = height0 + differenceB;
            differenceB = differenceB + differenceC;
            count++;
        }
        
        System.out.println(height0);
    }
}