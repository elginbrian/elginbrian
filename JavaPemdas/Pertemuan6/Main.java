package JavaPemdas.Pertemuan6;
public class Main {
    public static void main(String[] args) {
        // If Else
        int a = 5;
        int b = 5;

        if (a == b){
            System.out.println("a sama dengan b");
        } else {
            System.out.println("a tidak sama dengan b");
        }

        // == -> sama dengan
        // != -> tidak sama dengan
        // >= -> lebih dari sama dengan
        // <= -> kurang dari sama dengan
        // < -> kurang dari
        // > -> lebih dari

        int c = 6;
        int d = 3;
        if (c < d){
            System.out.println("c kurang dari d");
        } else {
            System.out.println("c lebih dari d");
        }

        int jam = 14;
        if (jam < 12){
            System.out.println("Pagi");
        } else if (jam < 16){
            System.out.println("Siang");
        } else if (jam < 18){
            System.out.println("Sore");
        } else {
            System.out.println("Malam");
        }

        int umur = 10;
        if (umur < 5){
            System.out.println("Balita");
        } else if (umur < 10){
            System.out.println("anak kecil");
        } else if (umur < 18){
            System.out.println("remaja");
        }

        String nama = "Alya";
        if (nama.equals("Alya")){
            System.out.println("Sama");
        }

        String nama2 = "Ayu";
        if (nama2.equalsIgnoreCase("Ayu")){
            System.out.println("Sama");
        }

        // ternary
        int x = 10;
        int y = 20;
        String num = (a < b) ? "a kurang dari b" : "a lebih dari b";
        System.out.println(num);

        // nested if
        
    }
}
