package parkingLot.service;

import parkingLot.model.Vehicle;
import parkingLot.model.VehicleType;

public interface VehicleService {
    Vehicle getVehicle(String vehicleNumber);
    Vehicle registerVehicle(String vehicleNumber, VehicleType vehicleType);
}
