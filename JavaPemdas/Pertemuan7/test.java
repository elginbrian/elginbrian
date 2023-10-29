package JavaPemdas.Pertemuan7;
import java.util.*;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nim = input.nextLine();
        nim = nim.replaceAll(" ","");
        
        if (nim.matches("\\d{15}")) {
            String angkatan = nim.substring(0,2);
            String fakultas = nim.substring(2,5);
            String prodi = nim.substring(5,8);
            String jalur = nim.substring(8,12);
            String nomor = nim.substring(12);

            switch (fakultas) {
            case "514" :
                fakultas = "FMIPA";
                break;
            case "515" :
                fakultas = "FILKOM";
                break;
            default :
                fakultas = "Unknown";
                break;
            } 
            switch (prodi) {
                case "050" :
                    prodi = "Biologi";
                    break;
                case "051" :
                    prodi = "Kimia";
                    break;
                case "060" :
                    if (fakultas.equals("FILKOM")){
                        prodi = "Pendidikan Teknologi Informasi";
                    } else if (fakultas.equals("FMIPA")){
                        prodi = "Fisika";
                    }
                    break;
                case "061" :
                    prodi = "Matematika";
                    break;
                default :
                    prodi = "Unknown";
                    break;
                case "020" :
                    prodi = "Teknik Informatika";
                    break;
                case "030" :
                    prodi = "Teknik Komputer";
                    break;
                case "040" :
                    prodi = "Sistem Informasi";
                    break;
                case "070" :
                    prodi = "Teknologi Informasi";
                    break;
            }
            switch (jalur) {
                case "1111" :
                    jalur = "SNBP";
                    break;
                case "0111" :
                    jalur = "SNBT";
                    break;
                case "7111" :
                    jalur = "Mandiri";
                    break;
                default :
                    jalur = "Unknown";
                    break;
            }   
            System.out.printf("Angkatan: 20%s \n", angkatan); 
            System.out.printf("Fakultas: %s \n", fakultas);
            System.out.printf("Program studi: %s \n", prodi);
            System.out.printf("Jalur masuk: %s \n", jalur);
            System.out.printf("Nomor mahasiswa: %s \n", nomor);
        } else {
            System.out.println("Unknown");
        }
    }
}