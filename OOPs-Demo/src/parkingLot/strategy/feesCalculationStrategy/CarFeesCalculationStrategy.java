package parkingLot.strategy.feesCalculationStrategy;

import parkingLot.model.VehicleType;

import java.util.Date;

public class CarFeesCalculationStrategy implements FeesCalculationStrategy{
    @Override
    public double calculateFees(VehicleType vehicleType, Date entryTime, Date exitTime) {
        return 0;
    }
}
