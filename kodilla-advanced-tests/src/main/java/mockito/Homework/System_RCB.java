package mockito.Homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class System_RCB {

    Map<Subscriber, Set<String>> users = new HashMap<>();

    public void addNewSubscriber (Subscriber subscriber, Set<String> localizations) {
        this.users.put(subscriber, localizations);
    }
    public void addNewLocalization (Subscriber subscriber, String localization) {
        Set<String> localizations = this.users.get(subscriber);
        localizations.add(localization);
        this.users.put(subscriber, localizations);
    }
    public void sendRegulations (String regulations) {
        for (Map.Entry<Subscriber, Set<String>> usersEntry : users.entrySet())
            usersEntry.getKey().sendRegulations(regulations);
    }
    public void sendAlert (Localization localization, Alert_RCB alert_rcb) {
        Set<String> localizations = new HashSet<>();
        for (Map.Entry<Subscriber, Set<String>> usersEntry : users.entrySet()) {
            localizations = usersEntry.getValue();
            for (String city : localizations)
                if (city.equals(localization))
                    usersEntry.getKey().sendAlert(alert_rcb);
        }
    }
    public void removeSubscriber (Subscriber subscriber) {
        this.users.remove(subscriber);
    }
    public void removeLocalization (Subscriber subscriber, String localization) {
        Set<String> user = this.users.get(subscriber);
        if (user.size()!=0) {
            user.remove(localization);
            this.users.put(subscriber, user);
        } else removeSubscriber(subscriber);
    }
}
