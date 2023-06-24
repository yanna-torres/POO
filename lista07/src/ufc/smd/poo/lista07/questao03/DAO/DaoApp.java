package ufc.smd.poo.lista07.questao03.DAO;

import ufc.smd.poo.lista07.questao03.DAO.model.PersonDAO;

public class DaoApp {

	public static void main(String[] args) {
		PersonDAO personDAO = new PersonDAO();

		personDAO.getAll();
	}

}
