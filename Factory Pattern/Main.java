public class Main {
    public static void main(String[] args) {
        OSFactory osFactory=new OSFactory();
        OS os=osFactory.getOperationSystem("Secure");
        os.Specifications();
    }
}
