package spring.basic.spring_dependency_injection.Homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class ShippingCenterTest {
    @Test
    public void ShouldSendWhenRightWeight () {
        ApplicationContext context = new AnnotationConfigApplicationContext("spring.basic");
        DeliveryService bean = context.getBean(DeliveryService.class);
        boolean send = bean.deliverPackage("Szczecin", 29.99);
        Assertions.assertTrue(send);
    }
    @Test
    public void ShouldNotSendWhenRightWeight () {
        ApplicationContext context = new AnnotationConfigApplicationContext("spring.basic");
        DeliveryService bean = context.getBean(DeliveryService.class);
        boolean send = bean.deliverPackage("Szczecin", 30.01);
        Assertions.assertFalse(send);
    }
    @Test
    public void ShouldWriteDeliveredMessage () {
        ApplicationContext context = new AnnotationConfigApplicationContext("spring.basic");
        NotificationService bean = context.getBean(NotificationService.class);
        String send = bean.success("Szczecin");
        Assertions.assertEquals("Package delivered to: Szczecin", send);
    }
    @Test
    public void ShouldNotWriteDeliveredMessage () {
        ApplicationContext context = new AnnotationConfigApplicationContext("spring.basic");
        NotificationService bean = context.getBean(NotificationService.class);
        String send = bean.fail("Szczecin");
        Assertions.assertEquals("Package not delivered to: Szczecin", send);
    }
    @Test
    public void ShouldDeliver () {
        ApplicationContext context = new AnnotationConfigApplicationContext("spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String send = bean.sendPackage("Szczecin", 29.99);
        Assertions.assertEquals("Package delivered to: Szczecin", send);
    }
    @Test
    public void ShouldNotDeliver () {
        ApplicationContext context = new AnnotationConfigApplicationContext("spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String send = bean.sendPackage("Szczecin", 30.01);
        Assertions.assertEquals("Package not delivered to: Szczecin", send);
    }
}