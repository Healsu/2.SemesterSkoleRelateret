import java.util.Scanner;

public class grassMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is current grass height? ");
        double userInputGrass = scanner.nextDouble();
        System.out.println("What is the max height for the grass? ");
        double userInputGrassMax = scanner.nextDouble();

        Grass myGrass = new Grass(userInputGrass,userInputGrassMax);

        myGrass.checkGrass();
    }
}
