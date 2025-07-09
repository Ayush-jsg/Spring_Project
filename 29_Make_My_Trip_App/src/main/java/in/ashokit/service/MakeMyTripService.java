package in.ashokit.service;

import in.ashokit.requset.Passenger;
import in.ashokit.response.Ticket;

public interface MakeMyTripService {
	
	public Ticket bookTicket(Passenger passenger);
	public Ticket getTicketByNum(Integer ticketNumber);

}
