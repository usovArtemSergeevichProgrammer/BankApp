package model;

public class Employee extends Client {

	private String position;
	private String departmentName;
	private double salary;

	public Employee(long uid, String name, String lastName, Account acc) {
		super(uid, name, lastName, acc);

	}

	public Employee(long uid, String name, String lastName, Account acc, String position, String departmentName,
			double salary) {
		this(uid, name, lastName, acc);
		this.position = position;
		this.departmentName = departmentName;
		this.salary = salary;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
