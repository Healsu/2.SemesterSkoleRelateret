import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class sort {
    public static void main(String[] args) {
        String[] words = {"abekat","musefælde","ananas","slut","solskin"};

        //Begin sorting the list by alphabetical order
        Arrays.sort(words);

        //Sorting the array using a for loop for every word in the array "words"
        for (int i = 0, newSentence = words.length - 1; i < newSentence; i++, newSentence--) {
            String result = words[i];
            words[i] = words[newSentence];
            words[newSentence] = result;
    }
        //We finish off by creating a for each loop for every element in the new array created
        //in the earlier for-i loop
        for(String val : words)
            System.out.print(" "+val);
    }
}
