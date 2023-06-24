package ufc.smd.poo.lista07.questao03.DAO.model;

import java.util.List;

import ufc.smd.poo.lista07.questao02.models.Person;

public class PersonDAO extends DAO<Person> {

	public boolean insert(Person obj) {
		String dbUrl = DAO.URL;
		System.out.println(dbUrl);
		return false;
	}

	public Person getOne(int id) {
		String dbUrl = DAO.URL;
		System.out.println(dbUrl);
		return null;
	}

	public List<Person> getAll() {
		String dbUrl = DAO.URL;
		System.out.println(dbUrl);
		return null;
	}

	public boolean update(Person obj) {
		String dbUrl = DAO.URL;
		System.out.println(dbUrl);
		return false;
	}

	public boolean delete(int id) {
		String dbUrl = DAO.URL;
		System.out.println(dbUrl);
		return false;
	}

}
