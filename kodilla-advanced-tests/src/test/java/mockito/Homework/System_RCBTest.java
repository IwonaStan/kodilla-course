package mockito.Homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.HashSet;
import java.util.Set;

class System_RCBTest {

    System_RCB system_rcb = new System_RCB();
    Subscriber subscriber = Mockito.mock(Subscriber.class);
    Localization localization = Mockito.mock(Localization.class);
    Set<Localization> places = new HashSet<>();
    Alert_RCB alert_rcb = Mockito.mock(Alert_RCB.class);

    @Test
    public void addNewSubscriber() {
        system_rcb.addNewSubscriber(subscriber, places);

        Assertions.assertEquals(1,system_rcb.users.size());
    }
    @Test
    public void addNewLocalization() {
        system_rcb.addNewSubscriber(subscriber, places);
        system_rcb.addNewLocalization(subscriber, localization);

        Assertions.assertEquals(1,system_rcb.users.get(subscriber).size());
    }
    @Test
    public void sendRegulations() {
        system_rcb.addNewSubscriber(subscriber, places);

        system_rcb.sendRegulations("Regulations");

        Mockito.verify(subscriber, Mockito.times(1)).sendRegulations("Regulations");
    }
    @Test
    public void sendRegulationsToNotSubscriber() {
        system_rcb.sendRegulations("Regulations");

        Mockito.verify(subscriber, Mockito.never()).sendRegulations("Regulations");
    }
    @Test
    public void sendAlert() {
        system_rcb.addNewSubscriber(subscriber, places);
        system_rcb.addNewLocalization(subscriber, localization);

        system_rcb.sendAlert(localization, alert_rcb);

        Mockito.verify(subscriber,Mockito.times(1)).sendAlert(alert_rcb);
    }
    @Test
    public void sendAlertToWrongLocalization() {
        system_rcb.addNewSubscriber(subscriber, places);
        system_rcb.addNewLocalization(subscriber, localization);

        Localization localization1 = Mockito.mock(Localization.class);
        system_rcb.sendAlert(localization1, alert_rcb);

        Mockito.verify(subscriber,Mockito.never()).sendAlert(alert_rcb);
    }
    @Test
    public void removeSubscriber() {
        system_rcb.addNewSubscriber(subscriber, places);

        system_rcb.removeSubscriber(subscriber);

        system_rcb.sendRegulations("Regulations");

        Mockito.verify(subscriber,Mockito.never()).sendRegulations("Regulations");
    }
    @Test
    public void removeLocalization() {
        system_rcb.addNewSubscriber(subscriber, places);
        system_rcb.addNewLocalization(subscriber, localization);

        Localization localization1 = Mockito.mock(Localization.class);
        system_rcb.addNewLocalization(subscriber, localization1);

        system_rcb.removeLocalization(subscriber, localization1);

        Assertions.assertEquals(1,system_rcb.users.get(subscriber).size());
    }
    @Test
    public void removeAllLocalization() {
        system_rcb.addNewSubscriber(subscriber, places);
        system_rcb.addNewLocalization(subscriber, localization);

        Localization localization1 = Mockito.mock(Localization.class);
        system_rcb.addNewLocalization(subscriber, localization1);

        system_rcb.removeLocalization(subscriber, localization);
        system_rcb.removeLocalization(subscriber, localization1);

        Assertions.assertEquals(0,system_rcb.users.size());
    }
}