package Country;

import Country.Country;

import java.util.ArrayList;

public class CountryMain {
    public static void main(String[] args) {
        ArrayList<Country> arrList = new ArrayList<>();
        Country country1 = new Country("Denmark",5,66,54.77f);
        Country country2 = new Country("Poland",12,66,54.77f);
        Country country3 = new Country("Sweden",7,66,54.77f);
        Country country4 = new Country("Norway",9,66,54.77f);
        Country country5 = new Country("Russia",15,66,54.77f);
        arrList.add(country1);
        arrList.add(country2);
        arrList.add(country3);
        arrList.add(country4);
        arrList.add(country5);
        System.out.println(arrList);

    }
}
