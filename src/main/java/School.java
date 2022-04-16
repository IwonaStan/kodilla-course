public class School {
    public static void main (String[] args) {

        Grades grades = new Grades();
        grades.add(5);
        grades.add(2);
        grades.add(3);
        grades.add(5);
        grades.add(4);

        grades.lastGrade();
        grades.averageGrade();
    }
}
