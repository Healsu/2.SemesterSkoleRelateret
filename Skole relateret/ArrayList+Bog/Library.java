import java.util.ArrayList;
import java.util.Random;

public class Library {

    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<>();
        Book HarryPot = new Book(15,"Harry Pot - The non legalised story",2012);
        Book Kanye = new Book(39,"How i Became President - Kanye West",1984);
        Book Trump = new Book(1,"Business 101 by yours truly",2020);
        bookList.add(HarryPot);
        bookList.add(Kanye);
        bookList.add(Trump);

        Book RandomBook = new Book(39,"How i met your father 2",1990);


        Bibliotek biblio = new Bibliotek(bookList);
        biblio.isSameBook(RandomBook);
    }


}
