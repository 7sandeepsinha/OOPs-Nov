package parkingLot.service;

import parkingLot.model.Ticket;
import parkingLot.model.VehicleType;

public interface TicketService {

    Ticket generateTicket(String vehicleNumber, Long gateId, VehicleType vehicleType);
}


/*
  Assume, DTO contains userName and password as well, we dont need password for
  business logic, so after validation, authentication and authorization on
  controller layer, we only transfer the required data to service layer.

  Dont send exact DTO that came in API call, to service
  Either send params, or create a new object to transfer required attributes.

  Validation, authentication and authorization

  School ->
  1. Validation -> proper uniform, dress, books and copies || validate the required input fields, and whether they contain correct data or not
  validation is important for security -> Cross site scripting attack
  2. Authentication -> checking whether a student of the school || letting you enter the system
  3. Authorization -> allowing you to attend facilities || letting you perform specific actions
 */