package practice.controller;
import practice.model.customerModel;;

public class customerController {
    protected static customerModel[] customerArray = {
        new customerModel(),
        new customerModel(),
        new customerModel(),
        new customerModel(),
        new customerModel(),
        new customerModel(),
        new customerModel(),
        new customerModel(),
        new customerModel(),
        new customerModel(),
    };

    public void addCustomer(customerModel customer, int tableNumber){
        customerArray[tableNumber - 1] = customer;
    }

    public void deleteCustomer(int tableNumber){
        customerArray[tableNumber - 1] = new customerModel();
    }
}
