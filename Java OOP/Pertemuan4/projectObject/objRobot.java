package projectObject;

import projectClass.clsRobot;

public class objRobot {
    public static void main(String[] args) {
        clsRobot robotA = new clsRobot();
        
        // Kepala
        robotA.robotHead.radius = 10;

        // Badan
        robotA.robotBody.base   = 20;
        robotA.robotBody.height = 20;

        // Lengan Kanan
        robotA.robotRightArm.width  = 2;
        robotA.robotRightArm.length = 15;

        // Lengan Kiri
        robotA.robotLeftArm.width   = 2;
        robotA.robotLeftArm.length  = 15;

        // Pinggang
        robotA.robotHip.width  = 3;
        robotA.robotHip.length = 15;

        // Kaki Kanan
        robotA.robotRightLeg.width  = 2;
        robotA.robotRightLeg.length = 20;

        // Kaki Kiri
        robotA.robotLeftLeg.width   = 2;
        robotA.robotLeftLeg.length  = 20;

        System.out.println("Total luas robot: " + robotA.getRobotArea());
        System.out.println("Total keliling robot: " + robotA.getRobotPerimeter());

        clsRobot robotB = new clsRobot(
            10, 
            20, 
            20, 
            2, 
            15, 
            2, 
            15, 
            3, 
            15, 
            2, 
            20, 
            2, 
            20
            );
            System.out.println("Total luas robot: " + robotB.getRobotArea());
            System.out.println("Total keliling robot: " + robotB.getRobotPerimeter());    
    }
}
