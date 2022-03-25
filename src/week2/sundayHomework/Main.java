package week2.sundayHomework;

public class Main {

	public static void main(String[] args) {

		Apple apple = new Apple("Elma", 1.25, 50);
		Pear pear = new Pear("Armut", 2.5, 35);
		Cherry cherry = new Cherry("Kiraz", 3.15, 25);

		apple.stockControl();
		pear.stockControl();

		//Manavdan online alışveris yapılıyor. Musteri 1 kg elma, 2 kg armut almak istedi.
		apple.sales(1);
		pear.sales(2);

		apple.stockControl();
		pear.stockControl();

		//Online satısta musteri depoda kalan maldan fazla bir miktarda mal almak istedi.
		cherry.sales(29);

	}

}
