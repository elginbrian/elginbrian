package practice.model;
import practice.model.foodModel;

public class customerModel {
    public String customerName;
    public int tableNumber;
    public foodModel[] customerOrder = new foodModel[0];

    public customerModel(String customerName, int tableNumber) {
        this.customerName = customerName;
        this.tableNumber = tableNumber;
    }

    public customerModel(){
        customerName = "";
        tableNumber = 0;
    }
}
