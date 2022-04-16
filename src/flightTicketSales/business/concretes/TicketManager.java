package flightTicketSales.business.concretes;

import flightTicketSales.business.abstracts.TicketService;
import flightTicketSales.entities.Plane;

public class TicketManager implements TicketService {

	private final int businessFare = 500;
	int takeTicketFare = 0;

	private PassengerManager passengerManager;
	private CapacityManager capacityManager;
	private InternationalFlightManager internationalFlightManager;

	public TicketManager(PassengerManager passengerManager, CapacityManager capacityManager,
			InternationalFlightManager internationalFlightManager) {
		super();
		this.passengerManager = passengerManager;
		this.capacityManager = capacityManager;
		this.internationalFlightManager = internationalFlightManager;
	}

	@Override
	public void takeTicket(Plane plane, int passengerCount) {

		if (capacityManager.getThy().getCapacity() >= passengerCount) {
			takeTicketFare = plane.getFare() * passengerCount;
			if (passengerManager.isCurrentPassengerBusiness(plane)) {
				internationalFlightManager.foodChoice(plane);
				takeTicketFare += businessFare;
			}

			System.out.println("Tebrikler, bilet satin alma isleminiz tamamlandı.");
			System.out.println("Tutar: " + takeTicketFare);

		} else {
			System.out.println("Ucak dolu!");
		}
	}

	@Override
	public void returnTicket(int ticketDay) {
		if (ticketDay < 4) {
			System.out.println("Bilet iadesi gerceklesmistir.");
		} else
			System.out.println(
					"Bilet iadesi gerceklesmedi! Bilet iadesi satisindan sonraki 3 gun icerisinde yapilmaktadir.");
	}
}
