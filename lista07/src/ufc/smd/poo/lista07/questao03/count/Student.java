package ufc.smd.poo.lista07.questao03.count;

public class Student {

    private static int numberOfStudents = 0;
	private String name;
	private int age;
	private long registrationNumber;

	public Student(String name, int age, long registrationNumber) {
		this.name = name;
		this.age = age;
		this.registrationNumber = registrationNumber;
		numberOfStudents++;
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

	public long getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(long registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	
	public static int getNumberOfStudents() {
        return numberOfStudents;
    }

}
