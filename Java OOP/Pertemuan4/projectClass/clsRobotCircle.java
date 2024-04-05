package projectClass;
import java.util.*;
public class clsRobotCircle {
    public double radius;

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
}
