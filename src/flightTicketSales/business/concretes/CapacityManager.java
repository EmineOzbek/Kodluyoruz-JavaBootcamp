package flightTicketSales.business.concretes;

import flightTicketSales.business.abstracts.CapacityService;
import flightTicketSales.entities.AnadoluJet;
import flightTicketSales.entities.Pegasus;
import flightTicketSales.entities.Plane;
import flightTicketSales.entities.THY;

public class CapacityManager implements CapacityService {

	private THY thy;
	private Pegasus pegasus;
	private AnadoluJet anadoluJet;

	public CapacityManager() {
		super();
	}

	public CapacityManager(Plane plane) {
		super();
	}

	public THY getThy() {
		return thy;
	}

	public void setThy(Plane thy) {
		this.thy = (THY) thy;
	}

	public Pegasus getPegasus() {
		return pegasus;
	}

	public void setPegasus(Plane pegasus) {
		this.pegasus = (Pegasus) pegasus;
	}

	public AnadoluJet getAnadoluJet() {
		return anadoluJet;
	}

	public void setAnadoluJet(Plane anadoluJet) {
		this.anadoluJet = (AnadoluJet) anadoluJet;
	}
}
