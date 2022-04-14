package flightTicketSales.business.concretes;

import flightTicketSales.business.abstracts.CapacityService;
import flightTicketSales.entities.AnadoluJet;
import flightTicketSales.entities.Pegasus;
import flightTicketSales.entities.THY;

public class CapacityManager implements CapacityService{

	private THY thy;
	private Pegasus pegasus;
	private AnadoluJet anadoluJet;

	public CapacityManager(THY thy, Pegasus pegasus, AnadoluJet anadoluJet) {
		super();
		this.thy = thy;
		this.pegasus = pegasus;
		this.anadoluJet = anadoluJet;
	}

	public CapacityManager() {
		super();
	}

	public THY getThy() {
		return thy;
	}

	public void setThy(THY thy) {
		this.thy = thy;
	}

	public Pegasus getPegasus() {
		return pegasus;
	}

	public void setPegasus(Pegasus pegasus) {
		this.pegasus = pegasus;
	}

	public AnadoluJet getAnadoluJet() {
		return anadoluJet;
	}

	public void setAnadoluJet(AnadoluJet anadoluJet) {
		this.anadoluJet = anadoluJet;
	}
}
