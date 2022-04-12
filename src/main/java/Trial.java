public class Trial {
    public static void main(String[] args)
    {
        int [] names = new int [6];

        int numberOfElements = names.length;
        System.out.println("Liczba elementów tablicy = " +numberOfElements);
        System.out.println("Suma elementów:");
        int sumOfElements = 0;

        for ( int i=0; i<numberOfElements; i++) {
            names[i] = i+2;
            if (i<numberOfElements-1) {
                System.out.print (names[i]+ " + ");
            }
            else {
                System.out.print (names[i]+ " = ");
            }
            sumOfElements = sumOfElements + names[i];
        }
        System.out.println( +sumOfElements);
    }
}
