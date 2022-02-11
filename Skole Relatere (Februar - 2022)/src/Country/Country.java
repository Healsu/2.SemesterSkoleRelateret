package Country;

public class Country {
    String name;
    int size;
    int BNP;
    public float latitude;

    public Country(String name, int size, int BNP, float latitude) {
        this.name = name;
        this.size = size;
        this.BNP = BNP;
        this.latitude = latitude;
    }
    public String toString() {
        return "Country.Country{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", BNP=" + BNP +
                ", latitude=" + latitude +
                '}';
    }

    public int compareTo(Country o){
        if (size < o.size) return -1;
        else if (size > o.size) return 1;
        else return 0;
    }

}
