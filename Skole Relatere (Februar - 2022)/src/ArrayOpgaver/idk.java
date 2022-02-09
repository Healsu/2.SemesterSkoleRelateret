package ArrayOpgaver;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class idk {
    public static void main(String[] args) {

        Random randGen = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedlist = new LinkedList<>();

        for (int i = 0; i < 170000; i++) {
            arrayList.add(randGen.nextInt(100));
        }
        for (int i = 0; i < 170000; i++) {
            linkedlist.add(randGen.nextInt(100));

        }
        long start1 = System.nanoTime();
        arrayList.add(3,17);
        long start2 = System.nanoTime();
        long delta = start2 - start1;
        System.out.println("ArrayList: "+delta*1000000);

        long start3 = System.nanoTime();
        linkedlist.add(3,17);
        long start4 = System.nanoTime();
        long delta2 = start4 - start3;
        System.out.println("LinkedList: "+delta2*1000000);
    }
}