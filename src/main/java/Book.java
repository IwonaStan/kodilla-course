public class Book {
     private String author;
     private String title;

     public static Book of(String a, String t) {
         Book book = new Book();
         book.author = a;
         book.title = t;
         System.out.println(book.author+ " " +book.title);
         return book;
     }
}