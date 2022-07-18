package abstracts;

public class Duck extends Animal {

    public Duck(int numberOfLegs) {
        super(2);
    }

    @Override
    public void giveVoice() {
        System.out.println("Quack");
    }
}
