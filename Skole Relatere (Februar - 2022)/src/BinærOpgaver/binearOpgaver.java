package BinærOpgaver;

import java.util.Scanner;

public class binearOpgaver {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        double result = 0;

        System.out.println("Binary here: ");
        String userInput = scanner.nextLine();

        for (int i = 0; i < userInput.length(); i++) {
            if (userInput.charAt(i) != 1 && userInput.charAt(i) != 0){
                System.out.println("The binary isnt only made of 1 and 0");
                break;
            }

        }

        for (int i = 0; i < userInput.length(); i++) {
            result = result * Math.pow(2,i) + Character.getNumericValue(userInput.charAt(i));

        }
        System.out.println(result);

    }
}
