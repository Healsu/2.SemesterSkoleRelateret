import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class SentenceMixer {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a sentence in: ");
        String sentence = scanner.nextLine();

        checkWord(sentence);
    }

    public static void checkWord(String sentence){
        String[] arrayList = sentence.split(" ");

        String newSentence = "";

        for (int i = 0; i < arrayList.length; i++) {
            if(arrayList[i].toUpperCase().equals(arrayList[i])){

                newSentence+=arrayList[i]+" ";
            }
            else{
                if(arrayList[i].length() <= 3){
                    arrayList[i].toLowerCase();
                    String output = arrayList[i].substring(0,1).toUpperCase() + arrayList[i].substring(1);

                    newSentence+=output+" ";
                }
                else{
                    arrayList[i].toLowerCase();
                    newSentence+=arrayList[i]+" ";
                }

            }

        }
        System.out.println(newSentence);
    }
}
