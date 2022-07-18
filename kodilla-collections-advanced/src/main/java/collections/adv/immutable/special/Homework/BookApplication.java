package collections.adv.immutable.special.Homework;

public class BookApplication {
    public static void main(String[] args) {
        Book book1 = BookManager.createBook("Lalka", "Bolesław Prus");
        Book book2 = BookManager.createBook("Lalka", "Bolesław Prus");
        System.out.println(book1+" & "+book2+"\nMetoda ==:"+(book1==book2)+"  Metoda equals:"+book1.equals(book2));;
        Book book3 = BookManager.createBook("Antek", "Bolesław Prus");
        System.out.println(book1+" & "+book3+"\nMetoda ==:"+(book1==book3)+"  Metoda equals:"+book1.equals(book3));
        System.out.println(book2+" & "+book3+"\nMetoda ==:"+(book2==book3)+"  Metoda equals:"+book2.equals(book3));
        Book book4 = BookManager.createBook("Antek", "Bolesław Prus");
        System.out.println(book1+" & "+book4+"\nMetoda ==:"+(book1==book4)+"  Metoda equals:"+book1.equals(book4));
        System.out.println(book2+" & "+book4+"\nMetoda ==:"+(book2==book4)+"  Metoda equals:"+book2.equals(book4));
        System.out.println(book3+" & "+book4+"\nMetoda ==:"+(book3==book4)+"  Metoda equals:"+book3.equals(book4));
        Book book5 = BookManager.createBook("Potop", "Henryk Sienkiewicz");
        System.out.println(book1+" & "+book5+"\nMetoda ==:"+(book1==book5)+"  Metoda equals:"+book1.equals(book5));
        System.out.println(book2+" & "+book5+"\nMetoda ==:"+(book2==book5)+"  Metoda equals:"+book2.equals(book5));
        System.out.println(book3+" & "+book5+"\nMetoda ==:"+(book3==book5)+"  Metoda equals:"+book3.equals(book5));
        System.out.println(book4+" & "+book5+"\nMetoda ==:"+(book4==book5)+"  Metoda equals:"+book4.equals(book5));
    }
}
