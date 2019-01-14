package comp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee emp1 = new Employee(2,40,"John");
		List<Employee> empList = new ArrayList<>();
		
		empList.add(emp1);
		empList.add(new Employee(14, 35,"Jordan"));
		empList.add(new Employee(6, 15,"Jordan"));
		empList.add(new Employee(1, 25,"Ralf"));
		empList.add(new Employee(11, 75,"Donald"));
		empList.add(new Employee(3, 30,"Zach"));

		for(Employee emp: empList) {
			System.out.println("id = " + emp.getEmployeeId() + ";  Age = "+emp.getAge() + ";  Name = "+ emp.getName());
		}
		
		System.out.println("--------------Comparable by ID---------------------");
		Collections.sort(empList);
		
		for(Employee emp: empList) {
			System.out.println("id = " + emp.getEmployeeId() + ";  Age = "+emp.getAge() + ";  Name = "+ emp.getName());
		}
		
		
		System.out.println("--------------Comparator by Age---------------------");
		
		Collections.sort(empList, new EmployeeSortByAge());
		
		for(Employee emp: empList) {
			System.out.println("id = " + emp.getEmployeeId() + ";  Age = "+emp.getAge() + ";  Name = "+ emp.getName());
		}
		
		
		System.out.println("--------------Comparator by Name---------------------");
		
		Collections.sort(empList, new EmployeeSortByName());
		
		for(Employee emp: empList) {
			System.out.println("id = " + emp.getEmployeeId() + ";  Age = "+emp.getAge() + ";  Name = "+ emp.getName());
		}
		
	}

}
