package com.kodilla.spring.basic.dependency_injection.Homework;

public class Application {
    public static void main(String[] args) {
        DeliveryService deliveryService = new NotificationAndDeliverySerwis();
        NotificationService notificationService = new NotificationAndDeliverySerwis();
        ShippingCenter shippingCenter = new ShippingCenter(deliveryService, notificationService);
        shippingCenter.sendPackage("Hill Street 11, New York", 18.2);
    }
}
