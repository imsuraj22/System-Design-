import java.util.Date;

public class Ticket {
    String id;
    int slotId;
    Date entryTime;
    SlotType slotType;
    Ticket(Date entryTime, SlotType slotType,int slotId){
        this.entryTime=entryTime;
        this.slotType=slotType;
        this.slotId=slotId;
        this.id="T"+entryTime.getTime()+"$$$";
    }
    public String getId() {
        return id;
    }
    public int getSlotId() {
        return slotId;
    }
    public Date getEntryTime() {
        return entryTime;
    }
    public SlotType getSlotType() {
        return slotType;
    }
    
}
