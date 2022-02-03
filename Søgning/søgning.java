import com.sun.nio.sctp.HandlerResult;

import java.util.Scanner;

public class søgning {
    public static void main(String[] args) {
        int count = 1;
        Scanner scanner = new Scanner(System.in);
        String[] wordList = new String[5];


        //Skaber et for loop til at vælge 5 ord i ens array
        System.out.println("Write in 5 words you would like in your list: ");
        for (int i = 0; i < wordList.length; i++) {
            System.out.println(count);
            count+=1;
            wordList[i] = scanner.nextLine();
        }

        //Sender det videre til den nye metode som kun kan tage imod arrays
        System.out.println(wordCheck(wordList));


    }
    public static int wordCheck(String[] wordList) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What word will you check for in the string? ");
        String userInput = scanner.nextLine();
        int counter = 0;



        //Ud fra scanneren sammenligner vi det med hele arrayet ved hjælp af et for-i loop
        try {
            for (int i = 0; i < wordList.length; i++) {

                if (wordList[i].equalsIgnoreCase(userInput)) {
                    System.out.println("The word " + "'" + userInput + "'" + " is in the array on index: " + i);
                    return i;
                }
            }
            if(counter <= 0){
                throw new Exception();
            }

        } catch (Exception e) {
            return -1;
        }
        return 80085;
    }
}
