package practice.controller;
import practice.model.customerModel;
import practice.model.foodModel;

public class orderController extends customerController{
    private foodModel[] foodArray = {
        new foodModel("Nasi Goreng" , 15000), 
        new foodModel("Mie Goreng"  , 15000), 
        new foodModel("Capcay"      ,20000),
        new foodModel("Bihun Goreng", 17000),
        new foodModel("Ayam Koloke" , 25000)
    };

    public void addOrder(int tableNumber, int orderNumber){
        foodModel[] customerOrder = super.customerArray[tableNumber - 1].customerOrder;
        foodModel[] newCustomerOrder = new foodModel[customerOrder.length + 1];
        for(int i = 0; i < customerOrder.length; i++){
            newCustomerOrder[i] = customerOrder[i];
        }

        newCustomerOrder[customerOrder.length] = foodArray[orderNumber - 1];
        super.customerArray[tableNumber - 1].customerOrder = newCustomerOrder;
    }

    public void displayMenu(){
        System.out.println("Daftar Menu: ");
        System.out.println("1. Nasi Goreng - Rp.15.000");
        System.out.println("2. Mie Goreng - Rp.15.000");
        System.out.println("3. Capcay - Rp.20.000");
        System.out.println("4. Bihun Goreng - Rp.17.000");
        System.out.println("5. Ayam Koloke - Rp.25.000");
        System.out.println("6. Simpan");
    }

    public void displayOrder(int tableNumber){
        customerModel customer = super.customerArray[tableNumber - 1];
        for(int i = 0; i < customer.customerOrder.length; i++){
            System.out.printf("Meja %d - %s memesan %s seharga %d\n", tableNumber, customer.customerName, customer.customerOrder[i].foodName, customer.customerOrder[i].foodPrice);
        }
    }

    public void countPrice(int tableNumber){
        int totalPrice = 0;
        customerModel customer = super.customerArray[tableNumber - 1];
        for(int i = 0; i < customer.customerOrder.length; i++){
            totalPrice += customer.customerOrder[i].foodPrice;
        }
        System.out.printf("Harga pesanan di meja %d adalah %d\n",tableNumber, totalPrice);
    }
}
