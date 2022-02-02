import java.util.Arrays;
import java.util.Random;

public class prøve {
    public static void main(String[] args) {

        Random randGen = new Random();
        myArray myArr = new myArray();
        System.out.println(myArr);

        int[]arr = new int[10];

        for (int i = 0; i < 20; i++) {
            myArr.add(randGen.nextInt(1000));

        }
        System.out.println(myArr.toString());

        for (int i = 0; i < myArr.getElements(); i++) {
            System.out.println(myArr.get(i));
        }


    }


    private static int[] increaseArraySize(int[] arr){

        int length = arr.length;
        int[] newArray = new int[length+10];


        for (int i = 0; i < (arr.length); i++) {
            newArray[i] = arr[i];
        }

        for (int i = arr.length; i < (arr.length+10); i++) {
            newArray[i] = 0;
        }


        return newArray;

    }
}
