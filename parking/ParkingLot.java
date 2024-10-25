import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import exception.InvalidVehicleNumberException;
import exception.ParkingFullException;

public class ParkingLot implements Parking {
    private static ParkingLot parkingLot;
    private final List<Slot> twoWheelerSlots;
    private final List<Slot> fourWheelerSlots;

    private ParkingLot() {
        this.twoWheelerSlots = new ArrayList<>();
        this.fourWheelerSlots = new ArrayList<>();
    }

    public static ParkingLot getParkingLot() {
        if (parkingLot == null) {
            parkingLot = new ParkingLot();
        }
        return parkingLot;
    }

    public void initializeParkingSlots(int numberOfTwoWheelerParkingSlots, int numberOfFourWheelerParkingSlots) {
        for (int i = 0; i < numberOfTwoWheelerParkingSlots; i++) {
            twoWheelerSlots.add(new Slot(i));
        }

        for (int i = 0; i < numberOfFourWheelerParkingSlots; i++) {
            fourWheelerSlots.add(new Slot(i));
        }
        System.out.println("Parking lot with %d two wheeler parking slot and %d four wheeler parking slot created"
                .formatted(numberOfTwoWheelerParkingSlots, numberOfFourWheelerParkingSlots));
    }

    @Override
    public Ticket park(Vehicle vehicle) throws ParkingFullException {
        Slot nextAvailableSlot;
        if (vehicle.getVehicleSize().equals(VehicleSize.FOURWHEELER)) {
            nextAvailableSlot = getNextAvailableFourWheelerSlot();
        } else {
            nextAvailableSlot = getNextAvailableTwoWheelerSlot();
        }
        nextAvailableSlot.occupySlot(vehicle);
        System.out.printf("Allocated slot number: %d \n", nextAvailableSlot.getSlotNumber());
        Ticket ticket = new Ticket(nextAvailableSlot.getSlotNumber(), vehicle.getVechicleNumber(),
                vehicle.getVehicleSize(), LocalDateTime.now());
        return ticket;
    }

    @Override
    public int unPark(Ticket ticket, ParkingChargeStretegy ParkingChargeStretegy) throws InvalidVehicleNumberException {

        throw new UnsupportedOperationException("Unimplemented method 'unPark'");
    }

    private Slot getNextAvailableFourWheelerSlot() throws ParkingFullException {
        for (Slot slot : fourWheelerSlots) {
            if (slot.isSlotEmpty()) {
                return slot;
            }
        }
        throw new ParkingFullException("No Empty Slot available");
    }

    private Slot getNextAvailableTwoWheelerSlot() throws ParkingFullException {
        for (Slot slot : twoWheelerSlots) {
            if (slot.isSlotEmpty()) {
                return slot;
            }
        }
        throw new ParkingFullException("No Empty Slot available");
    }
}
