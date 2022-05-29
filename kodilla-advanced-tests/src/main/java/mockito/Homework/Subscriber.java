package mockito.Homework;

import java.util.Set;

public interface Subscriber {
    void sendRegulations(String regulations);
    void sendAlert(Alert_RCB alert_rcb);
    boolean addNewSubscriber (Subscriber subscriber, Set<Localization> localizations);
    boolean addNewLocalization (Subscriber subscriber, Localization local);
    boolean removeSubscriber (Subscriber subscriber);
    boolean removeLocalization (Subscriber subscriber, Localization localization);
}