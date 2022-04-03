package week2.saturdayHomework.StudentNumbers;

public class Student {

	 final String name;
	 final int number;
	 final Gender gender;

	public Student(String name, int number, Gender gender) {
		this.name = name;
		this.number = number;
		this.gender = gender;

	}

	public String getName() {
		return name;
	}

	public int getNumber() {
		return number;
	}

	public Gender getGender() {
		return gender;
	}
}