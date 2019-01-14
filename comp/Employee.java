package comp;

public class Employee implements Comparable<Employee>{

	private String name;
	private int employeeId;
	private int age;
	
	public Employee(int id, int age, String name) {
		this.age = age;
		this.employeeId = id;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Employee o) {
		return this.employeeId - o.employeeId;
	}

}
