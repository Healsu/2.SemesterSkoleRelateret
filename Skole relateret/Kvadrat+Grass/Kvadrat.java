import java.util.Scanner;

public class Kvadrat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Skriv et heltal:");
        int brugerInput = scanner.nextInt();

        result(brugerInput);
    }
    public static void result(int heltal){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hvilket tegn vil du bruge?");
        String tegn = scanner.nextLine();
        int line = 0;
        for (int i = 0; i < heltal; i++) {
            if(line >= 5){
                System.out.println();
                line=0;
        }
            System.out.print(tegn);
            line+=1;
        }
    }
}
