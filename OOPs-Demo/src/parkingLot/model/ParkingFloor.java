package parkingLot.model;

import java.util.List;

public class ParkingFloor extends BaseModel {
    private int number;
    private List<ParkingSpot> parkingSpots;
    private ParkingSpotStatus parkingSpotStatus; // represent whether any spot is available or not

}
