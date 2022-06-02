package com.kodilla.spring.basic.spring_dependency_injection;
import org.springframework.stereotype.Component;

@Component
public class SimpleApplication {

    private SkypeMessageService messageService;

    public SimpleApplication(SkypeMessageService messageService) {
        this.messageService = messageService;
    }

    public String processMessage(String message, String receiver) {
        if (checkReceiver(receiver)) {
            return this.messageService.send(message, receiver);
        }
        return null;
    }
    private boolean checkReceiver(String receiver) {
        return receiver != null && !receiver.isEmpty();
    }
}
