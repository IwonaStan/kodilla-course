package com.kodilla.abstracts.homework;

public class JobPerson {
    public static void main(String[] args) {

        Job Teacher = new Teacher(1100.13,"Responsibilities:\n-Teach teach students,\n-make tests.");
        Person person1 = new Person(Teacher,"Jan",20);
        System.out.println("\n"+person1.getFirstName()+" "+person1.getAge()+"years");
        person1.printJob(Teacher);

        Job Doctor = new Doctor(8800.14,"Responsibilities:\n-Heal people,\n-make injections.");
        Person person2 = new Person(Doctor,"Paweł",30);
        System.out.println("\n"+person2.getFirstName()+" "+person2.getAge()+"years");
        person2.printJob(Doctor);

        Job Driver = new Driver(5500.15,"Responsibilities:\n-Drive from town to town,\n-avoid traffic jams.");
        Person person3 = new Person(Driver,"Piotr",40);
        System.out.println("\n"+person3.getFirstName()+" "+person3.getAge()+"years");
        person3.printJob(Driver);
    }
}
