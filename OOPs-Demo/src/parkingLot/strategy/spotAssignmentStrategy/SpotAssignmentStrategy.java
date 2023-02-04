package parkingLot.strategy.spotAssignmentStrategy;

import parkingLot.model.Gate;
import parkingLot.model.ParkingSpot;
import parkingLot.model.VehicleType;

public interface SpotAssignmentStrategy {
    ParkingSpot assign(VehicleType vehicleType, Gate gate);
}
