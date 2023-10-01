public class Main {
    public static void main(String[] args) {
        // Create instances of low-level modules
        MessageSender emailSender = new EmailSender();
        MessageSender smsSender = new SMSSender();

        // Create instances of high-level modules with dependency injection
        NotificationService emailNotificationService = new NotificationService(emailSender);
        NotificationService smsNotificationService = new NotificationService(smsSender);

        // Send notifications
        emailNotificationService.sendNotification("Hello, this is an email notification.");
        smsNotificationService.sendNotification("Hi, this is an SMS notification.");
    }
}