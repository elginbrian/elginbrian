package JavaPemdas.Pertemuan7;
import java.util.*;
public class test2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String username = input.next();
        String char1 = username.substring(0,1);
        String char2 = username.substring(1,2);
        
        char2 = char2.toLowerCase();

        switch (char1){
            case "@" :
                int usernameLength = username.length() - 1; 
                String reward = "";
                switch (char2) {
                    case "a":
                    case "i":
                    case "u":
                    case "e":
                    case "o":
                        if (usernameLength % 2 == 0){
                            reward = "Meet n Greet";
                        } else {
                            reward = "Merchandise";
                        } break;
                    default :
                        if (usernameLength % 2 == 0){
                            reward = "Pulsa";
                        } else {
                            reward = "E-Money";
                        } break;
                } 
                System.out.printf("Reward anda : %s", reward);
                break;
            default :
                System.out.println("Username tidak valid");
                break;
        }
        
    }
}
