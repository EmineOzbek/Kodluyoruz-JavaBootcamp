package flightTicketSales.entities;

public class THY extends Plane {

	@Override
	public String getCompanyName() {
		String companyName = "THY";
		return companyName;
	}

	@Override
	public int getCapacity() {
		int capacity = 200;
		return capacity;
	}

}
