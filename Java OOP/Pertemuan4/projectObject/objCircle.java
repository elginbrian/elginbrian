package projectObject;

import projectClass.clsCircle;

public class objCircle {
    public static void main(String[] args) {
        clsCircle circleA = new clsCircle();
        clsCircle circleB = new clsCircle();

        circleA.radius = 5;
        circleB.radius = 7;
        
        System.out.println(circleA.getArea());
        System.out.println(circleA.getPerimeter());

        System.out.println(circleB.getArea());
        System.out.println(circleB.getPerimeter());
    }
}
