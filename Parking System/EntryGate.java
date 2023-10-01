import java.util.Date;

public class EntryGate implements EntryPanel {

    @Override
    public Ticket scanTicket(Date currDate, SlotType slotType,int SlotId) {
        return new Ticket(currDate, slotType,SlotId);
        
    }
    
}
