import java.util.HashSet;

public class hashOpgave {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Osman");
        hashSet.add("Amoung");
        hashSet.add("Hej");
        hashSet.remove("Amoung");
        System.out.println(hashSet);
    }
}
