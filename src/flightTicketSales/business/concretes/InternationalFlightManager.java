package flightTicketSales.business.concretes;

import flightTicketSales.business.abstracts.InternationalFlightService;
import flightTicketSales.entities.Pegasus;
import flightTicketSales.entities.Plane;

public class InternationalFlightManager implements InternationalFlightService {

	private Pegasus pegasus;

	public InternationalFlightManager(Plane plane) {
		super();
	}

	@Override
	public void foodChoice() {
		System.out.println("Pegasus yurtdisi ucuslarinda et ikraminda bulunur.");
	}

	public Pegasus getPegasus() {
		return pegasus;
	}

	public void setPegasus(Plane pegasus) {
		this.pegasus = (Pegasus) pegasus;
	}

}
