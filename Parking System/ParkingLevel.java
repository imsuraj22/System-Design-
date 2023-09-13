import javafx.scene.effect.Light.Spot;

public class ParkingLevel {
    int levelNo;
    ParkingSlot parkingSlot[];

    public ParkingLevel(int levelNo, int noOfSlots){
        this.levelNo=levelNo;
        parkingSlot=new ParkingSlot[noOfSlots];
        for(int i=0;i<parkingSlot.length;i++){
            parkingSlot[i]=new ParkingSlot();
        }
        
    }
    public int getLevelNo(){
        return levelNo;
    }
    public ParkingSlot[] getSpots(){
        return parkingSlot;
    }

}
