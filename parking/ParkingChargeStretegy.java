public enum ParkingChargeStretegy {
    FOURWHEELER(500),
    TWOWHEELER(200);

    private final int charge;

    ParkingChargeStretegy(int charge) {
        this.charge = charge;
    }

    public int getCharge() {
        return this.charge;
    }
}
