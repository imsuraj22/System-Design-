public class Main {
    public static void main(String[] args) {
        
        Component hd=new Leaf("HDD", 2000);
        Component mouse=new Leaf("mouse", 500);
        Component keyboard=new Leaf("Keyboard", 1000);
        Component monitor=new Leaf("Monitor", 3000);
        Component CPU=new Leaf("CPU", 10000);
        Component Ram=new Leaf("RAM", 4000);

        Composite peripheral=new Composite("Peripheral");
        Composite cabinet=new Composite("Cabinet");
        Composite mb=new Composite("Mother Board");
        Composite computer=new Composite("Computer");

        peripheral.addComponent(mouse);
        peripheral.addComponent(keyboard);
        peripheral.addComponent(monitor);

        
        mb.addComponent(CPU);
        mb.addComponent(Ram);

        cabinet.addComponent(hd);
        cabinet.addComponent(mb);

        computer.addComponent(cabinet);
        computer.addComponent(peripheral);

        computer.showPrice();

    }
}
