import exception.InvalidVehicleNumberException;
import exception.ParkingFullException;

public interface Parking {
    public Ticket park(Vehicle vehicle) throws ParkingFullException;

    public int unPark(Ticket ticket, ParkingChargeStretegy ParkingChargeStretegy) throws InvalidVehicleNumberException;
}
