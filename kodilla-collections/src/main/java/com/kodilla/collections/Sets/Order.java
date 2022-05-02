package com.kodilla.collections.Sets;

import java.util.Objects;

public class Order {

    private String orderName;
    private String productName;
    private double quantity;

    public Order(String orderName, String productName, double quantity) {
        this.orderName = orderName;
        this.productName = productName;
        this.quantity = quantity;
    }

    public String getOrderName() {
        return orderName;
    }
    public String getProductName() {
        return productName;
    }
    public double getQuantity() {
        return quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Double.compare(order.quantity, quantity) == 0
                && Objects.equals(orderName, order.orderName)
                && Objects.equals(productName, order.productName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(orderName, productName, quantity);
    }
    @Override
    public String toString() {
        return "Order{" +
                "orderName='" + orderName + '\'' +
                ", productName='" + productName + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
