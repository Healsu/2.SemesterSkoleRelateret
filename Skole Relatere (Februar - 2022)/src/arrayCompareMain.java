import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class arrayCompareMain {
    public static void main(String[] args)
    {
        int count = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many words in each array? ");
        int userInput = scanner.nextInt();

        String[] wordList1 = new String[userInput];
        String[] wordList2 = new String[userInput];

        System.out.println("Write in "+userInput+" words you would like in your first array: ");
        for (int i = 0; i < wordList1.length; i++)
        {
            //Første input er altid blank?????
            System.out.println(count+". ");
            String wordInput = scanner.nextLine();
            wordList1[i] = wordInput;

            count+=1;

        }
        System.out.println("Wordlist 1 completed:");

        System.out.println("Write in "+userInput+" words you like in your second array: ");
        for (int i = 0; i < wordList2.length; i++)
        {
            System.out.println(count+". ");
            count+=1;
            wordList2[i] = scanner.nextLine();
        }

        System.out.println("Wordlist 2 completed:");
        System.out.println(Arrays.toString(wordList1));
        System.out.println(Arrays.toString(wordList2));
    }
}
