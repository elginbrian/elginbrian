package classProject;

public class Car {
    private String numPlate;
    private String color;
    private String manufacture;
    private String speed;

    public void setNumPlate(String numPlate) { this.numPlate = numPlate; }    
    public void setColor(String color) { this.color = color; }    
    public void setManufacture(String manufacture) { this.manufacture = manufacture; }
    public void setSpeed(String speed) { this.speed = speed; }
    
    
    public String getNumPlate() { return numPlate; }
    public String getColor() { return color; }
    public String getManufacture() { return manufacture; }
    public String getSpeed() { return speed; }

    public void getCarInfo(){
        System.out.println("Manufacture : " + manufacture);
        System.out.println("Plate Number : " + numPlate);
        System.out.println("Color : " + color);
        System.out.println("Speed :" + speed);
    }
}
