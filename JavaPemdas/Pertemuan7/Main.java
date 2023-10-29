package JavaPemdas.Pertemuan7;

public class Main {
    public static void main(String[] args) {
        String nama = "Caca";

        switch (nama){
            case "Andi" : // case senitive
                System.out.println("Andi");
                break;
            case "Boni" :
            case "boni" : // not case sensitive
                System.out.println("Boni");
                break;
            default :
                System.out.println("Nama tidak tertera");

            // length, chartAt, substring
            String nama1 = "Budi";
            String nama2 = "Samsudin";

            int length = nama1.length();
            char character = nama2.charAt(0);
            String sub = nama2.substring(0,3);
            
            
        }
    }     
}
