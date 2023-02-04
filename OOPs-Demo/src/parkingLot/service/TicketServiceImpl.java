package parkingLot.service;

import parkingLot.SpotAssignmentStrategy;
import parkingLot.exception.NoParkingSpotAvailableException;
import parkingLot.model.*;
import parkingLot.repository.TicketRepository;

import java.util.Date;

public class TicketServiceImpl implements TicketService{
    private TicketRepository ticketRepository;
    private VehicleService vehicleService;
    private GateService gateService;
    private SpotAssignmentStrategy spotAssignmentStrategy;

    public TicketServiceImpl(TicketRepository ticketRepository, VehicleService vehicleService, GateService gateService, SpotAssignmentStrategy spotAssignmentStrategy) {
        this.ticketRepository = ticketRepository;
        this.vehicleService = vehicleService;
        this.gateService = gateService;
        this.spotAssignmentStrategy = spotAssignmentStrategy;
    }

    @Override
    public Ticket generateTicket(String vehicleNumber, Long gateId, VehicleType vehicleType) {
        /*
            1. Check if Vehicle is present in DB
            2. We need VehicleNumber, and we call-> VehicleService -> VehicleRepository
            3. If vehicle is not present, we will save it in DB
            4. Create a ticket
         */
        Vehicle vehicle = vehicleService.getVehicle(vehicleNumber);
        if(vehicle == null){
            vehicle = vehicleService.registerVehicle(vehicleNumber, vehicleType);
        }

        Gate gate = gateService.getGate(gateId);

        Ticket ticket = new Ticket();
        ticket.setVehicle(vehicle);
        ticket.setEntryTime(new Date());
        ticket.setOperator(gate.getOperator());
        ticket.setGate(gate);

        ParkingSpot parkingSpot = spotAssignmentStrategy.assign(vehicleType, gate);

        if(parkingSpot == null){
            throw new NoParkingSpotAvailableException("Currently, no parking spots are available");
        }

        ticket.setParkingSpot(parkingSpot);
        Ticket savedTicket = ticketRepository.save(ticket);
        return savedTicket;
    }
}
