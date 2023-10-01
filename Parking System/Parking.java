import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Parking {
    private Map<SlotType,List<Slot>> differentSlots;
    Parking(){
        differentSlots=new HashMap<>();
    }

    public void addSlots(SlotType slotType, int noOfSlots){
        differentSlots.putIfAbsent(slotType, new ArrayList<>());
        List<Slot> slots=differentSlots.get(slotType);

        for(int i=0;i<noOfSlots;i++){
            Slot slot=new GenericSlot(slotType, i+1); //id start from one
            slots.add(slot);
        }
    }

    //now we will write method to generate the ticket
    public Ticket parkVehicle(SlotType slotType, EntryPanel entryPanel){
        Slot availableSlot=findAvailableSlot(slotType);
        if(availableSlot!=null){
            availableSlot.occupy();
            //call the method of entrypanel to generate tiket because now we have a slot avaliable
            Date date=new Date();
            return entryPanel.scanTicket(date, slotType,availableSlot.getSlotId());
        }
        return null;
    }

    //with the help of ticket calculate the price
    public double exitParking(Ticket ticket, ExitPanel exitPanel) {
        return exitPanel.processPayment(ticket);
        //return 0.0; // Ticket not found or slot already vacant
    }

    private Slot findAvailableSlot(SlotType slotType){
        List<Slot> slots=differentSlots.get(slotType);
        if(slots==null) return null;
        for(Slot slot:slots){
            if(!slot.isOccupied()){
                return slot;
            }
        }
        return null;

    }
}
