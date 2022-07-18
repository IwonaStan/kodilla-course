package collections.adv.maps.Homework;

import java.util.ArrayList;
import java.util.List;

public class School {

    private List <Integer> studentsNumber = new ArrayList<>();

    public School(int... studentsNumber) {
        for (int school : studentsNumber)
            this.studentsNumber.add(school);
    }

    public int getStudentsSum() {
        int studentsSum = 0;
        for (int sum : studentsNumber)
            studentsSum += sum;
        return studentsSum;
    }

    @Override
    public String toString() {
        return "School{" +
                "studentsNumber=" + studentsNumber +
                '}';
    }
}
