package hibernate.tasklist.repository;

import hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class TaskRepositoryTestSuite {
    @Autowired
    private TaskListRepository taskListRepository;

    private static final String Description = "Test: Hibernate Homework";
    private static final String ListName = "Homework";

    @Test
    void testTaskRepositoryFindByDuration() {
        TaskList taskList = new TaskList(ListName, Description);
        taskListRepository.save(taskList);
        String listName = taskList.getListName();

        List<TaskList> readTasksList = taskListRepository.findByListName(listName);

        Assertions.assertEquals(1, readTasksList.size());

        int id = readTasksList.get(0).getId();
        taskListRepository.deleteById(id);
    }
}
