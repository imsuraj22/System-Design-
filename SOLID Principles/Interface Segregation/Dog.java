public class Dog implements Run{

    @Override
    public void run() {
       System.out.println("Dog can run :)");
        
    }
    public static void main(String[] args) {
        Dog d=new Dog();
        d.run();
    }
    
}
