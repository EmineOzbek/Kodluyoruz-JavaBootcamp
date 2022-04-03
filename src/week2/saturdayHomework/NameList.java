package week2.saturdayHomework;

public class NameList {

	public static void main(String[] args) {

		String names[] = { "Murat", "Ahmet", "Mehmet" };

		for (int i = 1; i <= names.length; i++) {
			System.out.println(i + ". " + names[i - 1]);
		}
	}
}