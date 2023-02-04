package parkingLot.strategy.feesCalculationStrategy;

import parkingLot.model.VehicleType;

import java.util.Date;

public class SurgeFeesCalculationStrategy implements FeesCalculationStrategy{
    private int surgeMultiplier;
    public SurgeFeesCalculationStrategy(int surge) {
        this.surgeMultiplier = surge;
    }

    @Override
    public double calculateFees(VehicleType vehicleType, Date entryTime, Date exitTime) {
         /*
                case Car -> calculate for car
                case Bike -> calculate for Bike
                total fees = actual * surgeMultiplier + taxes
         */
        return 0;
    }
}
