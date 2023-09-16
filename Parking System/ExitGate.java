import java.util.Date;



public class ExitGate implements ExitPanel
 {

    @Override
    public double processPayment(Ticket ticket) {
        SlotType slotType = ticket.getSlotType(); 
    Date entryTime = ticket.getEntryTime(); 

    
    Date currentTime = new Date();
    long elapsedMilliseconds = currentTime.getTime() - entryTime.getTime();

   
    long elapsedHours = elapsedMilliseconds / (60 * 60 * 1000); 

    
    double hourlyRate = PriceRate.getRateForSlotType(slotType);

    if(elapsedHours<1){
        return hourlyRate;
    }
    double amount = elapsedHours * hourlyRate;

    return amount;
    }
     
}
