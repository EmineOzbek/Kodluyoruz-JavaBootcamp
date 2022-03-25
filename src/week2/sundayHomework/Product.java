package week2.sundayHomework;

public class Product {

	private String name;
	private int quantity;
	private double price;

	public Product(String name, double price, int quantity) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {

	}
	
	public void sales(int orderQuantity) {
		if (orderQuantity > this.quantity) {
			System.out.println("Hatali giris! Alabileceginiz en fazla " + this.name + " miktari: " + this.quantity + " kg'dır.");
		} else {
			System.out.println("Siparisiniz olusturuldu. Siparis tutari: " + (orderQuantity * price) + " ₺");
			this.quantity -= orderQuantity;	  //Siparis olusturulduktan sonra stok guncellendi.
		}
	}

	public void stockControl() {
		System.out.println("Stoktaki " + this.name + " miktari: " + quantity + " kg");
	}

}
