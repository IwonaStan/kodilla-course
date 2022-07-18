package abstracts.homework;

public class Person {

    private Job job;
    private String firstName;
    private int age;

    public Person(Job job, String firstName, int age) {
        this.job = job;
        this.firstName = firstName;
        this.age = age;
    }
    public void printResponsibilities() {
        System.out.println(job.getResponsibilities());
    }
    public Job getJob() {
        return job;
    }
    public String getFirstName() {
        return firstName;
    }
    public int getAge() {
        return age;
    }

}