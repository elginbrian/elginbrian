package practice2;
import java.util.*;

public class LatihanUTP {
    class foodModel{
        String foodName = "";
        int foodPrice = 0;

        public foodModel(String foodName, int foodPrice){
            this.foodName = foodName;
            this.foodPrice = foodPrice;
        }
        public foodModel(){}
    }

    class customerModel{
        String customerName = "";
        foodModel[] customerOrder = {};

        public customerModel(String customerName){
            this.customerName = customerName;
        }

        public customerModel(){}
    }

    class tableModel{
        int tableNumber = 0;
        boolean status = false;
        customerModel customer = new customerModel();

        public tableModel(int tableNumber, customerModel customer){
            this.tableNumber = tableNumber;
            this.status = true;
            this.customer = customer;
        }

        public tableModel(){}
    }

    class tableController{
        protected tableModel[] tableArray = {
            new tableModel(),
            new tableModel(),
            new tableModel(),
            new tableModel(),
            new tableModel(),
            new tableModel(),
            new tableModel(),
            new tableModel(),
            new tableModel(),
            new tableModel(),
        };

        public void addCustomer(int tableNum, String customerName){
            int tableIndex = tableNum - 1;

            if(!tableArray[tableIndex].customer.customerName.equals("")){
                customerModel customer = new customerModel(customerName);
                this.tableArray[tableIndex] = new tableModel(tableNum, customer);
            } else {
                System.out.println("Meja sudah terisi");
            }
        }

        public void deleteCustomer(int tableNum){
            int tableIndex = tableNum - 1;
            this.tableArray[tableIndex] = new tableModel();
        }

        public void displayTable(){
            System.out.println("Daftar Meja:");
            for(int i = 0; i < tableArray.length; i++){
                if(tableArray[i].customer.customerName.equals("")){
                    System.out.printf("Meja %d (kosong)\n", i+1);
                } else {
                    System.out.printf("Meja %d (terisi oleh pelanggan %s)\n", i+1, tableArray[i].customer.customerName);
                }
            }
         }
    }

    class orderController extends tableController{
        private foodModel[] foodArray = {
            new foodModel("Nasi Goreng" , 15000), 
            new foodModel("Mie Goreng"  , 15000), 
            new foodModel("Capcay"      ,20000),
            new foodModel("Bihun Goreng", 17000),
            new foodModel("Ayam Koloke" , 25000)
        };

        public void addOrder(int tableNum, int orderNum){
            foodModel newOrder       = foodArray[orderNum - 1];
            foodModel[] customerOrderArray = super.tableArray[tableNum - 1].customer.customerOrder;
            foodModel[] newCustomerOrderArray = new foodModel[customerOrderArray.length + 1];
            
            for(int i = 0; i < customerOrderArray.length; i++){
                newCustomerOrderArray[i] = customerOrderArray[i];
            }
            newCustomerOrderArray[customerOrderArray.length] = newOrder;

            if(!super.tableArray[tableNum - 1].customer.customerName.equals("")){
                super.tableArray[tableNum - 1].customer.customerOrder = newCustomerOrderArray;
            } else {
                System.out.println("Meja belum terisi oleh pelanggan");
            }   
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

        public void displayOrder(int tableNum){
            customerModel customer = super.tableArray[tableNum - 1].customer;
            for(int i = 0; i < customer.customerOrder.length; i++){
                System.out.printf("Meja %d - %s memesan %s seharga %d\n", tableNum, customer.customerName, customer.customerOrder[i].foodName, customer.customerOrder[i].foodPrice);
            }
            if(customer.customerOrder.length == 0){
                System.out.printf("Meja %d tidak memiliki pesanan\n", tableNum);
            }
        }

        public void countPrice(int tableNum){
            int totalPrice = 0;
            customerModel customer = super.tableArray[tableNum - 1].customer;
            for(int i = 0; i < customer.customerOrder.length; i++){
                totalPrice += customer.customerOrder[i].foodPrice;
            }
            System.out.printf("Total harga meja %d adalah Rp. %d\n", tableNum, totalPrice);
            
            if(customer.customerOrder.length == 0){
                System.out.printf("Meja %d tidak memiliki pesanan\n", tableNum);
            }
        }
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        LatihanUTP UTP = new LatihanUTP();
        LatihanUTP.orderController controller = UTP.new orderController();
        boolean continueLoop = true;

        while(continueLoop){
            System.out.println("1. Tampilkan daftar meja");
            System.out.println("2. Tambah pelanggan");
            System.out.println("3. Tambah pesanan");
            System.out.println("4. Hapus pelanggan");
            System.err.println("5. Hitung harga pesanan");
            System.out.println("6. Tampilkan pesanan di meja");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan: ");
            int select = input.nextInt();

            switch(select){
                case 1:
                    controller.displayTable();
                    break;

                case 2:
                    System.out.print("Nomor meja: ");
                    int tableNumber = input.nextInt();
                    System.out.print("Nama pelanggan: ");
                    String name = input.next();   

                    LatihanUTP.customerModel newCustomer = UTP.new customerModel(name);
                    controller.addCustomer(tableNumber, name);
                    break;

                case 3:
                    System.out.print("Masukkan nomor meja: ");
                    tableNumber = input.nextInt();
                    controller.displayMenu();  

                    boolean continueOrder = true;
                    while(continueOrder) {
                        System.out.print("Masukkan pilihan: ");
                        select = input.nextInt();
                        if (select == 6) {
                            break;
                        }
                        controller.addOrder(tableNumber, select);
                    }
                    break;    

                case 4:
                    System.out.print("Masukkan nomor meja: ");
                    tableNumber = input.nextInt();
                    controller.deleteCustomer(tableNumber);
                    break;

                case 5:
                    System.out.print("Masukkan nomor meja: ");
                    tableNumber = input.nextInt();
                    controller.countPrice(tableNumber);
                    break; 
                    
                case 6:
                    System.out.print("Nomor meja: ");
                    tableNumber = input.nextInt();
                    controller.displayOrder(tableNumber);    
                    break;

                case 0:
                    continueLoop = false;
                    break;
                    
                default:
                    break;    
            }
        }

        input.close();
    }
}
