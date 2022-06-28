package factoryMethod.Notification;

public class NotificationService {

    public static void main(String[] args) {

        //use factory class to create and get an object of concrete class by passing some information.
        NotificationFactory notificationFactory = new NotificationFactory();

        //create an object of "SMS" and call its notifyUser method.
        Notification notification = notificationFactory.createNotification("SMS");

        //call notifyUser of SMS
        notification.notifyUser();
    }

}
