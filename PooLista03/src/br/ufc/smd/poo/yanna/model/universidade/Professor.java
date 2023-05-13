package br.ufc.smd.poo.yanna.model.universidade;

public class Professor {
	private long siape;

	private String name;

	private String cpf;

	private String email;

	private String address;

	private long phoneNumber;

	private float wage;
	
	private Departament departament;

	public Professor(long siape, String name, String cpf, String email, String address, long phoneNumber, float wage) {
		super();
		this.siape = siape;
		this.name = name;
		this.cpf = cpf;
		this.email = email;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.wage = wage;
		System.out.println("[PROFESSOR] '"+ this.name + "' was created succefully");
	}

	public Professor(long siape, String name, String cpf, String email, String address, long phoneNumber, float wage, Departament departament) {
		super();
		this.siape = siape;
		this.name = name;
		this.cpf = cpf;
		this.email = email;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.wage = wage;
		System.out.println("[PROFESSOR] '"+ this.name + "' was created succefully");
		this.departament = departament;
		if (departament.isProfessor(this) == false) {
			departament.addProfessor(this);
		}
	}

	public long getSiape() {
		return siape;
	}

	public void setSiape(long siape) {
		this.siape = siape;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public float getWage() {
		return wage;
	}

	public void setWage(float wage) {
		this.wage = wage;
	}

	public Departament getDepartament() {
		return departament;
	}

	public void setDepartament(Departament departament) {
		if(this.departament == null) {
			System.out.println("[PROFESSOR] Departament of '"+ this.name + "' was updated succefully from "+ null +" to " + departament.getAcronym() + "!");
		} else {
			System.out.println("[PROFESSOR] Departament of '"+ this.name + "' was updated succefully from "+ this.departament.getAcronym() +" to " + departament.getAcronym() + "!");
		}
		this.departament = departament;
	}


}
