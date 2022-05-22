package execution_model;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InvoiceTest {

    Invoice invoice = new Invoice();
    Item item1 = new Item("Shoes",20.20);
    Item item2 = new Item("Blouse", 30.30);
    Item item3 = new Item("Hat",10.10);

    @BeforeAll
    public static void displayIntroMessage() {
        System.out.println("Starting testing");
    }
    @BeforeEach
    public void initializeInvoice() {
        invoice.addItem(item1);
        invoice.addItem(item2);
        invoice.addItem(item3);
    }
    @AfterEach
    public void resetValues() {
        System.out.println("Resetting values...");
    }
    @AfterAll
    public static void displayGoodByeMessage() {
        System.out.println("Finishing testing");
    }

    @Test
    public void addItem() {
        assertEquals(3,invoice.getSize());
    }
    @Test
    void getItem() {
        assertEquals(item2,invoice.getItem(1));
        assertEquals(null,invoice.getItem(-1));
        assertEquals(null,invoice.getItem(100));
    }
    @Test
    void clear() {
        invoice.clear();

        assertEquals(0,invoice.getSize());
    }
    @Test
    void getSize() {
        assertEquals(3,invoice.getSize());
    }
}