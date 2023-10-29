package JavaPemdas.Pertemuan9;
import java.util.*;
public class Bjir {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang array: ");
        int arrayLength = input.nextInt();
        int[] array = new int[arrayLength];
        int total = 0;
        int totalGanjil = 0;
        int biggest = 0;
        
        for (int i = 0; i < arrayLength; i++){
            System.out.printf("Masukkan isi index ke %d :", i);
            array[i] = input.nextInt();

            total = total + array[i];

            if (biggest < array[i]){
                biggest = array[i];
            }
            if (array[i] % 2 != 0){
                totalGanjil = totalGanjil + array[i];
            }
        }
        System.out.println("Array :" + Arrays.toString(array));
        System.out.println("Total :" + total);
        System.out.println("Total ganjil :" + totalGanjil);
    }
}