public class Book {
    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public static String of(String author, String title) {
        String books = author+ " " +title;
        return books;
    }
}
