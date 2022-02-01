public class Book {
    private int ISBN;
    private String titel;
    private int releaseYear;

    public Book(int ISBN, String titel, int releaseYear) {
        this.ISBN = ISBN;
        this.titel = titel;
        this.releaseYear = releaseYear;
    }

    public int getISBN() {
        return ISBN;
    }
    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }
    public String getTitel() {
        return titel;
    }
    public void setTitel(String titel) {
        this.titel = titel;
    }
    public int getReleaseYear() {
        return releaseYear;
    }
    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return "Books{" +
                "ISBN=" + ISBN +
                ", titel='" + titel + '\'' +
                ", releaseYear=" + releaseYear +
                '}';
    }
}
