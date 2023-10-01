 class GenericSlot implements Slot {
    private SlotType slotType;
    private boolean isOccupied;
    private int slotId;

    GenericSlot(SlotType slotType,int slotId){
        this.slotType=slotType;
        this.isOccupied=false;
        this.slotId=slotId;
        
    }

    @Override
    public SlotType getSlotType() {
        // TODO Auto-generated method stub
        return slotType;
    }

    @Override
    public boolean isOccupied() {
        // TODO Auto-generated method stub
        return isOccupied;
    }

    @Override
    public void occupy() {
        isOccupied=true;
        
    }

    @Override
    public void vocate() {
        isOccupied=false;
        
    }

    @Override
    public int getSlotId() {
        return slotId;
    }

}
