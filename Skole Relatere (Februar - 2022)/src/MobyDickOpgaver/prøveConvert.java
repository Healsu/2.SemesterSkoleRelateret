package MobyDickOpgaver;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;

public class prøveConvert {

    static ArrayList<String> result = new ArrayList<>();
    static MobyDickRedone moby = new MobyDickRedone();
    static Set set = new HashSet();
    static HashMap<String, Integer> hMap = new HashMap<String, Integer>();

    public static void main(String[] args) {

        //Læser txt filen
        try{
            BufferedReader reader = new BufferedReader(new FileReader("Skole Relatere (Februar - 2022)/src/MobyDickOpgaver/txtFile.txt"));
            String readLine;

            //Fjerne mellemrum fra listen af arrayet
            while((readLine = reader.readLine()) != null){
                String[] currentLine = readLine.split(" ");
                currentLine = moby.convertWords(currentLine);


                //Tilføjer hvert ord i txt filen
                for (int i = 0; i < currentLine.length; i++) {
                    if(currentLine[i].equals("") == false) {
                        result.add(currentLine[i]);
                        set.add(currentLine[i]);
                    }

                }
            }

        }
        catch(Exception e){
            e.printStackTrace();
            System.out.println("FILE NOT FOUND");
        }


        addWordCounter();


        }
        public static void addWordCounter(){

        //sorterer alle de forskellige ord ud fra hvor mange gange de bliver nævnt
            for (int i = 0; i < result.size(); i++) {
                if (hMap.containsKey(result.get(i))){
                    hMap.put(result.get(i), (hMap.get(result.get(i)) +1 ));
                }else{
                    hMap.put(result.get(i), 1);
                }
            }
            System.out.println(hMap);
        }
}






