package parkingLot.dto;

import parkingLot.model.VehicleType;

public class GenerateTicketRequestDto {
    private String vehicleNUmber;
    private Long gateId;
    private VehicleType vehicleType;

    public String getVehicleNUmber() {
        return vehicleNUmber;
    }

    public void setVehicleNUmber(String vehicleNUmber) {
        this.vehicleNUmber = vehicleNUmber;
    }

    public Long getGateId() {
        return gateId;
    }

    public void setGateId(Long gateId) {
        this.gateId = gateId;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
