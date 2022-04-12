public class TrialMethod {
    public static void main(String[] args)
    {
        int [] names = new int [6];

        int numberOfElements = names.length;
        System.out.println("Liczba elementów tablicy = " +numberOfElements);
        System.out.println("Suma elementów:");
        int sumOfElements = 0;

        for ( int i=0; i<numberOfElements; i++) {
            names[i] = i+2;

            prtElements(i, numberOfElements, names[i]);

            sumOfElements = sumOfElements + names[i];
        }
        System.out.println( +sumOfElements);
    }

    public static void prtElements(int e, int number, int element) {
        if (e < number-1) {
            System.out.print (element+ " + ");
        }
        else {
            System.out.print (element+ " = ");
        }
    }
}
