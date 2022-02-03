import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class arrayCompareMain {
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers in each array? ");
        int userInput = scanner.nextInt();

        int[] wordList1 = new int[userInput];
        int[] wordList2 = new int[userInput];

        System.out.println("Write in "+userInput+" numbers you would like in your first array: ");
        for (int i = 0; i < wordList1.length; i++)
        {
            int wordInput = scanner.nextInt();
            wordList1[i] = wordInput;
        }
        System.out.println("Wordlist 1 completed:");

        System.out.println("Write in "+userInput+" numbers you like in your second array: ");
        for (int i = 0; i < wordList2.length; i++)
        {

            wordList2[i] = scanner.nextInt();
        }

        System.out.println("Wordlist 2 completed:");
        System.out.println(Arrays.toString(wordList1));
        System.out.println(Arrays.toString(wordList2));

        compareArrays(wordList1,wordList2);
    }

    public static void compareArrays(int[] arr1, int[] arr2){
        int pair = 0;

        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]){
                    System.out.println("Found a pair in the two arrays: "+arr1[i]);
                    pair+=1;
                }
            }

        }
        if(pair == 0){
            System.out.println("There seemed to be no pairs between the two arrays");
        }
        else{
        System.out.println("The amount of pairs in the two arrays in total is: "+pair);
    }
    }
}
