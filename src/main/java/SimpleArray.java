public class SimpleArray {
    public static void main (String[] args) {

        String [] names = new String [5];

        names[0] = "Asia";
        names[1] = "Basia";
        names[2] = "Kasia";
        names[3] = "Marek";
        names[4] = "Czarek";

        String name = names[3];
        System.out.println(name);

        int numberOfElements = names.length;
        System.out.println("Moja tablica ma rozmiar " +numberOfElements);

        for (int i=0; i<numberOfElements; i++)
        { System.out.println ("Element " +i+ " tablicy " +names[i]);
        }
    }
}
