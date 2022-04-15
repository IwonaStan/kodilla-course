public class Loops {
    public static void main(String[] args) {
        int [] names = new int [6];

        int numberOfElements = names.length;
        System.out.println("Liczba elementów tablicy = " +numberOfElements);
        int sumOfElements = 0;

        for ( int i=0; i<numberOfElements; i++) {
            names[i] = i;
            sumOfElements = sumOfElements + names[i];
        }
        System.out.println("Suma elementów tablicy = " +sumOfElements);
    }
}