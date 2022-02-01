import java.util.ArrayList;

public class Bibliotek {
    private ArrayList<Book> biblio;

    public Bibliotek(ArrayList<Book> biblio) {
        this.biblio = biblio;
    }

    public ArrayList<Book> getBiblio() {
        return biblio;
    }

    public void setBiblio(ArrayList<Book> biblio) {
        this.biblio = biblio;
    }

    public boolean isSameBook(Book bog){

      for (Book b : this.biblio){
          if(bog.getISBN() == b.getISBN()){
              return true;
          }
      }
      return false;
    }

    @Override
    public String toString() {
        return "Bibliotek{" +
                "biblio=" + biblio +
                '}';
    }
}
