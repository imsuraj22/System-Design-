public interface Slot {
    SlotType getSlotType();
    boolean isOccupied();
    void occupy();
    void vocate();
    int getSlotId();
}
