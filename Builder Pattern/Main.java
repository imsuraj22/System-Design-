public class Main {
    public static void main(String[] args) {
        
        Phone myPhone=new PhoneBuilder().setOs("Android").setProcessor("SnapDragon").getPhone();
        System.out.println(myPhone);
    }

}
