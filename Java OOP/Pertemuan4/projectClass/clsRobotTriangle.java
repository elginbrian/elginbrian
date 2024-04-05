package projectClass;
import java.util.*;

public class clsRobotTriangle {
    public double base;
    public double height;

    public double getArea() {
        return base * height / 2;
    }
    
    public double getPerimeter() {
        double hipotenuse = Math.sqrt((Math.pow(base / 2, 2)) + Math.pow(height, 2));
        return base + hipotenuse + hipotenuse;
    }
}
