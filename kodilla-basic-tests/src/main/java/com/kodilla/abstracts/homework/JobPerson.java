package com.kodilla.abstracts.homework;

public class JobPerson {
    public static void main(String[] args) {

        Person person1 = new Person("Teacher", "Jan", 20);
        Teacher teacher = new Teacher(1500.12, "Responsibilities:\n- teach teach students\n- make tests.");
        System.out.println("\n"+person1.getJob() + " " + person1.getFirstName() + " " + person1.getAge() + "years");
        person1.print();

        Person person2 = new Person("Doctor", "Piotr", 30);
        Doctor doctor = new Doctor(8900.99, "Responsibilities:\n-Heal people.\n-Make injections.");
        System.out.println("\n"+person2.getJob() + " " + person2.getFirstName() + " " + person2.getAge() + "years");
        person2.print();

        Person person3 = new Person("Driver", "Tomasz", 40);
        Driver driver = new Driver(3000.00,"Responsibilities:\n-Drive from town to town.\n-Avoid traffic jams.");
        System.out.println("\n"+person3.getJob() + " " + person3.getFirstName() + " " + person3.getAge() + "years");
        person3.print();
    }
}
