package JavaPemdas.Pertemuan9;
import java.util.*;
public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int amountProject = input.nextInt();

        double[] initialCapital  = new double[amountProject];
        double[] yearReturn      = new double[amountProject];
        double[] percentIncrease = new double[amountProject];
        double[] profit          = new double[amountProject];

        double bestProfit = profit[0];
        int bestProject = 0;

        for (int i = 0; i < amountProject; i++) {
            initialCapital[i]  = input.nextDouble();
            yearReturn[i]      = input.nextDouble();
            percentIncrease[i] = input.nextDouble();

            profit[i] = (initialCapital[i] * (Math.pow(((100 + percentIncrease[i])/100), yearReturn[i]))) - initialCapital[i];

            if (bestProfit < profit[i]){
                bestProfit = profit[i];
                bestProject = i + 1;
            }
        }

        System.out.printf("%d = %.2f", bestProject, bestProfit);
        System.out.println(Arrays.toString(initialCapital));
        System.out.println(Arrays.toString(yearReturn));
        System.out.println(Arrays.toString(percentIncrease));
        System.out.println(Arrays.toString(profit));
    }
}
