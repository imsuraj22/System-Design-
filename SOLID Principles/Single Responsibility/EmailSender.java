public class EmailSender {
    public void sendEmail(String to, String subject, String content) {
        
        System.out.println("Sending email to: " + to);
        System.out.println("Subject: " + subject);
        System.out.println("Content: " + content);
        System.out.println("Email sent successfully.");
    }
}