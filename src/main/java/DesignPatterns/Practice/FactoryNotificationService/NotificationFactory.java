package DesignPatterns.Practice.FactoryNotificationService;

public class NotificationFactory {
    public Notification getNotification(String notificationType){
        if (notificationType.equalsIgnoreCase("email")) {
            System.out.println("Create a Email Object");
            return new EmailNotification();
        } else if (notificationType.equalsIgnoreCase("sms")) {
            System.out.println("Create a SMS Object");
            return new SMSNotification();
        } else if (notificationType.equalsIgnoreCase("push")) {
            System.out.println("Crete a Push Notification Object");
            return new PushNotification();
        }else {
            System.out.println("Please enter a valid message type");
        }
        return null;
    }
}
