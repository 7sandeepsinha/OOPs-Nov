package parkingLot.strategy.feesCalculationStrategy;

import parkingLot.model.VehicleType;

import java.util.Date;

public class NormalFeesCalculationStrategy implements FeesCalculationStrategy{
    @Override
    public double calculateFees(VehicleType vehicleType, Date entryTime, Date exitTime) {
        /*
                case Car -> calculate for car
                case Bike -> calculate for Bike
                total fees = actual * 1 + taxes
         */
        return 0;
    }
}
