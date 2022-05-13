package com.kodilla.stream.com.kodilla.optional.Homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {

        List <Student> studentList= new ArrayList<>();
        studentList.add(new Student("Bartek", new Teacher("Matematyczewski")));
        studentList.add(new Student("Karol", null));
        studentList.add(new Student("Asia", new Teacher("Chemiczewski")));
        studentList.add(new Student("Zosia", null));

        for(Student students:studentList)
            System.out.println(students.getName1() + students.getTeacher());
        System.out.println("---------------------");
        for(Student students:studentList)
            System.out.println( Optional.ofNullable(students.getTeacher()).orElse(new Teacher("<undefined>")) );
    }
}
