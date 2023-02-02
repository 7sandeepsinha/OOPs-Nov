package parkingLot.service;

import parkingLot.model.Ticket;
import parkingLot.model.VehicleType;
import parkingLot.repository.TicketRepository;
import parkingLot.repository.TicketRepositoryImpl;

public class TicketServiceImpl implements TicketService{
    private TicketRepository ticketRepository;

    public TicketServiceImpl() {
        ticketRepository = new TicketRepositoryImpl();
    }

    @Override
    public Ticket generateTicket(String vehicleNumber, Long gateId, VehicleType vehicleType) {
        return null;
    }
}
