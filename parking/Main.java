public class Main {
    public static void main(String[] args) {
        try {
            ParkingLot parkingLot = ParkingLot.getParkingLot();
            parkingLot.initializeParkingSlots(10, 10);
            Vehicle vehicle1 = new Vehicle("GJ23AA9999", VehicleSize.TWOWHEELER);
            Ticket ticket1 = parkingLot.park(vehicle1);

            System.out.println(ticket1);
            Vehicle vehicle2 = new Vehicle("GJ01AZ3949", VehicleSize.FOURWHEELER);

            Ticket ticket2 = parkingLot.park(vehicle2);

            System.out.println(ticket2);

            long cost1 = parkingLot.unPark(ticket1, ParkingChargeStretegy.TWOWHEELER);
            long cost2 = parkingLot.unPark(ticket2, ParkingChargeStretegy.FOURWHEELER);

            System.out.println("Charge for ticket is %d and %d".formatted(cost1, cost2));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
