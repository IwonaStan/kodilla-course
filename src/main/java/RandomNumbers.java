import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {

        int maxSum = 5000;
        int wynikMin, wynikMax = 0;
        int losowa, suma= 0;

        Random losowanie = new Random();
        losowa = losowanie.nextInt(30);
        suma = wynikMax = wynikMin= losowa;

        while (suma < maxSum) {
            losowa = losowanie.nextInt(30);
            suma = suma + losowa;

            if (wynikMin>losowa) {
                wynikMin = losowa;
            }
            wynikMax = maxLiczba(losowa, wynikMax);
            wynikMin = minLiczba(losowa, wynikMin);
         }

        System.out.println(wynikMin);
        System.out.println(wynikMax);
    }
    public static int maxLiczba(int los, int max) {
        if (max<los) {
            max = los;
            }
        return max;
    }
    public static int minLiczba(int los, int min) {
        if (min > los) {
            min = los;
        }
        return min;
    }
}


