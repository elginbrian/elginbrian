package JavaPemdas.Pertemuan4;
import java.io.*;
import java.util.*;

public class Main2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num = input.nextInt();
        String stringNum = Integer.toString(num);
    
        while (stringNum.length() < 3){
            String stringNumAddZero = "0" + stringNum;
            stringNum = stringNumAddZero;
        }
        if (stringNum.length() > 3){
            stringNum = stringNum.substring(0,2);
        }

        char index0 = stringNum.charAt(0);
        char index1 = stringNum.charAt(1);
        char index2 = stringNum.charAt(2);
        
        int intIndex0 = Character.getNumericValue(index0);
        int intIndex1 = Character.getNumericValue(index1);
        int intIndex2 = Character.getNumericValue(index2);
        
        int sum = intIndex0 + intIndex1 + intIndex2;
        
        System.out.println(sum);
    }
}