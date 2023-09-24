The Single Responsibility Principle (SRP) is one of the SOLID principles of object-oriented design. It states that a class should have only one reason to change, meaning it should have only one responsibility or job. When a class has multiple responsibilities, it becomes less maintainable and harder to understand.

Here's an example to illustrate the Single Responsibility Principle:

Consider a class named EmailSender that sends emails. At first glance, this class seems to have a single responsibility, which is sending emails. However, let's say it also contains methods for generating email content, managing email templates, and handling user authentication. In this case, it violates the SRP because it has multiple reasons to change:

public class EmailSender {
    public void sendEmail(String to, String subject, String content) {
        // Code for sending the email
    }

    public String generateEmailContent(User user, String message) {
        // Code for generating email content
    }

    public String loadEmailTemplate(String templateName) {
        // Code for loading email templates
    }

    public boolean authenticateUser(String username, String password) {
        // Code for user authentication
    }
}

In this example, the EmailSender class is responsible for:

Sending emails.
Generating email content.
Loading email templates.
User authentication.
To adhere to the Single Responsibility Principle, we should refactor this class to have a single responsibility.
