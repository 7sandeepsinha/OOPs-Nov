package parkingLot.dto;

import parkingLot.model.Ticket;

public class GenerateTicketResponseDto {
    private ResponseStatus responseStatus;
    //TODO -> add relevant attributes
    private Ticket ticket; //NOTE -> please don't add entire Ticket class, it violates the purpose of DTO

    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
}
