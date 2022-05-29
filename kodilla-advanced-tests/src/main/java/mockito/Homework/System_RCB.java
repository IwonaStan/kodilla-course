package mockito.Homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class System_RCB {

    private Map<Subscriber, Set<Localization>> users = new HashMap<>();

    public void addNewSubscriber (Subscriber subscriber, Set<Localization> localizations) {
        this.users.put(subscriber, localizations);
    }
    public void addNewLocalization (Subscriber subscriber, Localization local) {
        Set<Localization> localizations = this.users.get(subscriber);
        localizations.add(local);
        this.users.put(subscriber, localizations);
    }
    public void sendRegulations (String regulations) {
        for (Map.Entry<Subscriber, Set<Localization>> usersEntry : users.entrySet())
            usersEntry.getKey().sendRegulations(regulations);
    }
    public void sendAlert (Localization local, Alert_RCB alert_rcb) {
        Set<Localization> localizations1 = new HashSet<>();
        for (Map.Entry<Subscriber, Set<Localization>> usersEntry : users.entrySet()) {
            localizations1 = usersEntry.getValue();
            for (Localization city : localizations1) {
                if (city.equals(local))
                    usersEntry.getKey().sendAlert(alert_rcb);
            }
        }
    }
    public void removeSubscriber (Subscriber subscriber) {
        this.users.remove(subscriber);
    }
    public void removeLocalization (Subscriber subscriber, Localization localization) {
        Set<Localization> user = this.users.get(subscriber);
        if (user.size()>0) {
            user.remove(localization);
            this.users.put(subscriber, user);
        }
        if (user.size()==0) removeSubscriber(subscriber);
    }
}
