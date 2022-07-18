import org.junit.jupiter.api.Test;
import stream.User;
import stream.UsersManager;
import stream.UsersRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StreamHomeworkTest {

    @Test
    void averageAgeTest() {
        List<User> users = new ArrayList<>();
        users.add(new User("Walter White", 20, 7, "Chemists"));
        users.add(new User("Jessie Pinkman", 40, 4648, "Sales"));
        users.add(new User("Tuco Salamanca", 30, 116, "Chemists"));

        assertEquals(3, users.size());

        List<String> usernames = UsersRepository.getUsersList()   // [1]
                .stream()
                .filter(u -> u.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());
        assertEquals(2, usernames.size());

        double avg = UsersRepository.getUsersList()
                .stream()
                .mapToInt(u -> u.getAge())
                .average()
                .getAsDouble();
        assertEquals(43.164, avg, 3);
    }
}
