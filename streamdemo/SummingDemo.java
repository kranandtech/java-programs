package streamdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SummingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee(1, "ajay", 2000));
		employeeList.add(new Employee(2, "Raju", 3000));
		employeeList.add(new Employee(1, "ganesh", 4000));
//		double total = employeeList.stream().collect(Collectors.summingDouble(e->e.getSalary()));
		double total = employeeList.stream().collect(Collectors.summingDouble(Employee::getSalary));
		System.out.println(total);
	}

}
