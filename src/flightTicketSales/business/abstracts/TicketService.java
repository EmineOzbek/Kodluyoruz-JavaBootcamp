package flightTicketSales.business.abstracts;

import flightTicketSales.entities.Plane;

public interface TicketService {

	void takeTicket(Plane plane, int passengerCount);

	void returnTicket(int ticketDay);

}
