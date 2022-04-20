public class Book {
    private String author;
    private String title;

    public static String of(String author, String title) {
        System.out.println("Autor " +author+ " Tytuł " +title);
        return author;
    }
}
