package MobyDickOpgaver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MobyDick {
    public static void main(String[] args) {
        //Make a program that store every unique word + make it so you can search for a specefic word after
        String[] arrayList = {"amoung","us","amoung","hej","mogus","mogus","mogus","hello"};

        Arrays.sort(arrayList);
        Integer[] countArray = countItems(arrayList);
        int num = 0;
        for (int i = 0; i < countArray.length; i++) {
            num += countArray[i]-1;
            System.out.println(arrayList[num]+": "+countArray[i].toString());

        }
    }




    public static Integer[] countItems(String[] arr){
        List<Integer> itemCount = new ArrayList<Integer>();
        int counter = 0;
        String lastItem = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(lastItem)){
                counter++;
            }
            else{
                itemCount.add(counter);
                counter = 1;
            }
            lastItem = arr[i];
        }
        itemCount.add(counter);

        return itemCount.toArray(new Integer[itemCount.size()]);
    }
}
