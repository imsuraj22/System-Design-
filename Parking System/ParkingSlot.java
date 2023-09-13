public class ParkingSlot {
    //int level;
    boolean isAvailable;
    private Vehicle parkedVehicle;

    public ParkingSlot(){
        isAvailable=true;
        parkedVehicle=null;
    }
    public boolean isAvailable(){
        return isAvailable;
    }
    public void parkVehicle(Vehicle vehicle){
        isAvailable=false;
        parkedVehicle=vehicle;
    }
    public Vehicle getparkedVehicle(){
        return parkedVehicle;
    }

}
