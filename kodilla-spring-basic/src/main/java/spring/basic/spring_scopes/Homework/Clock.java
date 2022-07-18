package spring.basic.spring_scopes.Homework;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
@Scope("prototype")
public class Clock {

    public Clock () {
        System.out.println(LocalTime.now());
    }
}
