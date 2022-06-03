package com.kodilla.spring.basic.spring_dependency_injection.Homework;

public class Brudnopis {
    public static void main(String[] args) {

        NotificationService notificationService = new NotificationService();
        DeliveryService deliveryService = new DeliveryService();
        ShippingCenter shippingCenter = new ShippingCenter(deliveryService, notificationService);

        System.out.println(deliveryService.deliverPackage("Szczecin", 10));
        System.out.println(notificationService.success("Szczecin"));
        System.out.println(shippingCenter.sendPackage("Szczecin", 10));
    }
}
