import org.junit.jupiter.api.Test;

public class Tests {
    @Test
    void calculatorTest() {
        Calculator calculator = new Calculator();

        double x = calculator.add(1,2);
        assert x == (double) 3;

        x = calculator.sub(3,1);
        assert x == (double) 2;
    }
    @Test
    void firsClassNotebookTest() {
        Notebook notebook = new Notebook(1,2,1900);

        int x = notebook.weight;
        assert x == 1;
        x = notebook.price;
        assert x == 2;
        x = notebook.year;
        assert x == 1900;
    }
}
