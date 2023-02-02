package parkingLot.model;

import java.util.List;

public class ParkingSpot extends BaseModel {
    private ParkingFloor parkingFloor;
    private List<VehicleType> supportedVehicleType;
    private ParkingSpotStatus parkingSpotStatus;
    private int number;//number of the parking spot, for ease of the user, we cant use id for user's as ids generally are 6-10 digits long

    public ParkingFloor getParkingFloor() {
        return parkingFloor;
    }

    public void setParkingFloor(ParkingFloor parkingFloor) {
        this.parkingFloor = parkingFloor;
    }

    public List<VehicleType> getSupportedVehicleType() {
        return supportedVehicleType;
    }

    public void setSupportedVehicleType(List<VehicleType> supportedVehicleType) {
        this.supportedVehicleType = supportedVehicleType;
    }

    public ParkingSpotStatus getParkingSpotStatus() {
        return parkingSpotStatus;
    }

    public void setParkingSpotStatus(ParkingSpotStatus parkingSpotStatus) {
        this.parkingSpotStatus = parkingSpotStatus;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
