package object;
import java.util.Scanner;

import classCircle.clsCircle;

public class objCircle {
    public static void main(String[] args) {
        clsCircle circleA = new clsCircle();
        Scanner input = new Scanner(System.in);

        System.out.println("Program menghitung luas lingkaran");
        System.out.print("Masukkan jari-jari: ");
        circleA.radius = input.nextInt();

        System.out.println(circleA.getArea());
        System.out.println(circleA.getPerimeter());
        input.close();
    }
}
