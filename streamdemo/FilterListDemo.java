package streamdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee(1, "ajay", 2000));
		employeeList.add(new Employee(2, "aniket", 3000));
		employeeList.add(new Employee(1, "ganesh", 4000));
		List<Employee> l1 = employeeList.stream().filter(e -> e.getName().startsWith("a")).collect(Collectors.toList());
		for(Employee le:l1) {
			System.out.println(le.getName());
		}
	}

}
