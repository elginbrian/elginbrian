package practice.view;
import java.util.*;
import practice.controller.*;
import practice.model.customerModel;
import practice.model.foodModel;;

public class restaurant {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        tableListController tableList = new tableListController();
        orderController order = new orderController();
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
                    tableList.displayTable();
                    break;

                case 2:
                    System.out.print("Nomor meja: ");
                    int tableNumber = input.nextInt();
                    System.out.print("Nama pelanggan: ");
                    String name = input.next();

                    customerModel newCustomer = new customerModel(name, tableNumber);
                    tableList.addCustomer(newCustomer, tableNumber);
                    break;

                case 3:
                    System.out.print("Masukkan nomor meja: ");
                    tableNumber = input.nextInt();
                    order.displayMenu();

                    boolean continueOrder = true;
                    while(continueOrder) {
                        System.out.print("Masukkan pilihan: ");
                        select = input.nextInt();
                        if (select == 6) {
                            break;
                        }
                        order.addOrder(tableNumber, select);
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nomor meja: ");
                    tableNumber = input.nextInt();
                    tableList.deleteCustomer(tableNumber);
                    break;

                case 5:
                    System.out.print("Masukkan nomor meja: ");
                    tableNumber = input.nextInt();
                    order.countPrice(tableNumber);
                    break;
                case 6:
                    System.out.print("Nomor meja: ");
                    tableNumber = input.nextInt();
                    order.displayOrder(tableNumber);
                    break;

                case 0:
                    continueLoop = false;
                    break;
                default:
                    break;
            }
        }
    }
}
