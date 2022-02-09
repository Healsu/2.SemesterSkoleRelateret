package ArrayOpgaver;

import java.util.ArrayList;
import java.util.Random;

public class CompareArray {
    public static void main(String[] args) {
        Random rand = new Random();
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        ArrayList<Integer> arr3 = new ArrayList<>();

        for (int i = 0; i < 30; i++) {
            arr1.add(rand.nextInt(100));
        }
        for (int i = 0; i < 30; i++) {
            arr2.add(rand.nextInt(100));
        }


    }
}
