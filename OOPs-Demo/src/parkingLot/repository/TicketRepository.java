package parkingLot.repository;

import parkingLot.model.Ticket;

public interface TicketRepository {
     Ticket save(Ticket ticket);
     Ticket get(int ticketID);
}
