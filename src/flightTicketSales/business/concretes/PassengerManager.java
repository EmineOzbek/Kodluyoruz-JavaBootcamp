package flightTicketSales.business.concretes;

import flightTicketSales.business.abstracts.PassengerService;
import flightTicketSales.entities.AnadoluJet;
import flightTicketSales.entities.Pegasus;
import flightTicketSales.entities.Plane;
import flightTicketSales.entities.THY;

public class PassengerManager implements PassengerService {

	private THY thy;
	private Pegasus pegasus;
	private AnadoluJet anadoluJet;

	public PassengerManager() {
		super();
	}

	public PassengerManager(Plane plane) {
		super();
	}

	@Override
	public boolean isCurrentPassengerBusiness(Plane plane) {
		if (plane.equals(thy) || plane.equals(pegasus))
			return true;
		else if (plane.equals(anadoluJet))
			return false;

		return false;
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
