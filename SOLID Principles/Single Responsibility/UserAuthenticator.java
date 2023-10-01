public class UserAuthenticator {
    public boolean authenticateUser(String username, String password) {
        // Simulate user authentication (in a real application, this would involve database checks)
        if (username.equals("suraj") && password.equals("password123")) {
            return true;
        } else {
            return false;
        }
    }
}