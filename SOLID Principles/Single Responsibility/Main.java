public class Main {
    public static void main(String[] args) {
        
        EmailSender emailSender = new EmailSender();
        EmailContentGenerator contentGenerator = new EmailContentGenerator();
        UserAuthenticator authenticator = new UserAuthenticator();

       
        User user = new User("John Doe");
        String message = "Thank you for using our service.";

        
        boolean isAuthenticated = authenticator.authenticateUser("suraj", "password123");

        if (isAuthenticated) {
            
            String emailContent = contentGenerator.generateEmailContent(user, message);

            
            emailSender.sendEmail("john@example.com", "Greetings", emailContent);
        } else {
            System.out.println("Authentication failed. Unable to send email.");
        }
    }
}