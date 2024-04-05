package projectClass;

public class clsRobot {
    public clsRobotCircle robotHead        = new clsRobotCircle();
    public clsRobotTriangle robotBody      = new clsRobotTriangle();
    public clsRobotRectangle robotRightArm = new clsRobotRectangle();
    public clsRobotRectangle robotLeftArm  = new clsRobotRectangle();
    public clsRobotRectangle robotHip      = new clsRobotRectangle();
    public clsRobotRectangle robotRightLeg = new clsRobotRectangle();
    public clsRobotRectangle robotLeftLeg  = new clsRobotRectangle();

    public clsRobot(
        int robotHeadRadius, 
        int robotBodyBase, 
        int robotBodyHeight, 
        int robotRightArmWidth,
        int robotRightArmLength, 
        int robotLeftArmWidth, 
        int robotLeftArmLength, 
        int robotHipWidth,
        int robotHipLength, 
        int robotRightLegWidth, 
        int robotRightLegLength, 
        int robotLeftLegWidth, 
        int robotLeftLegLength
    ){
        this.robotHead.radius = robotHeadRadius;

        this.robotBody.base = robotBodyBase;
        this.robotBody.height = robotBodyHeight;

        this.robotRightArm.width = robotRightArmWidth;
        this.robotRightArm.length = robotRightArmLength;

        this.robotLeftArm.width = robotLeftArmWidth;
        this.robotLeftArm.length = robotLeftArmLength;

        this.robotHip.width = robotHipWidth;
        this.robotHip.length = robotHipLength;

        this.robotRightLeg.width = robotRightLegWidth;
        this.robotRightLeg.length = robotRightLegLength;

        this.robotLeftLeg.width = robotLeftLegWidth;
        this.robotLeftLeg.length = robotLeftLegLength;
    }
    
    public clsRobot(){

    }

    public double getRobotArea(){
        return robotHead.getArea() + robotBody.getArea() + robotRightArm.getArea() + robotLeftArm.getArea() + robotHip.getArea() + robotRightLeg.getArea() + robotLeftLeg.getArea();
    }

    public double getRobotPerimeter(){
        return robotHead.getPerimeter() + robotBody.getPerimeter() + robotRightArm.getPerimeter() + robotLeftArm.getPerimeter() + robotHip.getPerimeter() + robotRightLeg.getPerimeter() + robotLeftLeg.getPerimeter();
    }
}
