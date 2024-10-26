import exception.InvalidVehicleNumberException;
import exception.ParkingFullException;

public interface Parking {
    public Ticket park(Vehicle vehicle) throws ParkingFullException;

    public long unPark(Ticket ticket, ParkingChargeStretegy ParkingChargeStretegy) throws InvalidVehicleNumberException;
}
