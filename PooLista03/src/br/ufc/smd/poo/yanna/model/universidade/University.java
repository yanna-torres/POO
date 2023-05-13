package br.ufc.smd.poo.yanna.model.universidade;

import java.util.ArrayList;
import java.util.List;


public class University {
		private String name;
		
		private String acronym;

		private String address;

		private long foundingYear;
		
		private List<Departament> departaments;

		public University(String name, String acronym, String address, long foundingYear) {
			super();
			this.name = name;
			this.address = address;
			this.foundingYear = foundingYear;
			this.acronym = acronym;
			this.departaments = new ArrayList<Departament>();
			System.out.println("[UNIVERSITY] '"+ this.acronym + "' was created succefully");
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			if (name == null) {
				throw new NullPointerException("null name is not allowed");
			}
			this.name = name;
		}

		public String getAcronym() {
			return acronym;
		}

		public void setAcronym(String acronym) {
			if (acronym == null) {
				throw new NullPointerException("null name is not allowed");
			}
			this.acronym = acronym;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			if (address == null) {
				throw new NullPointerException("null name is not allowed");
			}
			this.address = address;
		}

		public long getFoundingYear() {
			return foundingYear;
		}

		public void setFoundingYear(long foundingYear) {
			this.foundingYear = foundingYear;
		}
		
		/**
		 * Add a new Departament of the University
		 * 
		 * @param name Name of the departament. Can't be *null*!
		 * @param code Code of the departament.
		 * @param description Description of the main actions taken inside the departament. Like main research areas, etc.  
		 */
		public void addNewDepartament(String name, String acronym, long code, String description) {
			if (name == null) {
				throw new NullPointerException("null name is not allowed");
			}
			
			if (isDepartament(code)) {
				System.err.println("[UNIVERSITY] Departament '"+ name + "' was already on the departaments list of " + this.acronym + ". It wasn't added.");
			} else {
				Departament departament = new Departament(name, acronym, code, description, this);
				departaments.add(departament);
				System.out.println("[UNIVERSITY] Departament '"+ acronym + "' added succefully to the departaments list of " + this.acronym + "!");
				if (departament.getUniversity() != this) {
					departament.setUniversity(this);
				}
			}
		}

		
		/**
		 * Add a new Departament of the University
		 * 
		 * @param departament New departament of the University. Can't be *null*!
		 */
		public void addNewDepartament(Departament departament) {
			if (departament == null) {
				throw new NullPointerException("null departament is not allowed");
			}
			if (isDepartament(departament)) {
				System.err.println("[UNIVERSITY] Departament '"+ departament.getAcronym() + "' was already on the departaments list of " + this.acronym + ". It wasn't added.");
			} else {
				departaments.add(departament);
				System.out.println("[UNIVERSITY] Departament '"+ departament.getAcronym() + "' added succefully to the departaments list of " + this.acronym + "!");
				if (departament.getUniversity() != this) {
					departament.setUniversity(this);
				}
			}
		}

		public List<Departament> getDepartaments() {
			return departaments;
		}
		
		public void showDepartaments() {
			if (this.departaments.isEmpty()) {
				System.out.println("[UNIVERSITY] '" + this.acronym + "' doesn't have departaments connected");
			} else {
				System.out.println("[UNIVERSITY] Departaments of " + this.acronym + ":");
		        for (Departament departament : departaments) {
		            System.out.println("             " + departament.getName());
		        }
		        System.out.println("  ");
			}
		}
		
		public void removeDepartament(Departament departament) {
			if (this.isDepartament(departament)) {
				System.err.println("[UNIVERSITY] Departament '"+ departament.getAcronym() + "' was not on the departaments list of " + this.acronym + ". Nothing was done.");
			} else {
				this.departaments.remove(departament);
				System.out.println("[UNIVERSITY] Departament '"+ departament.getAcronym() + "' was removed succefully to the departaments list of " + this.acronym + "!");
				departament.setUniversity(null);
				// TODO switch all professors and courses to a new departament
			}
		}
		
		public boolean isDepartament(long code) {
			if (departaments.isEmpty() == false) {
				for(Departament departament: departaments) {
					if (departament.getCode() == code) {
						return true;
					}
				}
			}
			return false;
		}
		
		public boolean isDepartament(Departament departament) {
			if (departaments.contains(departament) == false) {
				return isDepartament(departament.getCode());
			} else {
				return true;
			}
		}

}
