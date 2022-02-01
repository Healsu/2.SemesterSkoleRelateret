import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<String> idk = new ArrayList<>();
        idk.add("Among");
        idk.add("Us");
        idk.add("Hello");
        idk.add("Random");
        String word = "Hello";


        System.out.println(doesArraylistContainString(idk,word));
    }
    public static boolean doesArraylistContainString(ArrayList arList, String word){

        if( arList.contains(word)){
            return true;
        }
        else{
            return false;
        }



    }

}
