package DesignPatterns.Practice.FactoryNotificationService;

public class PushNotification implements Notification{
    @Override
    public void send() {
        System.out.println("This is Push Notification");
    }
}
