package com.kodilla.collections.adv.maps.Homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {

        Map <Principal, School> zestawienie = new HashMap<>();

        Principal kowalski = new Principal("Kowalski", "III Liceum");
        Principal nowak = new Principal("Nowak", "IV Technikum");
        Principal wisniewski = new Principal("Wisniewski", "V Zawodowa");

        School kowalskiSchool = new School(23, 30, 34, 25);
        School nowakSchool = new School(30, 35, 25, 28, 33);
        School wisniewskiSchool = new School(40, 35, 30, 25);

        zestawienie.put(kowalski, kowalskiSchool);
        zestawienie.put(nowak,nowakSchool);
        zestawienie.put(wisniewski,wisniewskiSchool);

        for (Map.Entry <Principal,School> principalSchoolEntry : zestawienie.entrySet()) {
            System.out.println(principalSchoolEntry.getKey().getDirectorName()+": "+principalSchoolEntry.getKey().getSchoolName());
            System.out.println(" students in classes "+principalSchoolEntry.getValue().getStudentsNumber()+"\n-----------------");
        }
    }
}
