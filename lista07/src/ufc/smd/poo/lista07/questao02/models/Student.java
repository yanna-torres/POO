package ufc.smd.poo.lista07.questao02.models;

public class Student extends Person {
	
	private long registrationNumber;

	public Student(String name, int age, long registrationNumber) {
		super(name, age);
		this.registrationNumber = registrationNumber;
	}

	public long getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(long registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	
}
