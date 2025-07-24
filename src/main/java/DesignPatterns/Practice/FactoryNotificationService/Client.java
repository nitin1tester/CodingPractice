package DesignPatterns.Practice.FactoryNotificationService;

public class Client {
    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification n1 = notificationFactory.getNotification("sms");
        n1.send();
        Notification n2 =  notificationFactory.getNotification("puSh");
        n2.send();
        Notification n3 = notificationFactory.getNotification("email");
        n3.send();
    }
}
