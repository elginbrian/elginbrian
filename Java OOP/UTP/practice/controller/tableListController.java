package practice.controller;

public class tableListController extends customerController{
     public void displayTable(){
        System.out.println("Daftar Meja:");
        for(int i = 0; i < super.customerArray.length; i++){
            if(super.customerArray[i].customerName.equals("")){
                System.out.printf("Meja %d (kosong)\n", i+1);
            } else {
                System.out.printf("Meja %d (terisi oleh pelanggan %s)\n", i+1, super.customerArray[i].customerName);
            }
        }
     }
}
