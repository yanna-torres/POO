package br.ufc.smd.poo.yanna.model.universidade;

public class Course {

	private long code;

	private String name;

	private String description;

	private String shift;

	private long totalHours;
	
	private Departament departament;

	public Course(long code, String name, String description, String shift, long totalHours) {
		super();
		this.code = code;
		this.name = name;
		this.description = description;
		this.shift = shift;
		this.totalHours = totalHours;
		System.out.println("[COURSE] '" + this.name +"' was created succefully!");
	}
	
	public Course(long code, String name, String description, String shift, long totalHours, Departament departament) {
		super();
		this.code = code;
		this.name = name;
		this.description = description;
		this.shift = shift;
		this.totalHours = totalHours;
		this.departament = departament;
		System.out.println("[COURSE] '" + this.name +"' was created succefully!");
		if (departament.isCourse(code) == false) {
			departament.addCourse(this);
		}
	}

	public long getCode() {
		return code;
	}

	public void setCode(long code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getShift() {
		return shift;
	}

	public void setShift(String shift) {
		this.shift = shift;
	}

	public long getTotalHours() {
		return totalHours;
	}

	public void setTotalHours(long totalHours) {
		this.totalHours = totalHours;
	}

	public Departament getDepartament() {
		return departament;
	}

	public void setDepartament(Departament departament) {
		if (this.departament == null) {
			System.out.println("[Course] Departament of '"+ this.name + "' was updated succefully from "+ null +" to " + departament.getAcronym() + "!");
		} else {
			System.out.println("[Course] Departament of '"+ this.name + "' was updated succefully from "+ this.departament.getAcronym() +" to " + departament.getAcronym() + "!");
		}
		this.departament = departament;
	}
	
}
