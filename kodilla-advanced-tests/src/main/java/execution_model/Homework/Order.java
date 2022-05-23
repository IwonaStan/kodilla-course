package execution_model.Homework;

import java.time.LocalDate;

public class Order {

    double orderValue;
    LocalDate date;
    String login;

    public Order(double orderValue, LocalDate date, String login) {
        this.orderValue = orderValue;
        this.date = date;
        this.login = login;
    }

    public double getOrderValue() {
        return orderValue;
    }
    public void setOrderValue(double orderValue) {
        this.orderValue = orderValue;
    }
    public LocalDate getLocalDate() {
        return date;
    }
    public void setLocalDate(LocalDate localDate) {
        this.date = localDate;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String toString() {
        return "Order: " + "orderValue=" + orderValue +
                ", date=" + date +
                ", login=" + login + '\n';
    }
}
