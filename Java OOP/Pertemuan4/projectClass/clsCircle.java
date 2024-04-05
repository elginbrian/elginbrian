package projectClass;

public class clsCircle {
    public double radius = 0;
    private double area;
    private double perimeter;

    public double getArea() {
        double area;
        area = radius * radius * 3.14;
        this.area = area;
        return this.area;
    }    

    public double getPerimeter() {
        perimeter = 2 * radius * 3.14;
        return perimeter;
    }
}
