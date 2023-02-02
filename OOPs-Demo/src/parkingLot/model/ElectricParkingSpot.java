package parkingLot.model;

public class ElectricParkingSpot extends BaseModel{
    private ParkingSpot parkingSpot;
    private ElectricCharger electricCharger;

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public ElectricCharger getElectricCharger() {
        return electricCharger;
    }

    public void setElectricCharger(ElectricCharger electricCharger) {
        this.electricCharger = electricCharger;
    }
}

/*
assignParkingSpot(ParkingSpot parkingSpot, Vehicle vehicle){

}

 */
