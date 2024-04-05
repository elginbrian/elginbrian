package projectClass;

public class clsRobotRectangle {
    public double length;
    public double width;

    public double getArea() {
        return length * width;
    }    

    public double getPerimeter() {
        return 2 * (length + width);
    }
}
