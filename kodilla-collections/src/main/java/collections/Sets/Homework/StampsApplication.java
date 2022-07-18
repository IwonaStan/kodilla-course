package collections.Sets.Homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {

        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("First_stamp",1.5, 2.5, true));
        stamps.add(new Stamp("Second_stamp",1.3, 2.7, false));
        stamps.add(new Stamp("Third_stamp",1.7, 2.3, true));
        stamps.add(new Stamp("Fourth_stamp",2.0, 2.5, false));
        stamps.add(new Stamp("First_stamp",1.5, 2.5, true));
        stamps.add(new Stamp("Sixth_stamp",2.3, 2.8, false));
        System.out.println(stamps.size());

        for (Stamp stamp:stamps) System.out.println(stamp);
    }
}
