import java.util.*;

public class main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("Opsi: 1) Luas Lingkaran, 2) Keliling Lingkaran");
            System.out.print("Masukkan pilihan anda : ");
            int option = input.nextInt();
            double result = 0;

            if(option == 1){
                System.out.print("Masukkan jari-jari : ");
                double radius = input.nextDouble();
                result = Math.pow(radius, 2) * 3.14;
            
            } else if(option == 2){
                System.out.print("Masukkan diameter : ");
                double diameter = input.nextDouble();
                result = diameter * 3.14;
            }
            
            System.out.printf("Hasil : %f\n", result);
            System.out.print("Ingin melanjutkan? (y/n) : ");
            String answer = input.next();

            if(answer.equalsIgnoreCase("n")){
                break;
            }
        }
        
    }
}
