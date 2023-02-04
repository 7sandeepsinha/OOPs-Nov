package parkingLot.strategy.spotAssignmentStrategy;

import parkingLot.model.Gate;
import parkingLot.model.ParkingSpot;
import parkingLot.model.VehicleType;

public class FindNearestParkingSpotStrategy implements SpotAssignmentStrategy{
    @Override
    public ParkingSpot assign(VehicleType vehicleType, Gate gate) {
        /*
            For the parking lot fetch all the floors
            then fetch all spots in floor number 0 -> check available spots based on vehicle type
            then fetch all spots in floor number 1 -> check available spots based on vehicle type

            If multiple gates are present at different floors,
            then start searching for floor in floor number 3

            ----- 4 - spot
            ----- 3 <-
            ----- 2
            ----- 1 - spot
            ----- 0
         */
        return null;
    }
}
