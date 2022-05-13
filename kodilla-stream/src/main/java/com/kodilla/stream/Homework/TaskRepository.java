package com.kodilla.stream.Homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {

   public static List<Task> getTasks() {
       List<Task> listTask = new ArrayList<>();
       listTask.add(new Task("Go to school", LocalDate.of(2020, 9, 1),LocalDate.of(2021, 6, 25)));
       listTask.add(new Task("Go to college", LocalDate.of(2021, 10, 1),LocalDate.of(2022, 6, 18)));
       listTask.add(new Task("Go to work", LocalDate.of(2022, 7, 1),LocalDate.of(2052, 1, 1)));
       return listTask;
   }
}
