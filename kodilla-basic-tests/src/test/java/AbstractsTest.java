import School.Student;
import abstracts.AnimalProcessor;
import abstracts.Dog;
import abstracts.Duck;
import abstracts.homework.*;
import inheritance.Car;
import inheritance.Convertible;
import inheritance.homework.OperatingSystem;
import inheritance.homework.Windows8;
import inheritance.homework.WindowsXP;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AbstractsTest {

    @Test
    void testAbstractsAnimal() {
        AnimalProcessor animalProcessor = Mockito.mock(AnimalProcessor.class);
        Dog dog = new Dog(4);
        Duck duck = new Duck(2);

        animalProcessor.process(dog);
        animalProcessor.process(duck);

        Mockito.verify(animalProcessor).process(dog);
        Mockito.verify(animalProcessor).process(duck);
    }
    @Test
    void testAbstractsCar () {
        Car car = new Car(4,5);
        Convertible convertible = new Convertible(4,2);

        assertEquals(4,car.getWheels());
        assertEquals(4,convertible.getWheels());
        assertEquals(5,car.getSeats());
        assertEquals(2,convertible.getSeats());
    }
    @Test
    void testAbstractHomework() {
        Job Teacher = new Teacher(1100.13,"Responsibilities:\n-Teach teach students,\n-make tests.");
        Person person1 = new Person(Teacher,"Jan",20);

        assertEquals(Teacher,person1.getJob());
        assertEquals("Jan",person1.getFirstName());
        assertEquals(20,person1.getAge());

        Job Doctor = new Doctor(8800.14,"Responsibilities:\n-Heal people,\n-make injections.");
        Person person2 = new Person(Doctor,"Paweł",30);

        assertEquals(Doctor,person2.getJob());
        assertEquals("Paweł",person2.getFirstName());
        assertEquals(30,person2.getAge());

        Job Driver = new Driver(5500.15,"Responsibilities:\n-Drive from town to town,\n-avoid traffic jams.");
        Person person3 = new Person(Driver,"Piotr",40);

        assertEquals(Driver,person3.getJob());
        assertEquals("Piotr",person3.getFirstName());
        assertEquals(40,person3.getAge());
    }
    @Test
    void testInheritanceHomework() {
        OperatingSystem operatingSystem = new OperatingSystem(2012);

        assertEquals(2012,operatingSystem.getYearOfPublishment());

        Windows8 windows8 = new Windows8();
        windows8.turnOff();

        WindowsXP windowsXP = new WindowsXP();
        windowsXP.turnOn();
    }
    @Test
    void testAbstractSchool () {
        Student student = new Student("Anna");

        student.addGeographyGrade(2);
        student.addGeographyGrade(4);
        student.addHistoryGrade(2);
        student.addHistoryGrade(4);
        student.addMathGrade(2);
        student.addMathGrade(4);
        student.addPhysicsGrade(2);
        student.addPhysicsGrade(4);
        student.getAverage();

        assertEquals(3,student.getAverage());
        assertEquals(3,student.getGeographyAverage());
        assertEquals(3,student.getHistoryAverage());
        assertEquals(3,student.getMathsAverage());
        assertEquals(3,student.getPhysicsAverage());
    }
}