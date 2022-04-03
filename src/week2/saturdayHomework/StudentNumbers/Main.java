package week2.saturdayHomework.StudentNumbers;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Student> studentList = generateStudentList();
		femaleStudentNumbers(studentList);
		maleStudentNumbers(studentList);

	}

	private static List<Student> generateStudentList() {
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("Emine", 1, Gender.FEMALE));
		studentList.add(new Student("Ceren", 2, Gender.FEMALE));
		studentList.add(new Student("Fatih", 3, Gender.MALE));
		studentList.add(new Student("Kaan", 4, Gender.MALE));
		studentList.add(new Student("Engin", 5, Gender.MALE));

		return studentList;

	}

	private static void femaleStudentNumbers(List<Student> studentList) {
		System.out.println("Numbers of female students");
		for (Student s : studentList) {
			if (s.getGender() == Gender.FEMALE)
				System.out.println(s.getNumber() + " --> " + s.getName());
		}
	}

	private static void maleStudentNumbers(List<Student> studentList) {
		System.out.println("Numbers of male students");
		for (Student s : studentList) {
			if (s.getGender() == Gender.MALE)
				System.out.println(s.getNumber() + " --> " + s.getName());

		}

	}

}
