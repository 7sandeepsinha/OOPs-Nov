package parkingLot.controller;

import parkingLot.dto.GenerateTicketRequestDto;
import parkingLot.dto.GenerateTicketResponseDto;
import parkingLot.service.TicketService;

public class TicketController {
    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    //POST -> /ticket
    public GenerateTicketResponseDto generateTicket(GenerateTicketRequestDto generateTicketRequestDto){
        return null;
    }
}
// -> hit generate ticket
/*
1. get vehicle details
2. get Gate details
3. Choose operator
4. Assign a slot
5. Generate ticket, save and return
 */

/*
    generateTicket ->
    URL -> "www.parkingLot.com/ticket"
    // 1.1.1.1:8080/ticket
    // IP -> machine
    // port -> running service
    // URL -> method

    example ->
    StudentRegistration

    1. add student details -> "www.student.com/student" : POST
    2. get student details -> "www.student.com/student" : GET
    3. update -> "www.student.com/student" : PUT
    4. delete -> "www.student.com/student" : DELETE

    DTO -> data transfer object
    We should  not use the same objects/classes for request and response
    for our APIs, this can lead to a lot of issues. We should create separate classes
    and use objects of those classes for request/response.
    Issue/Advantage:
    1. Customise the attributes for req/resp
    2. Security -> hiding/removal of attributes which should be sent
    3. Any change in model, will impact the methods
 */