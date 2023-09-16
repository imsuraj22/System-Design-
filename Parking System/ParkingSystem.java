
        public class ParkingSystem {
            static Parking parking;
            static  EntryPanel entryPanel;
            static ExitPanel exitPanel;
            public static void main(String[] args) {
                // Create an instance of the Parking class
                 parking=new Parking();
                
                // Add parking slots for different types
                parking.addSlots(SlotType.BIKE, 10);
                parking.addSlots(SlotType.CAR, 20);
                parking.addSlots(SlotType.TRUCK, 5);
                parking.addSlots(SlotType.COMPACT, 15);
                entryPanel = new EntryGate();
                exitPanel = new ExitGate();
                // Simulate a vehicle entering the parking lot
                Ticket ticket=parking.parkVehicle(SlotType.CAR,entryPanel);
                // Simulate the vehicle leaving the parking lot and calculate the payment
                if (ticket != null) {
                    double payment = parking.exitParking(ticket, exitPanel);
                    System.out.println("Payment: $" + payment);
                } else {
                    System.out.println("No available slots for cars.");
                }
            }
             
         

        

        }
