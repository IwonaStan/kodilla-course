package exception.Homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WarehouseTestSuite {

    @Test
    public void TestGetOrder_WithException() {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("122"));
        warehouse.addOrder(new Order("133"));

        assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("144"));
    }
}