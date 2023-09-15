import java.util.Date;

public interface EntryPanel {
    Ticket scanTicket(Date currDate,SlotType slotType,int SlotId);
}