package MobyDickOpgaver;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

public class MobyDickRedone {
    private String[] arrayList;

    public MobyDickRedone() {
        this.arrayList = arrayList;
    }

    public String[] getArrayList() {
        return arrayList;
    }

    public void setArrayList(String[] arrayList) {
        this.arrayList = arrayList;
    }

    public void countWords(ArrayList<String> arrayList) {
        System.out.println(arrayList);

    }

    //Laver orderne i txt filen om til små bogstaver
    public static String[] convertWords(String[] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].replaceAll("([^a-zA-Z])", " ");
            arr[i] = arr[i].toLowerCase(Locale.ROOT);
        }
        return arr;
    }

    ////
    /*public static void countItems(HashSet arr) {
        HashSet<HashSet> set = new HashSet<>();
        set.add(arr);
        System.out.println(set.size());


    }

     */
}
