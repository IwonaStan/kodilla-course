package abstracts;

public class Dog extends Animal {

    public Dog(int numberOfLegs) {
        super(4);
    }
    public Dog() {
        super();
    }

    @Override
    public void giveVoice() {
        System.out.println("Hau hau");
    }
}
