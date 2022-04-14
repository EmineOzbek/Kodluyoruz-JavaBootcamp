package flightTicketSales.business.concretes;

import flightTicketSales.business.abstracts.InternationalFlightService;
import flightTicketSales.entities.Pegasus;

public class InternationalFlightManager implements InternationalFlightService {

	private Pegasus pegasus;

	public InternationalFlightManager(Pegasus pegasus) {
		super();
		this.pegasus = pegasus;
	}

	@Override
	public void foodChoice() {
		System.out.println("Pegasus yurtdisi ucuslarinda et ikraminda bulunur.");
	}

	public Pegasus getPegasus() {
		return pegasus;
	}

	public void setPegasus(Pegasus pegasus) {
		this.pegasus = pegasus;
	}

}
