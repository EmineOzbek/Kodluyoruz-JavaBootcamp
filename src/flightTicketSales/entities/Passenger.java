package flightTicketSales.entities;

public class Passenger {

	private int id;
	private String name;
	private int age;
	private int seatNo;

	public Passenger(int id, String name, int age, int seatNo) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.seatNo = seatNo;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}
}
