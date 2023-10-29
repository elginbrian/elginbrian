package JavaPemdas.Pertemuan10;
import java.util.*;
public class Main2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String power;
        int channel = 1;
        int channelPrev = 1;
        int volume = 50;
        int volumePrev = 50;

        do {
            power = input.next();
        } while (!power.equals("POWER"));
        
        boolean continueLoop = true;
        System.out.println("TV ON");

        while (continueLoop){
            String select = input.nextLine();
            String keyword[] = select.split(" ");

            switch (keyword[0]){
                case "CHANNEL" :
                    channelPrev = channel;
                    switch (keyword[1]){
                        case "UP" :
                            channel += 1;
                            break;
                        case "DOWN" :
                            channel -= 1;
                            break;
                        default : // ERROR JIKA KEYWORD[1] BUKAN ANGKA
                            channel = Integer.parseInt(keyword[1]);
                            break;
                    }
                    if (channel >=1 && channel <= 30){
                        System.out.printf("Channel sekarang: %d\n", channel);
                    } else {
                        channel = channelPrev;
                        System.out.println("Channel tidak valid");
                    } break;

                case "VOLUME" :
                    volumePrev = volume;
                    switch (keyword[1]){
                        case "UP" :
                            volume += 5;
                            break;
                        case "DOWN" :
                            volume -= 5;
                            break;
                    }
                    if (volume >= 0 && volume <= 100){
                        System.out.printf("Volume sekarang: %d\n", volume);
                    } else {
                        volume = volumePrev;
                        System.out.println("Volume tidak valid");
                    } break;

                case "MUTE" :
                    System.out.println("Volume mute");
                    break;

                case "UNMUTE" :
                    System.out.printf("Volume sekarang: %d\n", volume);
                    break;

                case "PREV" :
                    if (keyword[1].equals("CHANNEL")){
                        channel = channelPrev;
                        System.out.printf("Channel sekarang: %d\n", channel);
                    } break;

                case "POWER" :
                    System.out.println("TV OFF");
                    continueLoop = false;      
                    break;
            } 
        }
    }
}
