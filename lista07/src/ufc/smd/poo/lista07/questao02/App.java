package ufc.smd.poo.lista07.questao02;

import java.util.Scanner;

import ufc.smd.poo.lista07.questao02.models.Student;

public class App {

	public static void main(String[] args) {

		Student myStudent = new Student("Gilvan Maia", 20, 20003);

		System.out.println("This is the student info");

		System.out.println("Name: " + myStudent.getName());
		System.out.println("Age: " + myStudent.getAge());
		System.out.println("Registration Number: " + myStudent.getRegistrationNumber());

		System.out.println("Opps! That information is not right? Let's update:");
		
		System.out.println("");
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the new name: ");
		String newName = scanner.nextLine();
		myStudent.setName(newName);

		System.out.println("");
		System.out.print("Enter the new age: ");
		int newAge = scanner.nextInt();
		myStudent.setAge(newAge);

		System.out.println("");
		System.out.print("Enter the new registration number: ");
		int newRegNumber = scanner.nextInt();
		myStudent.setRegistrationNumber(newRegNumber);

		scanner.close();

		System.out.println("");
		System.out.println("Updated student information:");
		System.out.println("Name: " + myStudent.getName());
		System.out.println("Age: " + myStudent.getAge());
		System.out.println("Registration Number: " + myStudent.getRegistrationNumber());

	}

}
