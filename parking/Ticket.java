import java.time.LocalDateTime;

public class Ticket {
    private int slotNumber;
    private String vehicleNumber;
    private LocalDateTime date;
    private VehicleSize vehicleSize;

    public Ticket(int slotNumber, String vehicleNumber, VehicleSize vehicleSize, LocalDateTime date) {
        super();
        this.slotNumber = slotNumber;
        this.vehicleNumber = vehicleNumber;
        this.vehicleSize = vehicleSize;
        this.date = date;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public int getSlotNumber() {
        return slotNumber;
    }

    public void setSlotNumber(int slotNumber) {
        this.slotNumber = slotNumber;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public VehicleSize getVehicleSize() {
        return vehicleSize;
    }

    public void setVehicleSize(VehicleSize vehicleSize) {
        this.vehicleSize = vehicleSize;
    }

    @Override
    public String toString() {
        return "Ticket [slotNumber=" + slotNumber + ", vehicleNumber=" + vehicleNumber + ", date=" + date
                + ", vehicleSize=" + vehicleSize + "]";
    }

}
