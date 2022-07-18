package collections;

import collections.adv.immutable.Book;
import collections.adv.immutable.Homework.Task;
import collections.adv.immutable.special.ImmutableSpecialCases;
import collections.adv.maps.complex.Grades;
import collections.adv.maps.complex.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdvancedTest {
    @Test
    void bookTest() {
        Book book = new Book("Prus", "Lalka");

        assertEquals("Prus", book.getAuthor());
        assertEquals("Lalka", book.getTitle());
    }
    @Test
    void immutableSpecialTest() {
        ImmutableSpecialCases immutableSpecialCases = new ImmutableSpecialCases();

        Integer a = 128;
        Integer b = 128;
        assertEquals(a, b);

        String x = "This is string";
        String y = "This is string";
        assertEquals(x, y);

        Integer c = 100;
        Integer d = 100;
        assertEquals(c.hashCode(), d.hashCode());

        c = c + 10;
        Assertions.assertFalse(c.hashCode() == d.hashCode());

        c = 10567;
        d = 10567;
        assertEquals(c.hashCode(), d.hashCode());
    }
    @Test
    void homeworkTaskTest() {
        Task task = new Task("Lalka", 5);

        assertEquals("Lalka", task.getTitle());
        assertEquals(5, task.getDuration());
    }
    @Test
    void complexMapTest() {
        Map<Student, Grades> school = new HashMap<>();

        Student john = new Student("John", "Stevenson");
        Grades johnGrades = new Grades(5.0);

        school.put(john, johnGrades);
        assertEquals(1, school.size());

        assertEquals(johnGrades, school.get(john));

        Grades grades = new Grades(5.0);
        Student student = new Student("Mały", "John");
        assertEquals(5.0, grades.getAverage());
        assertEquals("Mały", student.getFirstname());
        assertEquals("John", student.getLastname());
    }
    @Test
    void basicMapHomeworkTest () {
        Map<String, Double> grades = new HashMap<>();
        grades.put("Mathematics", 5.0);
        grades.put("Physics", 4.5);
        grades.put("Philosophy", 4.0);

        assertEquals(3, grades.size());
        assertEquals(5.0, grades.get("Mathematics"));
        assertEquals(4.5, grades.get("Physics"));
        assertEquals(4.0, grades.get("Philosophy"));
    }
}
