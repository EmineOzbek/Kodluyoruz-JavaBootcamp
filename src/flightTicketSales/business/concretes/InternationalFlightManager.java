package flightTicketSales.business.concretes;

import flightTicketSales.business.abstracts.InternationalFlightService;
import flightTicketSales.entities.Plane;

public class InternationalFlightManager implements InternationalFlightService {

	@Override
	public void foodChoice(Plane plane) {
		System.out.println(plane.getCompanyName() + " yurtdisi ucuslarinda yemek ikraminda bulunur.");
	}

}
