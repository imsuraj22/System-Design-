public class Duck implements Fly{

    @Override
    public void run() {
        System.out.println("Duck can Run :)");
        
    }

    @Override
    public void fly() {
        System.out.println("Duck can fly :)");
        
    }

    public static void main(String[] args) {
        Duck d =new Duck();
        d.run();
        d.fly();
    }
    
    
}
