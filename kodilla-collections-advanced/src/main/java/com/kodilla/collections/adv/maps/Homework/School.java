package com.kodilla.collections.adv.maps.Homework;

import java.util.ArrayList;
import java.util.List;

public class School {

    private List <Integer> studentsNumber = new ArrayList<>();

    public School(int... studentsNumber) {
        for (int school : studentsNumber)
            this.studentsNumber.add(school);
    }

    public List<Integer> getStudentsNumber() {
        return studentsNumber;
    }
}
