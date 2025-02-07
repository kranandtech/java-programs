package streamdemo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MaxByDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employeeList = new ArrayList<Employee>();
		employeeList.add(new Employee(1, "ajay", 2000));
		employeeList.add(new Employee(2, "Raju", 3000));
		employeeList.add(new Employee(1, "ganesh", 4000));
		Employee maxEmployee =employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))).orElse(null);
		System.out.println(maxEmployee.getName());

	}

}
