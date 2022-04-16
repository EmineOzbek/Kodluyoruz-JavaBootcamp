package flightTicketSales.entities;

public class Pegasus extends Plane {

	@Override
	public String getCompanyName() {
		String companyName = "Pegasus";
		return companyName;
	}

	@Override
	public int getCapacity() {
		int capacity = 250;
		return capacity;
	}

}
