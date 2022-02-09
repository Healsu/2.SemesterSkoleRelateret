package MobyDickOpgaver;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class prøveConvert {


    public static void main(String[] args) {
        ArrayList<String> result = new ArrayList<>();

        try{
            BufferedReader reader = new BufferedReader(new FileReader("MobyDickOpgaver/txtFile.txt"));
            String readLine;

            while((readLine = reader.readLine()) != null){
                String[] currentLine = readLine.split(" ");
                convertWords(currentLine);


                for (int i = 0; i < currentLine.length; i++) {
                    result.add(currentLine[i]);

                }
            }
            System.out.println(result);



        }
        catch(Exception e){

        }


        }


        public static String[] convertWords(String[] arr){

            for (int i = 0; i < arr.length; i++) {
                arr[i] = arr[i].replaceAll("([^a-zA-Z])"," ");
                arr[i] = arr[i].toLowerCase(Locale.ROOT);
            }
            return arr;
        }
}





