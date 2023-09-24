public class EmailContentGenerator {
    public String generateEmailContent(User user, String message) {
       
        return "Dear " + user.getName() + ",\n" + message;
    }
    public String loadEmailTemplate(String templateName) {
        
        return "Template for " + templateName;
    }

}