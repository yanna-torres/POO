package ufc.smd.poo.lista07.questao03.count;

public class CountApp {
	public static void main(String[] args) {
		
		Student s01 = new Student("Gilvan Maia", 20, 20003);
		Student s02 = new Student("Maria Maia", 20, 0156);
		Student s03 = new Student("João Maia", 22, 0560);
		
		System.out.println(Student.getNumberOfStudents());
	}

}
