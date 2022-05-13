package com.kodilla.stream.Homework;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    public static void main(String[] args) {

        List<LocalDate> notEndTask = TaskRepository.getTasks()
            .stream()
            .filter(d -> d.getDeadline().isAfter(LocalDate.now()))
            .map(TaskManager::getDeadLine)
            .collect(Collectors.toList());
        System.out.println(notEndTask);
    }
    public static LocalDate getDeadLine(Task task) {
        return task.getDeadline();
    }
}
