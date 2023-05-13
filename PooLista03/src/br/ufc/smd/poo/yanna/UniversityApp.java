package br.ufc.smd.poo.yanna;

import br.ufc.smd.poo.yanna.model.universidade.*;

public class UniversityApp {

	public static void main(String[] args) {
		University ufc = new University("Universidade Federal do Ceara","UFC", "Benfica", 1954);
		ufc.showDepartaments();
		Departament iuvi = new Departament("Instituto UFC Virtual","IUVI", 026541, null, ufc);
		Departament ica = new Departament("Instituto de Cultura e Arte","ICA", 65461, null, ufc);
		ufc.addNewDepartament(iuvi);
		ufc.addNewDepartament(ica);
		System.out.println("");
		ufc.showDepartaments();
		
		Professor gilvan = new Professor(06746, "Gilvan Maia", null, "gilvan@gmail.com", "Rua X", 844558481, 20000, iuvi);
		iuvi.addProfessor(gilvan);
		iuvi.addProfessor(gilvan);
		System.out.println("");
		iuvi.addProfessor(512022, "Ticiana Linhares", null, "ticiana@gmail.com", "Rua Y", 154454155, 20000);
		iuvi.addProfessor(512022, "Ticiana Linhares", null, "ticiana@gmail.com", "Rua Y", 154454155, 20000);
		iuvi.showProfessors();

		Course smdD = new Course(5115, "SMD - Diuno", null, "Diurno", 1992, iuvi);
		iuvi.addCourse(6465, "SMD - Noturno", "Noturno", 1992);
		iuvi.addCourse(smdD);
		System.out.println("");
		iuvi.showCourses();
	}

}
