public class Slot {
    private int slotNumber;
    private boolean empty;
    private Vehicle parkedVehicle;

    public Slot(int slotNumber) {
        this.slotNumber = slotNumber;
        empty = true;
    }

    public int getSlotNumber() {
        return slotNumber;
    }

    public void setSlotNumber(int slotNumber) {
        this.slotNumber = slotNumber;
    }

    public boolean isSlotEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }

    public Vehicle getParkedVehicle() {
        return parkedVehicle;
    }

    public void setParkVehicle(Vehicle parkedVehicle) {
        this.parkedVehicle = parkedVehicle;
    }

    public void vacateSlot() {
        parkedVehicle = null;
        this.empty = true;
    }

    public void occupySlot(Vehicle parkedVehicle) {
        this.parkedVehicle = parkedVehicle;
        this.empty = false;
    }
}
