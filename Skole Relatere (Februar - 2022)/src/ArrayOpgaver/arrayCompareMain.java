package ArrayOpgaver;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class arrayCompareMain {
    public static void main(String[] args)
    {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers in each array? ");
        int userInput = scanner.nextInt();

        int[] wordList1 = new int[userInput];
        int[] wordList2 = new int[userInput];

        System.out.println("Write in "+userInput+" numbers you would like in your first array: ");
        for (int i = 0; i < wordList1.length; i++)
        {

            wordList1[i] = rand.nextInt(10);
        }
        System.out.println("Wordlist 1 completed:");

        System.out.println("Write in "+userInput+" numbers you like in your second array: ");
        for (int i = 0; i < wordList2.length; i++)
        {

            wordList2[i] = rand.nextInt(10);
        }

        System.out.println("Wordlist 2 completed:");
        System.out.println(Arrays.toString(wordList1));
        System.out.println(Arrays.toString(wordList2));

        System.out.println(intersect(wordList1,wordList2));
    }




    public static ArrayList intersect(int[] arr1, int[] arr2){
        ArrayList<Integer> arrayResult = new ArrayList<>();
        int pair = 0;

        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println("Found a pair in the two arrays: " + arr1[i]);
                    pair += 1;
                    arrayResult.add(arr2[j]);
                }
            }
        }


        if(pair == 0){
            System.out.println("There seemed to be no pairs between the two arrays");
        }
        else{
            System.out.println("The amount of pairs in the two arrays in total is: "+pair);
    }

        return arrayResult;
    }
}
