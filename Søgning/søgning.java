import java.util.Scanner;

public class søgning {
    public static void main(String[] args) {
        int count = 1;
        Scanner scanner = new Scanner(System.in);
        String[] wordList = new String[5];

        System.out.println("Write in 5 words you would like in your list: ");
        for (int i = 0; i < wordList.length; i++) {
            System.out.println(count+". ");
            count+=1;
            wordList[i] = scanner.nextLine();
        }

    }
    public static void wordCheck(String[] wordList){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What word will you check for in the string? ");
        String userInput = scanner.nextLine();

        for (int i = 0; i < wordList.length; i++) {
            if (wordList[i].equalsIgnoreCase(userInput)){

            }
        }
    }
}
