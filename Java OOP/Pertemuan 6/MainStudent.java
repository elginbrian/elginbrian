import java.util.*;
public class MainStudent {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while(true){
            System.out.print("Masukkan nama siswa: ");
            String name = input.nextLine();

            System.out.print("Masukkan alamat siswa: ");

            String address = input.nextLine();
            System.out.print("Masukkan umur siswa: ");

            int age = input.nextInt();
            input.nextLine();

            System.out.print("Masukkan nilai matematika: ");
            Double mathGrade = input.nextDouble();

            System.out.print("Masukkan nilai bahasa inggris: ");
            Double englishGrade = input.nextDouble();
        
            System.out.print("Masukkan nilai science: ");
            Double scienceGrade = input.nextDouble();

            Student student = new Student(name, address, age, mathGrade, englishGrade, scienceGrade);
        
            System.out.println();
            student.displayMessage();
            System.out.println( );

        }
        // Student anna = new Student();
        // anna.setName("Anna");
        // anna.setAddress("Malang");
        // anna.setAge(20);
        // anna.setMath(100);
        // anna.setScience(89);
        // anna.setEnglish(80);
    
        // //menggunakan constructor lain
        // System.out.println("===================");
        // Student chris = new Student("Chris", "Kediri", 21);
        // chris.setMath(70);
        // chris.setScience(60);
        // chris.setEnglish(90);
        // chris.displayMessage();
    
        // //siswa dengan nama anna dirubah informasi alamat dan umurnya melalui constructor
        // System.out.println("===================");
        // anna = new Student("anna", "Batu", 18);
        // anna.displayMessage();
    
        // //siswa denagan nama chris dirubah informasi alamat dan umurnya melalui method
        // System.out.println("===================");
        // chris.setAddress("Surabaya");
        // chris.setAge(22);
        // chris.displayMessage();
    }
}
