package execution_model.Homework;

import java.text.SimpleDateFormat;

public class Order {

    double orderValue;
    int date;
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yy");
    String login;

    public Order(double orderValue, int date, String login) {
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
    public int getDate() {
        return date;
    }
    public void setDate(int date) {
        this.date = date;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderValue=" + orderValue +
                ", date=" + date +
                ", login='" + login + '\'' +
                '}';
    }
}
