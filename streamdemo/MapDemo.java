package streamdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee(1, "ajay", 2000));
		employeeList.add(new Employee(2, "aniket", 3000));
		employeeList.add(new Employee(1, "ganesh", 4000));
		List<Integer> lent = employeeList.stream().map(Employee::getName).map(e->e.length()).collect(Collectors.toList());
		for(Integer i:lent) {
			System.out.println(i);
		}
	}

}
