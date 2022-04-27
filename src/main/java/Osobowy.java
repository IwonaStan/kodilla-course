public class Osobowy {

    Nissan[] nissans = new Nissan[5];
    int size;

    public Osobowy () {
        this.size = 0;
    }

    public void addModel(Nissan nissan) {
        if (this.size==5) {return;}
        nissans[this.size]=nissan;
        this.size++;
    }
    public void print (int number) {
        if(number<this.size) {
            System.out.println(this.nissans[number]);
        }
    }
}
