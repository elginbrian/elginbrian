package objProject;

import classProject.Car;

public class Main {
    public static void main(String[] args) {
        Car C1 = new Car();

        C1.setNumPlate("N 123 Teknik");
        C1.setColor("Black");
        C1.setManufacture("BMW");
        C1.setSpeed("100");

        C1.getCarInfo();

        String numPlate    = C1.getNumPlate();
        String color       = C1.getColor();
        String manufacture = C1.getManufacture();
        String speed       = C1.getSpeed();

        System.out.println(numPlate);
        System.out.println(color);
        System.out.println(manufacture);
        System.out.println(speed);
    }
}
