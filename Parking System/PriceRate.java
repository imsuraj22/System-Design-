public enum PriceRate {
    BIKE(3),        // Bike costs 3$
    COMPACT(5),     // Compact car costs 5$
    CAR(7),         // Car costs 7$
    TRUCK(10);      // Truck costs 10$

    private final int rate;

    PriceRate(int rate) {
        this.rate = rate;
    }

    public int getRate() {
        return rate;
    }
    public static double getRateForSlotType(SlotType slotType) {
        switch (slotType) {
            case BIKE:
                return BIKE.getRate();
            case COMPACT:
                return COMPACT.getRate();
            case CAR:
                return CAR.getRate();
            case TRUCK:
                return TRUCK.getRate();
            default:
                return 0.0; // Handle unknown slotType or provide a default rate
        }
    }
}
