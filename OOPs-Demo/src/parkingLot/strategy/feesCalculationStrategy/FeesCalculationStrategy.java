package parkingLot.strategy.feesCalculationStrategy;

import parkingLot.model.Vehicle;
import parkingLot.model.VehicleType;

import java.util.Date;

public interface FeesCalculationStrategy {
    double calculateFees(VehicleType vehicleType, Date entryTime, Date exitTime);
}
