package week2.saturdayHomework;

import java.util.Scanner;

public class MovieTicketSales {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double price = 40;

		System.out.print("Yasinizi girin: ");
		int age = input.nextInt();
		if (age < 18)
			price -= (price * 0.1);

		else if (age > 17 && age < 25)
			price -= (price * 0.05);

		System.out.print("Film turunu girin(korku, dram, komedi, bilimkurgu): ");
		String movieType = input.next();
		if (movieType.equalsIgnoreCase("korku"))
			price -= (price * 0.1);

		System.out.println("Bilet fiyati: " + price + "₺");

		input.close();
	}

}
