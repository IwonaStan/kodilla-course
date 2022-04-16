public class Grades {
    private int grades[];
    private int size;
    int lastValue;
    int lastSize;
    double average;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
        this.lastValue = 0;
        this.lastSize = 0;
        this.average = 0.00;
    }

    public void add (int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
        lastValue = value;
        lastSize = this.size;
    }

    public void lastGrade() {
        System.out.println("Ostatnia dodana ocena: " +lastValue);
        System.out.println("Ilość dodanych ocen: " +lastSize);
    }

    public void averageGrade() {
        int sumAverage = 0;
        for(int i=0; i<lastSize; i++) {
            sumAverage = sumAverage + this.grades[i];
        }
        average = sumAverage/(double)lastSize;
        System.out.println("Srednia ocen: " +average);
    }

}
