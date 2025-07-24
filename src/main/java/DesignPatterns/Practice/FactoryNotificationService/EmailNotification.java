package DesignPatterns.Practice.FactoryNotificationService;

public class EmailNotification implements Notification {
    @Override
    public void send() {
        System.out.println("This is Email Notification");
    }
}
