package com.kodilla.stream.com.kodilla.optional;

import com.kodilla.stream.User;
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {

        /*
        User user = new User("user1", 30, 100, "Test");
        Optional<User> optionalUser = Optional.ofNullable(user);
        String username1 =
                optionalUser.orElse(new User("", 0, 0, "")).getUsername();     // [1]
        System.out.println(username1);
        */
        User user2 = null;
        Optional<User> optionalUser = Optional.ofNullable(user2);
        //String username2 =
               // optionalUser.orElse(new User("xyz", 0, 0, "")).getUsername();
        System.out.println(optionalUser.orElse(new User("xyz", 0, 0, "")).getUsername());

        //User user3 = new User("user1", 30, 100, "Test");
        //Optional<User> optionalUser = Optional.ofNullable(user3);
        //optionalUser.ifPresent(u -> System.out.println(u.getUsername()));
    }
}
