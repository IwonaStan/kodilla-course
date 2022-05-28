package mockito.Homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class System_RCBTest {

    System_RCB system_rcb = new System_RCB();
    Subscriber subscriber = Mockito.mock(Subscriber.class);
    Localization localizations = Mockito.mock(Localization.class);
    Alert_RCB alert_rcb = Mockito.mock(Alert_RCB.class);

    @Test
    public void addNewSubscriber() {
        system_rcb.addNewSubscriber(subscriber, system_rcb.addNewLocalization(subscriber,);
    }
}