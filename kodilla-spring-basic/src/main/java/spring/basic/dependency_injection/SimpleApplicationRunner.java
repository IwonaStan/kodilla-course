package spring.basic.dependency_injection;

public class SimpleApplicationRunner {
    public static void main(String[] args) {

        MessageService messageService = new FacebookMessageService();
        SimpleApplication application = new SimpleApplication(messageService);
        application.processMessage("Test message", "receiver@mail.com");

        MessageService messageService1 = new EmailMessageService();
        SimpleApplication application1 = new SimpleApplication(messageService1);
        application1.processMessage("Test message", "receiver@mail.com");

    }
}