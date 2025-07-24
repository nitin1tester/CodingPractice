package DesignPatterns.Practice.FactoryNotificationService;

public class SMSNotification implements Notification {
    @Override
    public void send() {
        System.out.println("This is SMS Notifiction");
    }
}
