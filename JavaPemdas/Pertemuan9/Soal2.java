package JavaPemdas.Pertemuan9;
import java.util.*;
public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double cumulativeValue = 0;

        while (true){
            String operator = input.next();

            if (operator.equals("SELESAI")){
                System.out.printf("%.1f\n", cumulativeValue);
                break;

            } else if (!operator.equals("TAMBAH") && !operator.equals("KURANG") && !operator.equals("KALI") && !operator.equals("BAGI")) {
                System.out.printf("%.1f\n", cumulativeValue);
                input.nextLine();

            } else {
                double value = input.nextDouble();
                input.nextLine();

                switch(operator){
                    case "TAMBAH" :
                        cumulativeValue += value;
                        break;
                    case "KURANG" :
                        cumulativeValue -= value;
                        break;
                    case "KALI" :
                        cumulativeValue *= value;
                        break;
                    case "BAGI" :
                        if (value == 0.0){
                            cumulativeValue = 0.0;

                        } else {
                            cumulativeValue /= value;
                            break;
                        }
                }
                System.out.printf("%.1f\n", cumulativeValue);
            }
        }
    }
}
