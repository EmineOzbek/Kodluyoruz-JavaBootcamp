package flightTicketSales.entities;

public class AnadoluJet extends Plane {

	@Override
	public String getCompanyName() {
		String companyName = "Andolu Jet";
		return companyName;
	}

	@Override
	public int getCapacity() {
		int capacity = 180;
		return capacity;
	}
}
